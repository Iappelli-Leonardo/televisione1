<%@page import="it.prova.model.Televisione"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Rimozione televisione</title>
</head>
<body>
	<%
Televisione televisoreProvieneDaServlet = (Televisione) request.getAttribute("televisoreDaInviareAPaginaDettaglio");
%>
	Stai per eliminare: <br> <br>
	<%= "MARCA: "+ televisoreProvieneDaServlet.getMarca()%> <br>
	<%= "MODELLO: "+ televisoreProvieneDaServlet.getModello()%> <br>
	<%= "PREZZO: "+ televisoreProvieneDaServlet.getPrezzo()+"$"%> <br>
	<%= "CODICE SERIALE: "+ televisoreProvieneDaServlet.getNumeroSeriale()%>
	<br> <br>
	<form action="ExecuteRimuoviServlet" method="post">
		<input type="hidden" name="idTelevisore" value="<%=televisoreProvieneDaServlet.getIdTelevisione()%>">
		<input type="submit" value="conferma">
	</form>
	<br> <br>
	<a href="cerca.jsp">Indietro</a>
	 
	 
	 
</body>
</html>