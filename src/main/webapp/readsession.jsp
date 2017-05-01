<%@page import="java.time.LocalDateTime"%>
<%@page import="javax.servlet.http.HttpSession" %>
  

<html>
<head><title>First JSP</title></head>
<body>
  <%
  	
  	LocalDateTime localDateTime = LocalDateTime.now();
  %>
  <h2> Welcome to SpringBoot-Struts2-Oauth Application </h2>
  <h3> Current data and time:  <%= localDateTime %></h3>
  
  <%  
 	    session = request.getSession();
  		String sessionData = (String)session.getAttribute("Testing");
  		
  %>
  <h1> Data in the session "<%= sessionData  %> "</h1>
  
</body>
</html>