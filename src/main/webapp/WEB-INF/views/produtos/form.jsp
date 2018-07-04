<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Casa do Codigo - Cadastro de produtos</title>
</head>
<body>
	<form action="/casadocodigo/produtos" method="post">
		<div>
			<label>Titulo</label>
			<input type="text" name="titulo"/>
		</div>
		
		<div>
			<label>Descrição</label>
			<textarea rows="5" cols="20" name="descricao"></textarea>
		</div>
		
		<div>
			<label>Numero de paginas</label>
			<input type="text" name="paginas"/>
		</div>
		
		<button type="submit">Casatrar livro</button>
	</form>
</body>
</html>