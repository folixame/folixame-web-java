<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="true" %>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Folíxame</title>
<!-- Theme style -->
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<link href="css/profile.css" rel="stylesheet" type="text/css" />
<link href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
<!-- Ionicons -->
<link href="http://code.ionicframework.com/ionicons/1.5.2/css/ionicons.min.css" rel="stylesheet" type="text/css" />

</head>
<body class="skin-black">
	<div class="wrapper row-offcanvas row-offcanvas-left">
		<jsp:include page="adminnav.jsp"/> 
	    <aside class="right-side">
	   		<section class="content-header">
				<jsp:include page="nav.jsp"/> 
	        </section>
	        <!-- Main content -->
	        <section class="content">
	        	<h1> Bienvenido al panel de administración</h1>
	        	
	        </section><!-- /.content -->
	    </aside>
	</div>
	<jsp:include page="footer.jsp"/> 
</body>
</html>