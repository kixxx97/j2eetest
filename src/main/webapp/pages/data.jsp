<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <title>JAVA BASE CODE BETA 1.0</title>
	<link rel="stylesheet" href="http://localhost:8080/SoaBaseCode/css/styles.css" />
	<link rel="stylesheet" href="http://localhost:8080/SoaBaseCode/lib/css/bootstrap.min.css" />
	<link rel="stylesheet" href="http://localhost:8080/SoaBaseCode/css/media-queries.css" />
	<link rel = "stylesheet" href = "http://localhost:8080/SoaBaseCode/lib/font-awesome/css/font-awesome.min.css">
	<link rel="stylesheet" href="http://localhost:8080/SoaBaseCode/lib/datatables/dataTables.bootstrap.css">
  	<meta name="viewport" content="width=device-width" /> 	
  	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  	
  	<style>
  		#table-participants{
  			width:80%;
  			
  		}
  		#table-facilitators{
  			width:80%;
  		}
  		#functions{
  			display:inline;
  		}
  	</style>
</head>
<body>

<div class = "content-wrapper">
  <section class = "content-header">
    <h1>
      Data Tables
      <small>Check out your relevant tables.</small>
    </h1>
  </section>
  <section class = "content">
    <div class = "row">
      <div class = "col-xs-12">
        <div class = "nav-tabs-custom">
          <ul class = "nav nav-tabs">
          	<li id="participants_tab" ><a href = "#" data-toggle = "tab">Training Participants</a></li>
          	
            <li id="facilitators_tab" ><a href = "#" data-toggle = "tab">Training Facilitators</a></li>
          </ul>
          
          <div class = "tab-content">
          	<div class = "tab-pane active" id = "participants_tab_content">
              <div class = "row">
                <div class = "col-xs-12" style = "padding: 25px;">
                  <table id = "table-participants" class = "table table-bordered table-striped table-hover">
                  	<thead>
						<tr>
							<th>Username</th>
							<th>Position</th>
							<th>Email</th>
							<th>Contact Number</th>
							<th>Edit</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var = "list" items="${accList}">
            				<tr>
         						
                				<td><c:out value="${list.username}"></c:out></td>
                				<td><c:out value="${list.position}"></c:out></td>
                				<td><c:out value="${list.email}"></c:out></td>
                				<td><c:out value="${list.contactNumber}"></c:out></td>
                				<td><button class = "btn btn-warning btn-sm">
                            		Edit <i class = "fa fa-pencil"></i>
                          		</button></td>
              			    </tr>
                		</c:forEach>
					</tbody>
				  </table>
				  	<div id="functions">
        	<table>
        		<thead>
        			<th>Functions</th>
        		</thead>
        	</table>
        
        </div>
				</div>
              </div>
            </div>
            
            <div class = "tab-pane" id = "facilitators_tab_content">
              <div class = "row">
                <div class = "col-xs-12" style = "padding: 25px;">
                  <table id = "table-facilitators" class = "table table-bordered table-striped table-hover">
                    <thead>
                      <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Birthdate</th>
                        <th>Age</th>
                        <th>Sex</th>
                        <th>Tenure</th>
                        <th>Address</th>
                        <th>Phone</th>
                        <th>Email</th>
                        <th>Actions</th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr>
                        <td>14100145</td>
                        <td>Christian Ted Ochoa</td>
                        <td>November 18, 1997</td>
                        <td>19</td>
                        <td>Male</td>
                        <td>Part time</td>
                        <td>Cebu</td>
                        <td>1234567890</td>
                        <td>ochoatechmaster25@gmail.com</td>
                        <td>
                          <button class = "btn btn-warning btn-sm">
                            <i class = "fa fa-eye"></i>
                          </button>
                        </td>
                      </tr>
                      <tr>
                        <td>14100140</td>
                        <td>Neil Llenes</td>
                        <td>January 1, 1965</td>
                        <td>52</td>
                        <td>Male</td>
                        <td>Full time</td>
                        <td>Cebu</td>
                        <td>1234567890</td>
                        <td>neilllenes@gmail.com</td>
                        <td>
                          <button class = "btn btn-warning btn-sm">
                            Edit <i class = "fa fa-pencil"></i>
                          </button>
                        </td>
                      </tr>
                      <tr>
                        <td>12100140</td>
                        <td>Jon Lindo</td>
                        <td>January 2, 1965</td>
                        <td>52</td>
                        <td>Male</td>
                        <td>Part time</td>
                        <td>Cebu</td>
                        <td>1234567890</td>
                        <td>lindojon@gmail.com</td>
                        <td>
                          <button class = "btn btn-warning btn-sm">
                            <i class = "fa fa-eye"></i>
                          </button>
                        </td>
                      </tr>
                    </tbody>
                  </table>
                </div>
              </div>
            </div>
           </div>
          </div>
          </div>
          </section>
</div>




</body>
<script src="http://localhost:8080/SoaBaseCode/js/jquery-3.1.0.min.js"></script>
<script src ="http://localhost:8080/SoaBaseCode/lib/datatables/dataTables.bootstrap.css"></script>
<script src ="http://localhost:8080/SoaBaseCode/lib/datatables/dataTables.bootstrap.min.js"></script>
<script>
$(document).ready(function () {

   $("#participants_tab").addClass(" active");
   $("#participants_tab_content").addClass(" active");
   
   $('#participants_tab').click(function(){
	   $("#participants_tab").addClass(" active");
	   $("#participants_tab_content").addClass(" active");
		$('#facilitators_tab').removeClass("active");
		$('#facilitators_tab_content').removeClass("active");
		
	});
   
   $('#facilitators_tab').click(function(){
		$('#facilitators_tab').addClass("active");
		$('#facilitators_tab_content').addClass("active");
		$('#participants_tab').removeClass("active");
		$('#participants_tab_content').removeClass("active");
	});
});

</script>
</html>