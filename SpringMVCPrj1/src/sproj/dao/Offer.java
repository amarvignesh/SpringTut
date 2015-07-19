package sproj.dao;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Offer {

	private int id;
	
	@NotNull
	@Size(min=5,max=50, message="Enter a proper username")
	private String name;
	
	@Pattern(regexp=".*\\@.*\\..*", message="Enter a valid email address")
	private String email;
	
	@NotNull
	private String offerdesc;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOfferdesc() {
		return offerdesc;
	}

	public void setOfferdesc(String offerdesc) {
		this.offerdesc = offerdesc;
	}

	public Offer() {

	}

	public Offer(int id, String name, String email, String offerdesc) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.offerdesc = offerdesc;
	}

	@Override
	public String toString() {
		return "Offer [id=" + id + ", name=" + name + ", email=" + email
				+ ", offerdesc=" + offerdesc + "]";
	}
	
	

}
