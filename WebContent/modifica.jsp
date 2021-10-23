<%@page import="it.prova.model.Televisione"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modifica televisione</title>
</head>
<body>
	<%
	Televisione televisioneProvieneDaServlet = (Televisione) request.getAttribute("abitanteDaInviareAPaginaDettalio");%>

	<% if(request.getAttribute("messaggioDiErrore") != null){ %>
		<p style="color: red; text-align: center"><%=request.getAttribute("messaggioDiErrore") %></p>
	<%  }else{ %>
	<%}    %>
	<h1 style=" text-align: center">Stai per modificare: </h1>
	<form style=" text-align: center" action="ExecuteModificaServlet" method="post">
	
		<input placeholder="Marca..." type="text" name="marcaInput" value="<%= televisioneProvieneDaServlet.getMarca() %>"> &nbsp
		<input placeholder="Modello..." type="text" name="modelloInput" value="<%= televisioneProvieneDaServlet.getModello() %>">&nbsp
		<input placeholder="Prezzo..." type="text" name="prezzoInput" value="<%= televisioneProvieneDaServlet.getPrezzo() %>">&nbsp
		<input placeholder="Codice seriale..." type="text" name="codiceInput" value="<%= televisioneProvieneDaServlet.getNumeroSeriale() %>">&nbsp
		
		<input type="hidden"name="idTelevisore" value="<%=televisioneProvieneDaServlet.getIdTelevisione()%>">
		
		<input type="submit" value="conferma">
		
	</form>
</body>
</html>