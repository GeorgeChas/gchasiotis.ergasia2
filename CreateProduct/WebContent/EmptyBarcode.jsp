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
			<h3>Συμπληρώστε ξανά τα παρακάτω στοιχεία:</h3>
		</div>
		
		<form class="my-form" action="create">
		
			<div class="row">
				<label>Όνομα:</label>
				<input type="text" name="name" placeholder="Enter Product Name">
			</div>
			<br>
			<div class="row">
				<label>Barcode<h4>*</h4>:</label>
				<input type="text" name="barcode" placeholder="Enter Barcode">
				<h7>Παρακαλώ πληκτρολογήστε έγκυρο barcode</h7>
			</div>
			<br>
			<div class="row">
				<label>Χρώμα:</label>
				<input type="text" name="color" placeholder="Enter Product Color">
			</div>
			<br>
			<div class="row">
				<label>Περιγραφή:</label>
				<textarea name="description"></textarea>
			</div>
			<br>
			<div class="submit">
				<input type="submit" value="Submit">
			</div>
		</form>
</body>
</html>