<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ricerca</title>
</head>
<body  >

<% if(request.getAttribute("messaggioDiErrore") != null){ %>
		<p style="color: red;"><%=request.getAttribute("messaggioDiErrore") %></p>
	<%  }else{ %>
		<h1 style="text-align: center;">Inserire dati da ricercare</h1> <br>
	<%}    %>
	<form style="text-align: center;" action="SearchServlet" method="post">
	
		<label for="marcaInputId">MARCA:</label><br>
		<input placeholder="Marca..." type="text" name="marcaInput" id="marcaInputId">
		<br>
		<label for="modelloInputId">MODELLO:</label><br>
		<input placeholder="Modello..." type="text" name="modelloInput" id="modelloInputId">
		<br><br>
		<input  type="submit" value="CERCA">
	
	</form>	

</body>
</html>