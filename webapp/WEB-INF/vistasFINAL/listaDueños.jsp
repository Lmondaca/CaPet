<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Principal</title>
		<link rel="stylesheet" type="text/css" href="cssa/styles.css">
	</head>
	<body>
		<div class="logo">
			<a class="navbar-brand" href="#"><img class="logo" alt="logo" src="img/logo.png"></a>
		</div>
		<div class="header">
			<h1>Cuidadores</h1>
			
		</div>
		
		<div class="contenedor">
			<a href="/perfilDueno">Perfil</a>
			<a href="/login"> Iniciar sesion</a>
			<div class="filtro">
				Animal
				<select name="animal">
					<option value="null">------</option>
					<option value="perro">Perro</option>
					<option value="gato">Gato</option>
					<option value="hamster">Hamster</option>
					<option value="loro">Loro</option>
					<option value="otros">Otros</option>
				</select>
			</div>
			<div class="filtro">
				Puntuacion
				<select name="puntuacion">
					<option value="null">------</option>
					<option value="1">1 Estrella</option>
					<option value="2">2 Estrellas</option>
					<option value="3">3 Estrellas</option>
					<option value="4">4 Estrellas</option>
					<option value="5">5 Estrellas</option>
				</select>
			</div>
			<div class="filtro">
				Distancia
				<select name="cercania">
					<option value="null">------</option>
					<option value="5km">5 KM</option>
					<option value="10km">10 KM</option>
					<option value="15km">+ 15KM</option>
				</select>
			</div>
		</div>
		<div class="map">
			<iframe src="https://www.google.com/maps/embed?pb=!1m16!1m12!1m3!1d13320.149136845375!2d-70.70495185!3d-33.4222723!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!2m1!1scomo%20poner%20el%20mapa%20de%20google%20en%20mi%20pagina%20web!5e0!3m2!1ses!2scl!4v1610390120207!5m2!1ses!2scl" width="1100" height="550" frameborder="0" style="border:0;" allowfullscreen="" aria-hidden="false" tabindex="0"></iframe>
		</div>
		<div class="container">
			<div class="foto">
				<h3><a href="/cuidador">Foto</a></h3>
			</div>
			<div class="descripcion">Descripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidador</div>
		</div>
		<div class="container">
			<div class="foto">
				<h3>Foto</h3>
			</div>
			<div class="descripcion">Descripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidador</div>
		</div><div class="container">
			<div class="foto">
				<h3>Foto</h3>
			</div>
			<div class="descripcion">Descripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidador</div>
		</div>
		<div class="container">
			<div class="foto">
				<h3>Foto</h3>
			</div>
			<div class="descripcion">Descripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidador</div>
		</div>
		<div class="container">
			<div class="foto">
				<h3>Foto</h3>
			</div>
			<div class="descripcion">Descripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidador</div>
		</div>
		<div class="container">
			<div class="foto">
				<h3>Foto</h3>
			</div>
			<div class="descripcion">Descripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidadorDescripcion de cuidador</div>
		</div>
		<div class="bot">
			<a>Consejos</a>
			<a>Terminos y condiciones</a>
			<a>FAQ</a>
		</div>
	</body>
</html>