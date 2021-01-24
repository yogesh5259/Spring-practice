<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<title>Save Customer</title>

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">

</head>

<body>
	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>
	<div id="container">
		<h3>Save Customer</h3>
		<form:form action="saveCustomer" modelAttribute="customer"
			method="POST">

			<!-- need to associate this data with customer id -->
			<form:hidden path="id" />

			<table>
				<tbody>
					<tr>
						<td><label>First Name: </label></td>
						<td><form:input path="firstName" /></td>
						<td><form:errors path="firstName" cssClass="errors" /></td>
					</tr>
					<tr>
						<td><label>Last Name: </label></td>
						<td><form:input path="lastName" /></td>
						<td><form:errors path="lastName" cssClass="errors" /></td>

					</tr>
					<tr>
						<td><label>Email: </label></td>
						<td><form:input path="email" /></td>
						<td><form:errors path="email" cssClass="errors" /></td>

					</tr>

					<tr>
						<td><label></label></td>
						<td><input type="submit" value="save" class="save" /></td>
					</tr>

				</tbody>

			</table>

		</form:form>
		<div style="">
			<p>
				<a href="${pageContext.request.contextPath}/customer/list"> Back
					to List</a>
			</p>
		</div>
	</div>
</body>

</html>