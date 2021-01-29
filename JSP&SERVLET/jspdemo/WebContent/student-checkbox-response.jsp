<html>



<head>

<title>Student Confirmation</title>
</head>



<body>

	The Student is confirmed: ${param.firstName} ${param.lastName}

	<br />
	<br /> Favorite Programming Languages:
	<br />
	<!-- display list of favorite languages -->

	<ul>
		<%
		String[] langs = request.getParameterValues("favoriteLanguages");

		if (langs != null) {
			for (String s : langs) {
				out.println("<li>" + s + "</li>");
			}
		}
		%>

	</ul>


</body>


</html>