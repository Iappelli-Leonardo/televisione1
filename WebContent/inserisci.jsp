<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nuova Televisione</title>
</head>
<body>
	<% if(request.getAttribute("messaggioDiErrore") != null){ %>
		<p style="color: red; text-align: center"><%=request.getAttribute("messaggioDiErrore") %></p>
	<%  }else{ %>
	<%}    %>
	<h1 style=" text-align: center">Inserisci una nuova televisione</h1>
	<form style=" text-align: center" action="ExecuteInsertServlet" method="post">
	
		<input placeholder="Marca..." type="text" name="marcaInput"> &nbsp
		<input placeholder="Modello..." type="text" name="modelloInput">&nbsp
		<input placeholder="Prezzo..." type="text" name="prezzoInput">&nbsp
		<input placeholder="Codice seriale..." type="text" name="codiceInput">&nbsp
		
		<input type="submit" value="Conferma"> 
		
	</form>
</body>
</html>