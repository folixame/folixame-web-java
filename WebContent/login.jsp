<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Folíxame</title>
 
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/login.css" rel="stylesheet">

  </head>
  <body>

    	<jsp:include page="nav.jsp">
		<jsp:param value="login" name="active"/>
	</jsp:include> 

    <!--#include virtual="/menu.htm" -->

    <!-- Marketing messaging and featurettes
    ================================================== -->
    <!-- Wrap the rest of the page in another container to center all the content. -->
    <div class="container">
      <section id="form"><!--form-->
        <div class="container">
          <div class="row">
            <div class="col-sm-4 col-sm-offset-1">
              <div class="login-form"><!--login form-->
                <h2>Iniciar sesión</h2>
                <form action="#">
                  <input type="text" placeholder="Name" />
                  <input type="email" placeholder="Email Address" />
                  <button type="submit" class="btn btn-default">Login</button>
                </form>
              </div><!--/login form-->
            </div>
            <div class="col-sm-1">
              <h2 class="or">OR</h2>
            </div>
            <div class="col-sm-4">
              <div class="login-form"><!--sign up form-->
                <h2>Crear cuenta</h2>
                <form action="#">
                  <input type="text" placeholder="Nombre" />
                  <input type="surname" placeholder="Apellido" />
                  <input type="username" placeholder="Usuario" />
                  <input type="password" placeholder="Contraseña" />
                  <button type="submit" class="btn btn-default">Registrar</button>
                </form>
              </div><!--/sign up form-->
            </div>
          </div>
        </div>
      </section><!--/form-->
    </div>
    <div class="container">
      <hr>
      <!-- Footer -->
      <footer>
        <div class="row">
          <div class="col-lg-12">
            <p>Copyright &copy; Folíxame 2015</p>
          </div>
        </div>
      </footer>
    </div> 
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
  </body>
</html>