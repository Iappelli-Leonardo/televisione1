<%@page import="it.prova.model.Televisione"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Risultati</title>
</head>
<body>
	<style type="text/css">
table, th, td {
	border: 1px solid black;
}

th, td {
	padding: 10px;
}

.center {
	margin-left: auto;
	margin-right: auto;
}
</style>

</head>
<body>
	<table class="center">
		<thead>
			<tr>
				<th>Marca</th>
				<th>Modello</th>
				<th>Azioni</th>
			</tr>
		</thead>

		<%
		List<Televisione> listaDaServlet = (List<Televisione>) request.getAttribute("listTelevisoriAttributeName");
		for (Televisione televisioneItem : listaDaServlet) {
		%>
		<tr>
			<td><%=televisioneItem.getMarca() %></td>
			<td><%=televisioneItem.getModello() %></td>
			<td>
			<a href="DettagliServlet?idDaInviareComeParametro=<%=televisioneItem.getIdTelevisione()%>">Dettaglio</a>
			<a href="PrepareModificaServlet?idDaInviareComeParametro=<%=televisioneItem.getIdTelevisione()%>">Modifica</a>
			<a href="PrepareRimuoviServlet?idDaInviareComeParametro=<%=televisioneItem.getIdTelevisione()%>">Rimuovi</a>
			</td>
		</tr>
		<%
		}
		%>



	</table>
	<div align="center" style="margin-top: 1%">
		<a href="PrepareInsertServlet">Inserisci nuova televisona</a>
	</div>
</body>
</html>