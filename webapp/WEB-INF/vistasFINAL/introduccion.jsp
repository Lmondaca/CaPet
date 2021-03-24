<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="css_FINAL/intro.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>


<title>Inicio</title>

<!-- Bootstrap core CSS -->
<link href="../../dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="carousel.css" rel="stylesheet">
<title>Document</title>
</head>
<body>

	<header>
		<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
			<a class="navbar-brand" href="img/logo.png"><img class="logo"
				alt="logo" src="img/logo.png" height="30px" width="60px"></a>
			</div>
			<div>
				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#navbarCollapse" aria-controls="navbarCollapse"
					aria-expanded="false" aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarCollapse">
					<ul class="navbar-nav mr-auto">
						<li class="nav-item active"><a class="nav-link"
							id="headerMenu" href="/principal"><svg
									xmlns="http://www.w3.org/2000/svg" width="16" height="16"
									fill="currentColor" class="bi bi-eye" viewBox="0 0 16 16">
                    <path
										d="M16 8s-3-5.5-8-5.5S0 8 0 8s3 5.5 8 5.5S16 8 16 8zM1.173 8a13.133 13.133 0 0 1 1.66-2.043C4.12 4.668 5.88 3.5 8 3.5c2.12 0 3.879 1.168 5.168 2.457A13.133 13.133 0 0 1 14.828 8c-.058.087-.122.183-.195.288-.335.48-.83 1.12-1.465 1.755C11.879 11.332 10.119 12.5 8 12.5c-2.12 0-3.879-1.168-5.168-2.457A13.134 13.134 0 0 1 1.172 8z" />
                    <path
										d="M8 5.5a2.5 2.5 0 1 0 0 5 2.5 2.5 0 0 0 0-5zM4.5 8a3.5 3.5 0 1 1 7 0 3.5 3.5 0 0 1-7 0z" />
                  </svg>Ver cuidadores / <span class="sr-only">(current)</span></a>
						</li>
						<li class="nav-item"><a class="nav-link" id="headerMenu"
							href="/login"><svg xmlns="http://www.w3.org/2000/svg"
									width="16" height="16" fill="currentColor"
									class="bi bi-file-person" viewBox="0 0 16 16">
                    <path
										d="M12 1a1 1 0 0 1 1 1v10.755S12 11 8 11s-5 1.755-5 1.755V2a1 1 0 0 1 1-1h8zM4 0a2 2 0 0 0-2 2v12a2 2 0 0 0 2 2h8a2 2 0 0 0 2-2V2a2 2 0 0 0-2-2H4z" />
                    <path d="M8 10a3 3 0 1 0 0-6 3 3 0 0 0 0 6z" />
                  </svg>login /</a></li>
						<li class="nav-item"><a class="nav-link" id="headerMenu"
							href="/registro">Registro propietario de mascotas
								/</a></li>
						<li class="nav-item"><a class="nav-link" id="headerMenu"
							href="/registro-cuidador">Registro cuidador</a></li>
					</ul>
				</div>
			</div>
			<div id="frase">
				<h2>CaPet</h2>
			</div>
			<div>
		</nav>
	</header>
	<h1>
		<c:out value="${variableenhtml}" />
	</h1>
	<div class="container">
		<div id="myCarousel" class="carousel slide" data-ride="carousel">
			<!-- Indicators -->
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
				<li data-target="#myCarousel" data-slide-to="2"></li>
			</ol>

			<!-- Wrapper for slides -->
			<div class="carousel-inner">
				<div class="item active">
					<img class="img1"
						src="https://www.ecestaticos.com/image/clipping/f2395f82afc982c11407279ea8d3b640/sudafrica-prohibe-a-sus-ciudadanos-sacar-a-pasear-a-los-perros-en-cuarentena.jpg"
						alt="Los Angeles" style="width: 100%;">
					<div class="carousel-caption">
						<h3>paseos de mascotas</h3>
						<p>por que a veces no hay tiempo</p>
					</div>
				</div>

				<div class="item">
					<img
						src="https://www.webconsultas.com/sites/default/files/styles/wc_adaptive_image__small/public/temas/collar_isabelino_7.jpg"
						alt="Chicago" style="width: 100%;">
					<div class="carousel-caption">
						<h3>cuidados medicos</h3>
						<p>si tu mascota necesita mas atencion por cuestiones medicas
							no dudes en contactarnos</p>
					</div>
				</div>

				<div class="item">
					<img
						src="https://media.metrolatam.com/2018/02/19/erizoafricano660x550-600x400.jpg"
						alt="New york" style="width: 100%;">
					<div class="carousel-caption">
						<h3>mascotas exoticas</h3>
						<p>si te interesa cuidar animales exoticos o necesitas un
							cuidador</p>
					</div>
				</div>
			</div>

			<!-- Left and right controls -->
			<a class="left carousel-control" href="#myCarousel" data-slide="prev">
				<span class="glyphicon glyphicon-chevron-left"></span> <span
				class="sr-only">Previous</span>
			</a> <a class="right carousel-control" href="#myCarousel"
				data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right"></span> <span
				class="sr-only">Next</span>
			</a>
		</div>


	</div>


</body>
</html>