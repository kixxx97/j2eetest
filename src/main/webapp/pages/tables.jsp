<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="../css/styles.css" />
<link rel="stylesheet" href="../lib/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="../css/media-queries.css" />
<meta name="viewport" content="width=device-width" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Tables</title>
    <style>
        .mainHeader{
            background-color: black;
            color: white;
        }
        #mainTable{
            width:80%;
        }
        #searchTable{
            width: 80%;
        }
        #idSearch{
            width:30%;
        }
        #ageSearch{
            width:10%;
        }
        #searchButton{
            width:9%;
        }
        .delButtons{
        	width:8%;
        }
        .ins{
        	width:20%;
        	margin-left:10%;
        }
    </style>
</head>
<body>
    <h1>My Test Table</h1>
    <div class="content">
    <form action="http://localhost:8080/SoaBaseCode/modulename/tables/insertTable" method="GET">
    	<input placeholder="ID" type="number" name="id" class="ins form-control">
    	<input placeholder="name" type="text" name="name" class="ins form-control">
    	<input placeholder="age" type="number" name="age" max="999" min="0" class="ins form-control">
        <button class="btn btn-l btn-success" style="margin-left:10%;">INSERT DATA!</button></a>
    </form>
    <br>
    <div>
    <form action="http://localhost:8080/SoaBaseCode/modulename/tables/updateTable" method="GET" >
    	<select name="id" style="margin-left:10%; width:10%;" class="form-control">
    		<c:forEach var = "list" items="${tables}">
            		<option value="${list.id}"><c:out value="${list.id}"></c:out></option>
  			</c:forEach>
    	</select>
    	<input placeholder="name" type="text" name="name" class="ins form-control">
    	<input placeholder="age" type="number" name="age" max="999" min="0" class="ins form-control">
        <button class="btn btn-l btn-warning" style="margin-left:10%;">UPDATE DATA!</button></a>
    </form>
    </div>
    	   
    <br><br>
        <table id="mainTable" align="center" class="table table-bordered table-striped table-hover">
            <thead>
                <tr>
                	<form action="http://localhost:8080/SoaBaseCode/modulename/tables/searchId"method="GET">
                	<th id="idSearch">
            			<input placeholder="Search ID" type="number" name="id" class="form-control"> <button type="submit" class="btn btn-success">Search </button>
					 </th>
                    </form>
                    
                    <form action="http://localhost:8080/SoaBaseCode/modulename/tables/searchName"method="GET">
                    <th>
                    <input placeholder="Search Name" type="text" name="name" class="form-control"> <button type="submit" class="btn btn-info">Search </button> 
                    </th>
                    </form>
                    
                    <form action="http://localhost:8080/SoaBaseCode/modulename/tables/searchAge"method="GET">
                    <th id="ageSearch">
                     <input id="age1" placeholder="Age" type="number" name="age1" class="form-control"> to <input id="age2" placeholder="Age" type="number" name="age2" class="form-control"> <button type="submit" class="btn btn-warning">Search </button>
                     </th>
                     </form>
                    
                    
                    	
                    
                </tr>
                <tr>
                    <th class="mainHeader">ID</th>
                    <th class="mainHeader">Name</th>
                    <th class="mainHeader">Age</th>
                    <th class="mainHeader">Functions</th>
                </tr>
            </thead>
            <c:forEach var = "list" items="${tables}">
            	<tr>
         			<td><c:out value="${list.id}"></c:out></td>
                	<td><c:out value="${list.name}"></c:out></td>
                	<td><c:out value="${list.age}"></c:out></td>
                	<td class="delButtons"><a href="http://localhost:8080/SoaBaseCode/modulename/tables/deleteTable?id=${list.id}"><button class="btn btn-danger btn-s">Delete </button></a>
                </tr>
                </c:forEach>
        </table>
        <br><br>
        
        
    </div>
</body>
<script src="../lib/bootstrap/js/jquery-1.10.1.min.js"></script>
<script src="lib/js/bootstrap.min.js"></script>
<script src="js/common.js"></script>
<script src="lib/js/jquery.blockUI.js"></script>
</html>