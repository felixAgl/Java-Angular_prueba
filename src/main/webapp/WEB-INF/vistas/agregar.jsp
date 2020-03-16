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
		
		<form action="/agregar" method="POST" class="col-sm-5">
			<div class="card">
				<div class="card-header">
					<h4>AGREGAR NUEVO PRODUCTO</h4>
				</div>
			<div class="card-body">
				
				<div class="form-group">
					<label>CAMISAS</label> <input type="text" name="camisas" class="form-control"/>
				</div>
				
			
			</div>
			<div class="card-footer">
			
			<input type="submit" value="Guardar" class="btn btn-info"/>
			<a href="/listar" class="btn btn-link">REGRESAR</a>
			</div>
			</div>
			
		</form>
		
	</div>

</body>
</html>