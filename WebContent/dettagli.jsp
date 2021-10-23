<%@page import="it.prova.model.Televisione"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dettagli</title>
</head>
<body>
	Dettagli Televisore: 
	<%
	Televisione televisoreProvieneDaServlet = 
	(Televisione) request.getAttribute("televisioneDaInviareAPaginaDettalio");%>
	"Il nome appena inserito è: <br> <br>
	<%= "MARCA: "+ televisoreProvieneDaServlet.getMarca()%> <br>
	<%= "MODELLO: "+ televisoreProvieneDaServlet.getModello()%> <br>
	<%= "PREZZO: "+ televisoreProvieneDaServlet.getPrezzo()+"$"%> <br>
	<%= "CODICE SERIALE: "+ televisoreProvieneDaServlet.getNumeroSeriale()%>
	<br>
	<a href="cerca.jsp">Indietro</a>
	
</body>
</html>