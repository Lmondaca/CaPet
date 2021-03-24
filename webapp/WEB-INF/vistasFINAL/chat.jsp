<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Chatea con el cuidador</title>
<link rel="stylesheet" type="text/css" href="css_FINAL/chat.css">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/material-design-icons/3.0.1/iconfont/material-icons.min.css">
</head>
<body>
	<section>
		<h1>Chat</h1>
		<p>Haz click en la burbuja y coordina con el Cuidador</p>

		<button class="chat-btn">
			<i class="material-icons"> comment </i>
		</button>

		<div class="chat-popup">
			<div class="badge">1</div>
			<div class="chat-area">
				<div class="income-msg">
					<img src="img/cuidador.jpg" class="avatar" alt="cuidador.jpg">
					<span class="msg"> Hola soy Erwin, el cuidador de
						animales,en que te puedo auyudar?</span>
				</div>
			</div>

			<div class="input-area">
				<input type="text">
				<button id="emoji-btn">&#127773;</button>
				<button class="submit">
					<i class="material-icons"> send</i>
				</button>
			</div>
		</div>
		<br>
		<br>
		<br>
		<br>
		<br>
		<h3>
			<a href="/pago">Pago</a>
		</h3>
	</section>
	<script
		src="https://cdn.jsdelivr.net/npm/@joeattardi/emoji-button@3.1.1/dist/index.min.js"></script>
	<script src="js/main.js"></script>
</body>
</html>