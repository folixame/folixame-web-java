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
 
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/events.css" rel="stylesheet">

  </head>
  <body>

    	<jsp:include page="nav.jsp">
		<jsp:param value="events" name="active"/>
	</jsp:include> 
    <!--#include virtual="/menu.htm" -->

    <!-- Marketing messaging and featurettes
    ================================================== -->
    <!-- Wrap the rest of the page in another container to center all the content. -->
    <div class="container">
      <div class="row">
        <div class="col-md-3">
          <div class="list-group">
            <p class="lead">Categorías</p>
            <ul class="nav nav-pills nav-stacked" role="tablist">
            	<c:forEach items="${categories}" var="category">
            		<li><a href="#">${category.name}</a></li>
            	</c:forEach>
            </ul>
          </div>
          <div class="list-group">
            <p class="lead">Lugares</p>
            <ul class="nav nav-pills nav-stacked" role="tablist">
              <c:forEach items="${places}" var="place">
            		<li><a href="#">${place}</a></li>
            	</c:forEach>
            </ul>
          </div>
        </div>
        <div class="col-xs-6 col-sm-8">
          <p class="lead"> Eventos </p>
          <ul class="event-list">
          
          <c:forEach items="${events}" var="event">
          	<li>
              <time datetime="${event.eventDate}">
                <span class="day">4</span>
                <span class="month">Jul</span>
                <span class="year">2015</span>
              </time>
              <img alt="Independence Day" src="https://farm4.staticflickr.com/3100/2693171833_3545fb852c_q.jpg" />
              <div class="info">
                <h2 class="title"><a href="#">${event.name}</a></h2>
                <p class="desc">${event.shortDescription}</p>
                <ul>
                  <li style="width:33%;"><span class="glyphicon glyphicon-calendar"> 01-01-2015 </span></li>
                  <li style="width:34%;"><span class="glyphicon glyphicon-calendar"> 01-01-2015 </span></span></li>
                </ul>
              </div>
            </li>	
          </c:forEach>
          
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
            <li>
              <time datetime="2014-07-20 2000">
                <span class="day">20</span>
                <span class="month">Jan</span>
              </time>
              <img alt="My 24th Birthday!" src="https://farm5.staticflickr.com/4150/5045502202_1d867c8a41_q.jpg" />
              <div class="info">
                <h2 class="title">Mouse0270's 24th Birthday!</h2>
                <p class="desc">Bar Hopping in Erie, Pa.</p>
                <ul>
                  <li style="width:33%;"><span class="glyphicon glyphicon-calendar"> 01-01-2015 </span></li>
                  <li style="width:34%;"><span class="glyphicon glyphicon-calendar"> 01-01-2015 </span></span></li>
                </ul>
              </div>
            </li>
          </ul>
        </div>
      </div>
    </div>
    <jsp:include page="footer.jsp"/>
  </body>
</html>