<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Georgios Chasiotis</title>
	<link rel="stylesheet" href="styles/style.css">
</head>
<body>
	<div class="container">
			Καταχώρηση Προϊόντος
	</div>
	
	<div class="container1">
		<h3>Τα στοιχεία είναι:</h3>
	</div>
	
	<div class="product">
		<h3>Όνομα Προϊόντος: <h4>${name}</h4></h3>
		<br>
		<br>
		<h3>Barcode Προϊόντος: <h4>${barcode}</h4></h3>
		<br>
		<br>
		<h3>Χρώμα Προϊόντος: <h4>${color}</h4></h3>
		<br>
		<br>
		<h3>Περιγραφή Προϊόντος: <h4>${description}</h4></h3>
	</div>
	<form action="back">
		<div class="submit">
			<input type="submit" value="New Product">
		</div>
	</form>
</body>
</html>