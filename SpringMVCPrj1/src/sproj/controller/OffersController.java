package sproj.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sproj.dao.Offer;
import sproj.service.OffersService;

@Controller
public class OffersController {

	private OffersService offersService;

	@Autowired
	public void setOffersService(OffersService offersService) {
		this.offersService = offersService;
	}

	@RequestMapping("/offers")
	public String showHome(Model model) {

		List<Offer> offerList = offersService.getCurrent();

		model.addAttribute("offersList", offerList);

		return "offers";
	}

	@RequestMapping("/createoffer")
	public String createOffer(Model model) {

		model.addAttribute("offer", new Offer());
		
		return "createoffer";
	}
	
	@RequestMapping(value="/docreate", method=RequestMethod.POST)
	public String doCreate(Model model, @Valid Offer offer, BindingResult result) {
		if(result.hasErrors()){
			List<ObjectError> obj = result.getAllErrors();
			for(ObjectError objects : obj){
				System.out.println(objects.getDefaultMessage());
			}
			return "createoffer";
		}
				
		offersService.createOffer(offer);
		return "offercreated";
	}

}
