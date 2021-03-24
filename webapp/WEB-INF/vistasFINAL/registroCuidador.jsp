<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registro</title>
<link rel="stylesheet" type="text/css"
	href="css_FINAL/registerMascota.css">
</head>
<body>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<form:form method="POST" modelAttribute="cuidador" class="box">
		<h1>Register</h1>


		<p>
			Nombre:
			<form:errors path="nombre" />
			<form:input path="nombre" />
		</p>
		<p>
			Apellidos:
			<form:errors path="apellido" />
			<form:input path="apellido" />
		</p>
		<p>
			Correo electronico:
			<form:errors path="email" />
			<form:input path="email" />
		</p>
		<!-- 	    <input type="text" name="" placeholder="Confirmar correo"> -->
		<p>
			Contraseña:
			<form:errors path="password" />
			<form:password path="password" />
		</p>
		<!-- 	    <input type="password" name="" placeholder="Confirmar constraseña"> -->
		<p>
			Edad:
			<form:errors path="fechaNacimiento" />
			<form:input type="date" path="fechaNacimiento" />
		</p>
		<p>
			Descripción:
			<form:errors path="descripcion" />
			<form:input path="descripcion" />
		</p>
		<p>
			Dirección calle:
			<form:errors path="direccion.nombreCalle" />
			<form:input path="direccion.nombreCalle" />
		</p>
		<p>
			Número de casa:
			<form:errors path="direccion.numeroCasa" />
			<form:input type="number" path="direccion.numeroCasa" />
		</p>
		<p>
			Comuna:
			<form:errors path="direccion.comunaPertenece.nombre" />
			<form:input path="direccion.comunaPertenece.nombre" />
		</p>
		<p>
			Ciudad:
			<form:errors path="direccion.comunaPertenece.ciudadPertenece.nombre" />
			<form:input path="direccion.comunaPertenece.ciudadPertenece.nombre" />
		</p>
		<p>
			Region:
			<form:errors
				path="direccion.comunaPertenece.ciudadPertenece.regionPertenece.nombre" />
			<form:input
				path="direccion.comunaPertenece.ciudadPertenece.regionPertenece.nombre" />
		</p>


		<input type="submit">
	</form:form>
</body>
</html>