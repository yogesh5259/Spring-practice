<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>


<body>

<c:set var="data" value="Singapore,London,Tokyo,Mumbai"/>

<h2>Split Demo</h2>

<c:set var="citiesArray" value="${fn:split(data,',')}"/>

<c:forEach var="tempCity" items="${citiesArray}">
	
	${tempCity}
	<br/><br/>
</c:forEach>


<br/>
<h2>Join Demo</h2>

<c:set var="fun" value="${fn:join(citiesArray,'*')}"/>

${fun}
<br/>

</body>

</html>