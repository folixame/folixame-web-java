<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/events.css" rel="stylesheet">
    <link href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
	<!-- Ionicons -->
	<link href="http://code.ionicframework.com/ionicons/1.5.2/css/ionicons.min.css" rel="stylesheet" type="text/css" />
	<script type="text/javascript" src="http://maps.googleapis.com/maps/api/js?AIzaSyAjjtWXUISBeJSAhof3mbvKHIHNFX6lhoU"></script>

	<script>
		var map;
		var geocoder;
		var Ireland = "Dublin";
		function initialize() {
		  geocoder = new google.maps.Geocoder();
		  var mapProp = {
		    center:new google.maps.LatLng(43,361395300000000000,-5,859326699999997000),
		    zoom:8,
		    mapTypeId:google.maps.MapTypeId.ROADMAP
		  };
		  map=new google.maps.Map(document.getElementById("googleMap"),mapProp);
		  <c:forEach items="${events}" var="event">
		  	var contentString = 
		  		'<div class="container">'+
      			  '<div class="row">'+
      			  	'<div class="col-sm-6 gm-style-iw">'+
      	          	  '<ul class="event-list">'+
      	          	    '<li>'+
	      	              '<time datetime="${event.eventDate}">'+
	      	                '<span class="day">${event.eventDate.getDay()}</span>'+
	      	                '<span class="month">${event.eventDate.getMonth()}</span>'+
	      	                '<span class="year">${event.eventDate.getYear()}</span>'+
	      	              '</time>'+
	      	              '<img alt="${event.name}" src="${event.images.get(0).url}" />'+
	      	              '<div class="info">'+
	      	                '<h2 class="title"><a href="#">${event.name}</a></h2>'+
	      	                '<p class="desc">${event.shortDescription}</p>'+
	      	                '<ul>'+
	      	                  '<li style="width:33%;"><span class="glyphicon glyphicon-calendar">'+
	      	                  	'${event.startDate.getDay()}-${event.startDate.getMonth()}-${event.startDate.getYear()}</span></li>'+
	      	                  '<li style="width:34%;"><span class="glyphicon glyphicon-calendar">'+
	      						'${event.endDate.getDay()}-${event.endDate.getMonth()}-${event.endDate.getYear()}</span></li>'+
	      	                '</ul>'+
	      	              '</div>'+
	      	              '<div class="social">'+
	      				    '<ul>'+
	      				  	  '<li class="star" style="width:33%;"><a href="#star"><span class="fa fa-star-o"></span></a></li>'+
	      					'</ul>'+
	      			  	  '</div>'+
	      	            '</li>'+
	      	          '</ul>'+
	      	        '</div>'+
		  		'</div>'+
		  	  '</div>';
		  	codeAddress("${event.getPlace()}", contentString);
		  </c:forEach>
		}
	
		function codeAddress(address, contentString) 
		{
		  geocoder.geocode( {address:address, region:"ES"}, function(results, status) 
		  {
		    if (status == google.maps.GeocoderStatus.OK) 
		    {
		      map.setCenter(results[0].geometry.location);
		      
		      var infowindow = new google.maps.InfoWindow({
		          content: contentString
		      });
		      
			 var marker = new google.maps.Marker({
				 map: map,
				 position: results[0].geometry.location
			 });
			 google.maps.event.addListener(marker, 'click', function() {
				 infowindow.open(map,marker);
			 });
		    } else {
		      alert('Geocode was not successful for the following reason: ' + status);
		   }
		  });
		}
		google.maps.event.addDomListener(window, 'load', initialize);
	</script>
</head>

<body>
	<jsp:include page="nav.jsp">
		<jsp:param value="map" name="active"/>
	</jsp:include>
	<div class="container">
    	<div class="row">
    		<div id="googleMap" style="width:100%;height:800px;"></div>
    	</div>
    </div>
    <jsp:include page="footer.jsp"/>
</body>

</html>