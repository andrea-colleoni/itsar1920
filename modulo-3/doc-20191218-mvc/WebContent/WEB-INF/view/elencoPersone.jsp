<%@page import="model.Persona"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Elenco Persone</title>
</head>
<body>
<h1>Elenco Persone</h1>

<% List<Persona> persone = (List<Persona>)request.getAttribute("elencoPersone"); %>
<p>Ho trovato n. <%= persone.size() %> persone.</p>

<ul>
	<c:forEach items="${elencoPersone}" var="p">
		<li>${p.nome} ${p.cognome}</li>
	</c:forEach>
</ul>

<table>
	<thead>
		<tr>
			<th>Nome</th>
			<th>Cognome</th>
			<th>Altezza (cm)</th>
			<th>Peso (kg)</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${elencoPersone}" var="p">
		<tr>
			<td>${p.nome}</td>
			<td>${p.cognome}</td>
			<td>${p.altezzaInCm}</td>
			<td>${p.pesoInKg}</td>
		</tr>
		</c:forEach>	
	</tbody>
</table>

</body>
</html>