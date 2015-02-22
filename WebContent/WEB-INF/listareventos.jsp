<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Folíxame</title>
<!-- Theme style -->
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<link href="css/admin.css" rel="stylesheet" type="text/css" />
<link href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
<!-- Ionicons -->
<link href="http://code.ionicframework.com/ionicons/1.5.2/css/ionicons.min.css" rel="stylesheet" type="text/css" />
<script src="js/showdatamodal.js"></script>
</head>
<body class="skin-black">
	<div class="wrapper row-offcanvas row-offcanvas-left">
		<jsp:include page="adminnav.jsp"/>
	    <aside class="right-side">
	   		<section class="content-header">
				<jsp:include page="nav.jsp"/> 
	        </section>
	        <!-- Main content -->
	        <section class="content-list">
	        	<div class="row">
                    <div class="col-md-12">
                      <h1> Lista de eventos </h1>
                      <div class="table-responsive">
                        <table id="mytable" class="table table-bordred table-striped">
                          <thead>
                            <th>Nombre</th>
                            <th>Lugar</th>
                            <th>Fecha de inicio</th>
                            <th>Fecha de término</th>
                            <th>Descripción corta</th>
                            <th>Descripción detallada</th>
                            <th>Categoría</th>
                            <th></th>
                            <th></th>
                          </thead>
                          <tbody>
                          <c:forEach items="${events}" var="event">
	                          <tr>
	                              <td>${event.name}</td>
	                              <td>${event.place}</td>
	                              <td>${event.startDate.getDay()}-${event.startDate.getMonth()}-${event.startDate.getYear()}</td>
	                              <td>${event.endDate.getDay()}-${event.endDate.getMonth()}-${event.endDate.getYear()}</td>
	                              <td>${event.shortDescription}</td>
	                              <td>${event.longDescription}</td>
	                              <td>categoria</td>
	                              <td>
	                              	<form action="modificareventos" method="get">
	                              		<input type="hidden" name="eventIdUpdate" value="${event.id}">
	                              		<input class="btn btn-primary" type="submit" value="Modificar"/>
	                              	</form>
	                              </td>
	                              <td>
	                              	<form action="" method="get">
	                              		<input type="hidden" name="eventIdDelete" value="${event.id}">
	                              		<input class="btn btn-danger" type="submit" value="Borrar"/>
	                              	</form>
	                              </td>
                            </tr>
                          </c:forEach>
                          </tbody>
                        </table>
                        <div class="clearfix"></div>
                      </div>
                    </div>
	        	</div>
	        </section>
	    </aside>
	</div>
	<jsp:include page="footer.jsp"/>
</body>
</html>