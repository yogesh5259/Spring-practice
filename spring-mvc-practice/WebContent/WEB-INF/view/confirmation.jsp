<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<title>Confirmation message</title>
</head>

<body>
	<h2>Student Form Verification</h2>
	<br>
	Name of Student: ${student.firstName} ${student.lastName}
	<br>
	Country: ${student.country}
	<br>
	Favorite Language: ${student.favoriteLanguage}
	<br>
	<ul>
		<c:forEach var="temp" items="${student.operatingSystems}">
		<li>${temp}</li>
		</c:forEach>
	</ul>
</body>
</html>