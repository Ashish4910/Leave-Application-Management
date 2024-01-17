<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page isELIgnored="False"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Pie Chart</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
	integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/style.css">
<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>

<style>
@import
	url("https://fonts.googleapis.com/css?family=Poppins:600&display=swap")
	;

body {
	font-family: 'Poppins';
	color: white;
	text-align: center;
	font-size: 14px;
}

.pie_chart_content {
	height: 110px;
	background-image:
		url("https://scandionocology.con/wp-content/uploads/2018/12/iStock-673266772.jpg");
}

.overlay {
	background-color: #09162e5;
	height: 1100px;
	padding-top: 200px;
	padding-bottom: 200px;
}

.pie_chart_content .container {
	background: white;
	border-radius: 40px;
	padding: 20px;
}

.main_box h1 {
	padding: 50px 0px;
	color: black;
	font-size: 25px;
}

.main_box {
	background-color: white;
	height: 100%;
	border-bottom-left-radius: 30px;
	border-top-left-radius: 30px;
}

.count_box {
	background-color: green;
	border-bottom-right-radius: 30px;
	border-top-right-radius: 30px;
	height: 100%;
	padding: 20px;
}

.total-input {
	background-color: white;
	border: none;
	color: black;
}

.coronavirus-input {
	background-color: pink;
	border: none;
	color: white;
}

.death-input {
	background-color: skyblue;
	border: none;
	color: white;
}

.recovered-input {
	background-color: orange;
	border: none;
	color: white;
}

.form-control:focus {
	background-color: transparent;
	color: white;
	border: none;
}
</style>
</head>
<body>

</body>
</html>