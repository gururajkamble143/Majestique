<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>T-Shirts</h1>
	<form action="/addtshirts" method="post">

		id : <br><input type="text" name="id"><br>
		title : <br><input type="text" name="title"><br>
		price 1 : <br><input type="text" name="price_dis"><br>
		price 2 : <br><input type="text" name="price_ori"><br>
		off% : <br><input type="text" name="off"><br>
		style name : <br><input type="text" name="style_name"><br>
		color : <br><input type="text" name="color"><br>
		category : <br><input type="text" name="category"><br>
		pattern : <br><input type="text" name="pattern"><br>
		image 1 : <br><input type="text" name="image1"><br>
		image 2 : <br><input type="text" name="image2"><br>
		image 3 : <br><input type="text" name="image3"><br>
		image 4 : <br><input type="text" name="image4"><br>
		image 5 : <br><input type="text" name="image5"><br>
		
		<br><input type="submit"><br>
	</form>

</body>
</html>