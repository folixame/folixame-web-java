<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

    <link rel="stylesheet" href="//code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">
  </head>
  <body>

	<jsp:include page="nav.jsp">
		<jsp:param value="tienda" name="active"/>
	</jsp:include> 

    <!-- Page Content -->
    <div class="container">
        <div class="row">
            <div class="col-md-3">
                <p class="lead">Categorías</p>
                <div class="list-group">
                    <ul class="nav nav-pills nav-stacked" role="tablist">
                    	<c:forEach items="${categories}" var="c">
                    		<li><a href="#">${c.getName()}</a></li>
                    	</c:forEach>
                    </ul>
                </div>
            </div>
            <div class="col-md-9">
                <p class="lead">Productos</p>
                <div class="row">
                	<c:forEach items="${products}" var="p">
                	    <div class="col-md-3 column productbox">
                	    	<c:forEach items="${images}" var="i">
                	    		<c:if test="${i.getMerchandiseId() eq p.getId()}">
                	    			<img src="${i.getUrl()}" class="img-responsive" alt="${i.getAlt()}">
                	    		</c:if>
                	    	</c:forEach>
	                        <div class="producttitle"><a href="#">${p.getName()}</a></div>
	                        <div class="productdesc">${p.getShortDescription()}</div>
	                        <div class="productprice">
	                            <div class="pull-right"><a href="#" class="btn btn-danger btn-sm" role="button">COMPRAR</a></div><div class="pricetext">${p.getPrice()}€</div>
	                        </div>
	                    </div>
                	</c:forEach>
                </div>
            </div>
        </div>
    </div>
<jsp:include page="footer.jsp"/>
  </body>
</html>