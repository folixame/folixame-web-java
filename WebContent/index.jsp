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
    <link href="css/carousel.css" rel="stylesheet">
    <link href="css/events.css" rel="stylesheet">

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
            <li>
              <time datetime="2014-07-20">
                <span class="day">4</span>
                <span class="month">Jul</span>
                <span class="year">2015</span>
              </time>
              <img alt="Independence Day" src="https://farm4.staticflickr.com/3100/2693171833_3545fb852c_q.jpg" />
              <div class="info">
                <h2 class="title"><a href="#">Independence Day (Name)</a></h2>
                <p class="desc">United States Holiday (short_description)</p>
                <ul>
                  <li style="width:33%;"><span class="glyphicon glyphicon-calendar"> 01-01-2015 </span></li>
                  <li style="width:34%;"><span class="glyphicon glyphicon-calendar"> 01-01-2015 </span></span></li>
                </ul>
              </div>
            </li>
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