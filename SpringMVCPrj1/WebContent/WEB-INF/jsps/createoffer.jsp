<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sf:form action="${pageContext.request.contextPath}/docreate" method="post" commandName="offer">
<table>
<tr><td>Name:</td><td><sf:input type="text" name="name" path="name"/><br /><sf:errors path="name"></sf:errors></td></tr>
<tr><td>Email:</td><td><sf:input type="text" name="email" path="email"/><br /><sf:errors path="email"></sf:errors></td></tr>
<tr><td>Your Offer:</td><td><sf:textarea rows="" cols="" name="offerdesc" path="offerdesc"/></td></tr>
<tr><td></td><td><input type="submit" value="Create Advert"></td></tr>
</table>
</sf:form>
</body>
</html>