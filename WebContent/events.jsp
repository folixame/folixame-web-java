<%@page import="java.util.Calendar"%>
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
    <link href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
	<!-- Ionicons -->
	<link href="http://code.ionicframework.com/ionicons/1.5.2/css/ionicons.min.css" rel="stylesheet" type="text/css" />

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
              <div class="social">
				<ul>
				  <li class="star" style="width:33%;"><a href="fav?eventId=${event.id}"><span class="fa fa-star-o"></span></a></li>
				</ul>
			  </div>
            </li>	
          </c:forEach>
          </ul>
        </div>
      </div>
    </div>
    <jsp:include page="footer.jsp"/>
  </body>
</html>