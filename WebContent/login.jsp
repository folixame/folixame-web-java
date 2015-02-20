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
                <form action="login" method="post">
                  <input type="text" name="first-name" placeholder="Nombre" />
                  <input type="text" name="surname" placeholder="Apellido" />
                  <input type="text" name="username" placeholder="Usuario" />
                  <input type="email" name="email" placeholder="Email" />
                  <input type="password" name="password" placeholder="Contraseña" />
                  <button type="submit" class="btn btn-default">Registrar</button>
                </form>
              </div><!--/sign up form-->
            </div>
          </div>
        </div>
      </section><!--/form-->
    </div>
<jsp:include page="footer.jsp"/>
  </body>
</html>