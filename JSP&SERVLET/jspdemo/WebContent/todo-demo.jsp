<%@ page import="java.util.*" %>

<html>

<body>

<!-- Step 1: Create HTML form -->

<form action="todo-demo.jsp">

Add new item: <input type="text" name="theItem" />

 <input type="submit" value="submit"/>

</form>

<%-- 
<br>
Item entered: <%= request.getParameter("theItem") %>
 --%>
 
 
<!-- Step 2: Add new Item to "TO DO" List -->
<%
	//get the TO DO items from the collection
	
	 List<String> items = (List<String>) session.getAttribute("myToDoList");
	
	//If the TO DO items doesn't exist, then create a new one
	if(items == null){
		items = new ArrayList<String>();
		session.setAttribute("myToDoList", items);
	}
	
	// see if there is form data to add
	String theItem = request.getParameter("theItem");
	if(theItem != null && theItem.length() > 0){
		items.add(theItem);
	}
%>

<!-- step 3: Display all "TO DO" item from session -->
<hr>

<b>ToDo List Items:</b><br/>
<ol>
<%
 
	for(String temp : items){
		out.println("<li>" + temp + "</li>");
	}

%>

</ol>
	  
	 
	

</body>

</html>