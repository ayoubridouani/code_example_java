<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
	   
       <%
       if(request.getParameter("nombre1") != null){
			int val1 = Integer.parseInt(request.getParameter("nombre1"));
			int val2 = Integer.parseInt(request.getParameter("nombre2"));
			String oper = request.getParameter("operateur");
			
			int calc ;
			
			if(oper.equals("+"))   calc = val1 + val2;
			else if(oper.equals("-"))   calc = val1 - val2;
			else if(oper.equals("*"))   calc = val1 * val2;
			else  calc = val1 / val2;
			
			out.println("<h1>" + calc + "</h1>");
       }else{
    	   response.sendRedirect("index.html");
       }
       %>
	</body>
</html>