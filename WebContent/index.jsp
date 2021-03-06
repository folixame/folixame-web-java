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
    <link href="css/carousel.css" rel="stylesheet">
    <link href="css/events.css" rel="stylesheet">
    <link href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
	<!-- Ionicons -->
	<link href="http://code.ionicframework.com/ionicons/1.5.2/css/ionicons.min.css" rel="stylesheet" type="text/css" />

  </head>
  <body>
	<jsp:include page="nav.jsp">
		<jsp:param value="index" name="active"/>
	</jsp:include> 
    <!-- Carousel
    ================================================== -->
    <div id="myCarousel" class="carousel slide" data-ride="carousel">
      <!-- Indicators -->
      <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
        <li data-target="#myCarousel" data-slide-to="3"></li>
      </ol>
      <div class="carousel-inner" role="listbox">
        <div class="item active">
          <img src="img/q.png" alt="First slide">
          <div class="container">
            <div class="carousel-caption">

            </div>
          </div>
        </div>
        <div class="item">
          <img src="img/arriondes.jpg" alt="Second slide">
          <div class="container">
            <div class="carousel-caption">

            </div>
          </div>
        </div>
        <div class="item">
          <img src="img/Vega.jpg" alt="Third slide">
          <div class="container">
            <div class="carousel-caption">

            </div>
          </div>
        </div>
        <div class="item">
          <img src="img/slide4.jpg" alt="Fourth slide">
          <div class="container">
            <div class="carousel-caption">

            </div>
          </div>
        </div>
      </div>
      <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left"></span>
        <span class="sr-only">Previous</span>
      </a>
      <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right"></span>
        <span class="sr-only">Next</span>
      </a>
    </div><!-- /.carousel -->


    <!-- Marketing messaging and featurettes
    ================================================== -->
    <!-- Wrap the rest of the page in another container to center all the content. -->
  <div class="container">
    <div class="row">
      <div class="col-xs-6 col-sm-6">
        <h1> Próximos Eventos </h1>
          <br/>
          <ul class="event-list">
            <c:forEach items="${nextEvents}" var="event">
          	<li>
              <time datetime="${event.eventDate}">
                <span class="day">${event.eventDate.getDay()}</span>
                <span class="month">${event.eventDate.getMonth()}</span>
                <span class="year">${event.eventDate.getYear()}</span>
              </time>
              <img alt="${event.name}" src="${event.images.get(0).url}" />
              <div class="info">
                <h2 class="title"><a href="#">${event.name}</a></h2>
                <p class="desc">${event.shortDescription}</p>
                <ul>
                  <li style="width:33%;"><span class="glyphicon glyphicon-calendar">
                  	${event.startDate.getDay()}-${event.startDate.getMonth()}-${event.startDate.getYear()}</span></li>
                  <li style="width:34%;"><span class="glyphicon glyphicon-calendar">
					${event.endDate.getDay()}-${event.endDate.getMonth()}-${event.endDate.getYear()}</span></li>
                </ul>
              </div>
            </li>	
          </c:forEach>
          </ul>
      </div>
      <div class="col-xs-6 col-md-offset-1 col-sm-5">
        <h1> Buscar Eventos </h1>
        <form class="form-horizontal" role="form">
          <fieldset>
            <br/>
            <div class="form-group">
              <label class="col-sm-2 control-label" for="textinput">Descripción</label>
              <div class="col-sm-8">
                <input type="text" placeholder="Description" class="form-control">
              </div>
            </div>
            <div class="form-group">
              <label class="col-sm-2 control-label" for="textinput">Lugar</label>
              <div class="col-sm-8">
                <input type="text" placeholder="Lugar" class="form-control">
              </div>
            </div>
            <div class="form-group">
              <label class="col-sm-2 control-label" for="textinput">Fecha inicio</label>
              <div class="col-sm-8">
                <input type="text" placeholder="01-01-2015" class="form-control">
              </div>
            </div>
            <div class="form-group">
              <label class="col-sm-2 control-label" for="textinput">Fecha fin</label>
              <div class="col-sm-8">
                <input type="text" placeholder="01-01-2015" class="form-control">
              </div>
            </div>
            <div class="form-group">
              <label class="col-sm-2 control-label" for="textinput">Categoría</label>
              <div class="col-sm-8">
                <select class="combobox">
                  <option></option>
                  <option value="PA">A</option>
                  <option value="CT">B</option>
                  <option value="NY">C</option>
                  <option value="MD">D</option>
                  <option value="VA">E</option>
                </select>
              </div>
            </div>
            <div class="form-group">
              <div class="col-sm-offset-2 col-sm-8">
                <div class="pull-right">
                  <button type="submit" class="btn btn-primary">Buscar</button>
                </div>
              </div>
            </div>
          </fieldset>
        </form>
      </div>
    </div>
  </div>
  <jsp:include page="footer.jsp"/>
  </body>
</html>