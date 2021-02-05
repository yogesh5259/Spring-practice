<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	String[] cities = {"mumbai","singapore", "philidelphia"};
	pageContext.setAttribute("myCities", cities);

%>

<html>

<body>

<c:forEach var="temp" items="${myCities}">

	${temp} <br/>

</c:forEach>

</body>



</html>