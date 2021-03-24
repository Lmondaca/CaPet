<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<link rel="stylesheet" type="text/css"
	href="css_FINAL/registerMascota.css">
</head>
<body>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<form:form method="POST" modelAttribute="mascota" class="box">
		<h1>Registro de mi Mascota</h1>
		<p>
			Nombre:
			<form:errors path="nombre" />
			<form:input path="nombre" />
		</p>
		<p>
			Edad:
			<form:errors path="edad" />
			<form:input type="number" path="edad" />
		</p>
		<p>
			Descripcion:
			<form:errors path="descripcion" />
			<form:textarea path="descripcion" rows="3" cols="20" />
		</p>
		<input type="text" name="" placeholder="Raza">
		<select name="">
			<option value="">Sexo</option>
			<option value="">Macho</option>
			<option value="">Hembra</option>
		</select>
		<textarea name="" placeholder="Descripcion"></textarea>
		<input type="submit" name="" value="Register">
	</form:form>
</body>
</html>