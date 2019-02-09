<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Waddup</h1>

	<form method="GET" action="UneServelet">
		<table>
			<tr>
				<td>Nom : </td>
				<td><input type="text" name="nom"></td>
			</tr>
			<tr>
				<td>Votre Appréciation : </td>
				<td><textarea name="appreciation" rows="3" cols="40"></textarea></td>
			</tr>
			<tr>
				<td><input type="submit" value="OK"></td><td><input type="reset" value="Annuler"></td>
			</tr>
		</table>
	</form>
</body>
</html>