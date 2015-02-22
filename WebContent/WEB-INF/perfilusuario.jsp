<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Folíxame</title>
 
    <!-- Style -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/profile.css" rel="stylesheet">
    <link href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
	<!-- Ionicons -->
	<link href="http://code.ionicframework.com/ionicons/1.5.2/css/ionicons.min.css" rel="stylesheet" type="text/css" />

  </head>
  <body>
	<jsp:include page="nav.jsp">
		<jsp:param value="index" name="active"/>
	</jsp:include> 

    <!-- Marketing messaging and featurettes
    ================================================== -->
    <!-- Wrap the rest of the page in another container to center all the content. -->
  <div class="container">
  	<div class="row">
        <h1> Información </h1>
        <hr>
        <div class="col-md-offset-1 col-lg-4">
        	<img class="img-circle" src="img/avatar3.png" alt="Generic placeholder image" style="width: 200px; height: 200px;">
          	<form class="form-horizontal" action="" method="">
				<fieldset>
			  		<div class="form-group">
			  	  		<input id="file" name="file" class="input-file" type="file">
			      		<input id="save" name="save" class="btn btn-default imgProfile" type="submit" value="Cambiar imagen">
			  		</div>
				</fieldset>
		  	</form>
        </div>
        <div class="col-md-offset-1 col-lg-5">
			<form class="form-horizontal">
				<fieldset>
					<legend>Información de la cuenta</legend>
					<div class="form-group">
					    <label class="col-md-4 control-label" for="password">Correo</label>
					    <div class="col-md-5">
					    	<input id="email" name="email" placeholder="example@example.com" class="form-control input-md" required="" type="text">
					  	</div>
					</div>
					<div class="form-group">
					    <label class="col-md-4 control-label" for="username">Usuario</label>  
					    <div class="col-md-5">
					  	    <input id="username" name="username" placeholder="usuario" class="form-control input-md" required="" type="text">
					  	</div>
					</div>
					<div class="form-group">
					    <label class="col-md-4 control-label" for="password">Contraseña</label>
					    <div class="col-md-5">
					    	<input id="password" name="password" placeholder="**************" class="form-control input-md" required="" type="password">
					  	</div>
					</div>
					<div class="form-group">
					  <label class="col-md-4 control-label" for="save"></label>
					  <div class="col-md-8">
					    <button id="save" name="save" class="btn btn-primary">Modificar</button>
					  </div>
					</div>
				</fieldset>
			</form>
        </div>
      </div>
      <div class="row">
      	  <h2> Eventos favoritos </h2>
      	  <hr>
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
                  </thead>
                  <tbody>
                  <c:forEach items="${favs}" var="fav">
                  	<tr>
                  	  	  <td>${fav.name}</td>
                          <td>${fav.place}</td>
                          <td>${fav.startDate.getDay()}-${fav.startDate.getMonth()}-${fav.startDate.getYear()}</td>
                          <td>${fav.endDate.getDay()}-${fav.endDate.getMonth()}-${fav.endDate.getYear()}</td>
                          <td>${fav.shortDescription}</td>
                          <td>${fav.longDescription}</td>
                          <td>categoria</td>
                          <td>
                              <form action="" method="post">
                                  <input class="btn btn-danger" type="submit" value="Borrar"/>
                              </form>
                          </td>
                      </tr>
                  </c:forEach>
                  	  <tr>
                  	  	  <td>nombre</td>
                          <td>lugar</td>
                          <td>fecha 1</td>
                          <td>fecha 2</td>
                          <td>descripción 1</td>
                          <td>descripción 2</td>
                          <td>categoría</td>
                          <td>
                              <form action="" method="post">
                                  <input class="btn btn-danger" type="submit" value="Borrar"/>
                              </form>
                          </td>
                      </tr>
                  </tbody>
              </table>
              <div class="clearfix"></div>
          </div>
      </div>    
  </div>
  <jsp:include page="footer.jsp"></jsp:include> 
  </body>
</html>