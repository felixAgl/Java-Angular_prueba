<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>"HULK STORE"</title>
<link rel="stylesheet" 
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
	<div class="container mt-4">
	<a href="/nuevo" class="btn btn-succes">AGREGAR NUEVO</a>
		<table class="table">
			<thead>
				<tr>
					<th>ID</th>
					<th>PRODUCTOS</th>
					<th>VASOS</th>
					<th>ACCION</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="productos1" items="${productos}">
					<tr>
						<td>${productos1.id}</td>
						<td>${productos1.camisas}</td>
						<td>${productos1.vasos}</td>
						<td>
						<a href="/editar/${productos1.id}" class="btn btn-warning">EDITAR</a>
						<a href="/eliminar/${productos1.id}" class="btn btn-danger">ELIMINAR</a>
						</td>
					</tr>
				
				</c:forEach>
			</tbody>
		</table>
		
	</div>

</body>
</html>