<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="resources/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="views/css/login.css">
<script type="text/javascript" src="resources/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
<title>Healthtrack - Login</title>
</head>
<body>
	<div class="container">
		<div class="row">
		<div class="col-md-5 mx-auto">
				<div class="myform form ">
					 <div class="logo mb-3">
						 <div class="col-md-12 text-center">
							<h1>Login</h1>
						</div>
					</div>
					<form action="login" method="post">
						<div class="form-group">
							<label for="id-nome">Usuário</label>
							<input class="form-control" type="text" name="usuario" id="usuario">
						</div>
						<div class="form-group">
							<label for="id-qtd">Senha</label>
							<input class="form-control" type="password" name="senha" id="senha">
						</div>
						<div class="col-md-12 text-center ">
							<input class=" btn btn-block mybtn btn-primary tx-tfm" type="submit" value="Entrar">
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>