<%@page import="java.net.URLEncoder"%>
<html>
<head>
<title>Confirmation</title>
</head>


<%

	//read form data
	String favLang = request.getParameter("favoriteLanguage");

	//encode the  String and add to the cookie
	favLang = URLEncoder.encode(favLang,"UTF-8");
	
	//create the cookie
	 Cookie theCookie = new Cookie("myApp.favoriteLanguage",favLang);
	
	//set the life span
	theCookie.setMaxAge(60*60*24*365);
	
	//send cookie to browser
	response.addCookie(theCookie);
	
	
%>

	
<body>

Thanks! we set your favorite language to: ${param.favoriteLanguage}

<br/><br/>
<a href="cookies-homepage.jsp">Return to Homepage</a>
</body>
</html>