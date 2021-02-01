<%@page import="java.net.URLDecoder"%>
<html>
<body>

<h3>Training portal</h3>
<!-- read the favorite programming language cookie -->
<%
	//default value if there is no cookies
	String favLang = "java";

	//get cookies form the browser
	Cookie[] theCookies = request.getCookies();
	
	
	//find our favorite language cookies
	if(theCookies != null){
		for(Cookie tempCookie : theCookies){
			if(("myApp.favoriteLanguage").equals(tempCookie.getName())){
				favLang = URLDecoder.decode(tempCookie.getValue(),"UTF-8");
				break;
			}
		}
	}
%>
  
 <!-- now show personalized page -->

<h4>New Books for <%=favLang%> </h4>
<ul>
<li>blah blah blah</li>
<li>blah blah blah</li>
</ul>

<h4>New News Report for <%=favLang%> </h4>
<ul>
<li>blah blah blah</li>
<li>blah blah blah</li>
</ul>

<h4>Hot Jobs for <%=favLang%> </h4>
<ul>
<li>blah blah blah</li>
<li>blah blah blah</li>
</ul>

<hr>
<a href="cookies-personalize-form.jsp">Personalize this page</a>



</body>

</html>