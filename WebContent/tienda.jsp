<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap 101 Template</title>
 
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/carousel.css" rel="stylesheet">

    <link rel="stylesheet" href="//code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">
    <script src="js/simpleCart.min.js"></script>
    <script src="js/themescripts.min.js"></script>
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
                        <li><a href="products.html">New Arrivals</a></li>
                        <li><a href="#">Supersoft & Cozy</a></li>
                        <li><a href="#">Modern Romantic</a></li>
                        <li><a href="#">Christmas in the City</a></li>
                        <li><a href="#">Out with the Girls</a></li>
                        <li><a href="#">Flagship Exclusives</a></li>
                        <li><a href="#">Online Exclusives</a></li>
                        <li><a href="#">The Trend Edit</a></li>
                        <li><a href="#">Our Favorite Brands</a></li>
                        <li><a href="#">Fragance</a></li>
                    </ul>
                </div>
            </div>
            <div class="col-md-9">
                <p class="lead">Productos</p>
                <div class="row">
                    <div class="col-md-3 column productbox">
                        <img src="http://placehold.it/460x250/e67e22/ffffff&text=HTML5" class="img-responsive">
                        <div class="producttitle">Product 2</div>
                        <div class="productprice">
                            <div class="pull-right"><a href="#" class="btn btn-danger btn-sm" role="button">BUY</a></div><div class="pricetext">£8.95</div>
                        </div>
                    </div>
                    <div class="col-md-3 column productbox">
                        <img src="http://placehold.it/460x250/e67e22/ffffff&text=HTML5" class="img-responsive">
                        <div class="producttitle">Product 2</div>
                        <div class="productprice">
                            <div class="pull-right"><a href="#" class="btn btn-danger btn-sm" role="button">BUY</a></div><div class="pricetext">£8.95</div>
                        </div>
                    </div>
                    <div class="col-md-3 column productbox">
                        <img src="http://placehold.it/460x250/e67e22/ffffff&text=HTML5" class="img-responsive">
                        <div class="producttitle">Product 2</div>
                        <div class="productprice">
                            <div class="pull-right"><a href="#" class="btn btn-danger btn-sm" role="button">BUY</a></div><div class="pricetext">£8.95</div>
                        </div>
                    </div>
                    <div class="col-md-3 column productbox">
                        <img src="http://placehold.it/460x250/e67e22/ffffff&text=HTML5" class="img-responsive">
                        <div class="producttitle">Product 2</div>
                        <div class="productprice">
                            <div class="pull-right"><a href="#" class="btn btn-danger btn-sm" role="button">BUY</a></div><div class="pricetext">£8.95</div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-3 column productbox">
                        <img src="http://placehold.it/460x250/e67e22/ffffff&text=HTML5" class="img-responsive">
                        <div class="producttitle">Product 2</div>
                        <div class="productprice">
                            <div class="pull-right"><a href="#" class="btn btn-danger btn-sm" role="button">BUY</a></div><div class="pricetext">£8.95</div>
                        </div>
                    </div>
                    <div class="col-md-3 column productbox">
                        <img src="http://placehold.it/460x250/e67e22/ffffff&text=HTML5" class="img-responsive">
                        <div class="producttitle">Product 2</div>
                        <div class="productprice">
                            <div class="pull-right"><a href="#" class="btn btn-danger btn-sm" role="button">BUY</a></div><div class="pricetext">£8.95</div>
                        </div>
                    </div>
                    <div class="col-md-3 column productbox">
                        <img src="http://placehold.it/460x250/e67e22/ffffff&text=HTML5" class="img-responsive">
                        <div class="producttitle">Product 2</div>
                        <div class="productprice">
                            <div class="pull-right"><a href="#" class="btn btn-danger btn-sm" role="button">BUY</a></div><div class="pricetext">£8.95</div>
                        </div>
                    </div>
                    <div class="col-md-3 column productbox">
                        <img src="http://placehold.it/460x250/e67e22/ffffff&text=HTML5" class="img-responsive">
                        <div class="producttitle">Product 2</div>
                        <div class="productprice">
                            <div class="pull-right"><a href="#" class="btn btn-danger btn-sm" role="button">BUY</a></div><div class="pricetext">£8.95</div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- /.container -->
    <div class="container">

        <hr>

        <!-- Footer -->
        <footer>
            <div class="row">
                <div class="col-lg-12">
                    <p>Copyright &copy; Your Website 2014</p>
                </div>
            </div>
        </footer>

    </div> 
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
  </body>
</html>