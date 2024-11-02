<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java WebApi</title>
</head>
<body>
	<form method="get" action="<%=request.getContextPath()%>/api/product">
		<input name="id"/>
		<button>Get product</button>
	</form>
</body>
</html>