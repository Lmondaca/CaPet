<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Mi mascota</title>
<link rel="stylesheet" type="text/css"
	href="css_FINAL/perfilMascota.css">
</head>
<body>
	<h1>
		<c:out value="${variableenhtml}" />
	</h1>
	<div class="contenedor">

		<div class="Logo">
			<img src="img/logo.png" alt="logo" width="150" height="150">
		</div>

		<div class="perfil">
			<h2>Mi perfil</h2>
		</div>

		<div class="foto">
			<img
				src="https://assets.metrolatam.com/mx/2016/05/08/screen-shot-2016-05-02-at-2-20-03-pm-1200x600.jpg"
				alt="fotografia de un gato color gris y dorado" height="300"
				width="300">
		</div>

		<div class="comentario">
			<h3>Detalles sobre mi:</h3>
			<p>Mi nombre es mufasa(macho) tengo 10 meses de vida me gusta
				acostarme en el sillon y jugar con mi raton de juguete,soy gordito
				pero actualente estoy a dieta.</p>
		</div>

		<div class="cuidados">
			<br> <br> <br> <br>
			<p>Debido a mi dieta necesito comer a las 9am y a las 6pm
				solamente debo comer mi comida especial con el
				pocionador.Lamentablemente tengo gripe asi que debo tomar unas gotas
				de interferon(antiviral)una vez al dia.</p>
		</div>
		<div class="link">
			<a href="/perfilDueno"><svg xmlns="http://www.w3.org/2000/svg"
					width="80" height="80" fill="currentColor"
					class="bi bi-arrow-left-circle" viewBox="0 0 16 16">
                <path fill-rule="evenodd"
						d="M1 8a7 7 0 1 0 14 0A7 7 0 0 0 1 8zm15 0A8 8 0 1 1 0 8a8 8 0 0 1 16 0zm-4.5-.5a.5.5 0 0 1 0 1H5.707l2.147 2.146a.5.5 0 0 1-.708.708l-3-3a.5.5 0 0 1 0-.708l3-3a.5.5 0 1 1 .708.708L5.707 7.5H11.5z" />
              </svg></a>
		</div>

		<div class="publicidad">
			<p>Veterinaria animales felices ,tenemos los mejores precios</p>
		</div>

		

	</div>

</body>
</html>