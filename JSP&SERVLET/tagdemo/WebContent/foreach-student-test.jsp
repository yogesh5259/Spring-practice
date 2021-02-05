<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.* , com.luv2code.jsp.tagdemo.Student"%>

<%
//just create array list
List<Student> data = new ArrayList<>();

data.add(new Student("John", "Doe", false));
data.add(new Student("Maxwell", "jomson", false));
data.add(new Student("Mary", "Public", true));

pageContext.setAttribute("myStudent", data);
%>

<html>

<body>

	<table border="1">
		<thead>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Gold Customer</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="tempStudent" items="${myStudent}">

				<tr>
					<td>${tempStudent.firstName}</td>
					<td>${tempStudent.lastName}</td>
					<td>${tempStudent.goldCustomer}</td>

				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>

</html>