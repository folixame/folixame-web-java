<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.jsp">Folíxame</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
              <ul class="nav navbar-nav">
              	<c:choose>
              		<c:when test="${param.active eq 'index'}">
              			<li class="active"><a href="index.jsp">Inicio</a></li>
              		</c:when>
              		<c:otherwise>
              			<li><a href="index.jsp">Inicio</a></li>
              		</c:otherwise>
              	</c:choose>
              	              	<c:choose>
              		<c:when test="${param.active eq 'events'}">
              			<li class="active"><a href="events.jsp">Eventos</a></li>
              		</c:when>
              		<c:otherwise>
              			<li><a href="events.jsp">Eventos</a></li>
              		</c:otherwise>
              	</c:choose>
              	              	<c:choose>
              		<c:when test="${param.active eq 'map'}">
              			<li class="active"><a href="map.jsp">Mapa</a></li>
              		</c:when>
              		<c:otherwise>
              			<li><a href="map.jsp">Mapa</a></li>
              		</c:otherwise>
              	</c:choose>
              	              	<c:choose>
              		<c:when test="${param.active eq 'tienda'}">
              			<li class="active"><a href="tienda.jsp">Tienda</a></li>
              		</c:when>
              		<c:otherwise>
              			<li><a href="tienda.jsp">Tienda</a></li>
              		</c:otherwise>
              	</c:choose>
              
              </ul>
              <ul class="nav navbar-nav navbar-right">
                <li><a href="login.jsp">Iniciar Sesión</a></li>
              </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>