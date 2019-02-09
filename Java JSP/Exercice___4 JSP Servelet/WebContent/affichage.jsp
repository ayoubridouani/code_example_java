<%@page import="mvc.Appreciation"%>
<%@page import="mvc.MetierImpl"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>
  <%
  	Appreciation contact = (Appreciation)request.getAttribute("contact");
  MetierImpl impl = new MetierImpl();
  Date obDate = new Date();
  SimpleDateFormat obDateFormat = new SimpleDateFormat("yyyy-MM-dd");

  impl.ajouter(new Appreciation("ee","mm",obDate/*contact.getNom(),contact.getAppreciation(),contact.getDate()*/));
  
  %>
  <%= contact.getNom() %><br>
  <%= contact.getAppreciation() %><br>
  <%= contact.getDate() %><br>
</h1>
</body>
</html>