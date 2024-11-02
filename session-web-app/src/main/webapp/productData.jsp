<%@page import="com.course.educacionit.dto.ProductDTO"%>

<html>
	<head>
	</head>
	<body>
		<%
			//Get object from session request (session request object exists by default)
			//Object must be cat to ProductDTO
			ProductDTO product = (ProductDTO)session.getAttribute("sessionProduct");			
		%>
		<div>
			<label>ID:</label> <%=product.getId()%>
			<br>
			<label>Nombre:</label> <%=product.getName()%>
			<br>
			<label>Precio:</label> <%=product.getPrice()%> 
		</div>
	</body>
</html>