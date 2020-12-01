<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE unspecified PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Student Form</title>
</head>
<body>
	<h2>Submit the form</h2>
	<form:form action="processForm" modelAttribute="student">
		
		First Name: <form:input path="firstName"/>
		<br><br>
		Last Name: <form:input path="lastName"/>
		<br><br>
		Country: <form:select path="country">
			<form:option value="BR" label="Brazil"/>
			<form:option value="IN" label="India"/>
			<form:option value="Fr" label="France"/>			
			<form:option value="GE" label="Germany"/>
		</form:select>
		<br>
		Favorite Language: 
		Java<form:radiobutton value="Java" path="favoriteLanguage"/>
		C#<form:radiobutton value="C#" path="favoriteLanguage"/>
		Python<form:radiobutton value="Python" path="favoriteLanguage"/>
		Ruby<form:radiobutton value="Ruby" path="favoriteLanguage"/>
		<br>
		
		Operating Systems:
		Linux <form:checkbox path="operatingSystems" value="Linux"/>
		Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
		Ms Windows: <form:checkbox path="operatingSystems" value="Ms Windows"/>
		
		<br>
		<input type="submit" value="submit"/>
	</form:form>
</body>
</html>