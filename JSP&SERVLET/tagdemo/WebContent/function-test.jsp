<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>

<body>


<c:set var="data" value="Yogesh" />

The length of the String ${data} : ${fn:length(data)}
<br/>
<br/>
Uppercase version of the string ${data} : ${fn:toUpperCase(data)}

<br/><br/>

Does the string  ${data} start with Yo: ${fn:startsWith(data,"Yo")}

</body>

</html>
