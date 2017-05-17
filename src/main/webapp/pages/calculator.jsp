<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Calculator</title>
<link rel="stylesheet" href="../css/styles.css" />
<link rel="stylesheet" href="../lib/css/bootstrap.min.css" />
<link rel="stylesheet" href="../css/media-queries.css" />
<meta name="viewport" content="width=device-width" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
.calcu {
	margin-top: 5%;
	margin-left: 25%;
	margin-right: 25%;
}

.calcuBody {
	background-color: gray;
	-moz-border-radius: 100px/50px;
	-webkit-border-radius: 100px/50px;
	border-radius: 100px/50px;
	font-size: 25;
	padding-bottom: 5%;
}

.calcuHead {
	height: 100px;
	-moz-border-radius: 100px/50px;
	-webkit-border-radius: 100px/50px;
	border-radius: 100px/50px;
	background-color: lightgray;
	font-family: 'Arial';
}

h1 {
	font-size: 75px;
}

.radBtn {
	font-size: 35px;
}

.form-control {
	width: 10cm;
}

input[type=radio] {
	border: 0px;
	width: 10%;
	height: 1em;
}
h3{
	color: white;
}

.result{
	background-color:white;
	width:90%;
}

</style>

</head>
<body style="background-color:yellow;">
	<div class=calcu align="center">
		<div class="calcuHead">
			<h1>
				<b>Calculator</b>
			</h1>
		</div>
		<div class="calcuBody">
			<form
				action="http://localhost:8080/SoaBaseCode/modulename/calculator"
				method="GET">
				<h3>Number 1: <input type="number" name="num1" value="${num1}" class="form-control"></h3>
				<h3>Number 2: <input type="number" name="num2" value="${num2}" class="form-control"></h3>
				<br><input class="radBtn" type="radio" name="operation"value="+"><b>Add +</b> 
					<input class="radBtn" type="radio" name="operation" value="-"><b>Subtract - </b> 
					<input class="radBtn" type="radio" name="operation" value="*"><b>Multiply *</b> 
					<input class="radBtn" type="radio" name="operation" value="/"><b>Divide /</b> 
					<br><br> 
					<a href="http://localhost:8080/SoaBaseCode/modulename/calculator?clear=1" 
						class="btn btn-info btn-m">Cls<span class="glyphicon glyphicon-trash"></span></a>
				<button type="submit" class="btn btn-success">SUBMIT! <span class="glyphicon glyphicon-check"></span></button>
			</form>
			<h2 class="result" >Result: ${num1} ${operation}
				${num2} = ${ans}</h2>
		</div>
	</div>
</body>
<script src="lib/js/jquery-1.10.1.min.js"></script>
<script src="lib/js/bootstrap.min.js"></script>
<script src="js/common.js"></script>
<script src="lib/js/jquery.blockUI.js"></script>
</html>