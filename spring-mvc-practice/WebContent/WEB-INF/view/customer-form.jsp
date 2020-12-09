<%@ taglib  prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Customer Registration Form</title>
		<style type="text/css">
			.error {
				color:red;
			}
		</style>
	</head>
	<body>
	 	<h2>Customer Registration Form</h2>
	 	<h6><i>Fill out the form. Asterisk(*) means required.</i></h6>
	 	<br>
	 	<form:form action="processForm" modelAttribute="customer">
	 		First Name: <form:input path="firstName"/>
	 		<br>
	 		Last Name(*): <form:input path="lastName"/>
	 		<form:errors path="lastName" cssClass="error"></form:errors>
	 		<br>
	 		<input type="submit" value="Submit"/>
	 	</form:form>
	</body>
</html>