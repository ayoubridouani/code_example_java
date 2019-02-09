<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.SQLException"%>

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
       if(request.getParameter("nom") != null){
    	   try{
    	   Class.forName("com.mysql.jdbc.Driver");
    	   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/formjsp","root","");
    	   PreparedStatement stmt = con.prepareStatement("INSERT INTO `form`(`nom`, `prenom`, `sexe`, `langue`) VALUES (?,?,?,?)");
    	   
			String nom = request.getParameter("nom");
			String prenom = request.getParameter("prenom");
			String sexe = request.getParameter("sexe");
			String[] langue = request.getParameterValues("langue");
		    
			out.println("nom: " + nom + "<br/>");
			out.println("prenom: " + prenom + "<br/>");
			out.println("sexe: " + sexe + "<br/>");
			out.println("langue: ");
			String langu = "";
			for(int i=0;i<langue.length;i++){
				langu += langue[i] + "," ;
			}
			out.println(langu);
			
			stmt.setString(1,nom);
			stmt.setString(2,prenom);
			stmt.setString(3,sexe);
			stmt.setString(4,langu);
			stmt.execute();
			stmt.close();
    	   }catch(SQLException e){
    		   out.println(e.getMessage());
    	   }
			
       }else{
    	   response.sendRedirect("index.html");
       }
       %>
	</body>
</html>