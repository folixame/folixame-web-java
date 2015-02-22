<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	        		<form class="form-horizontal" action="crearevento" method="post">
						<fieldset>
							<legend>Crear evento</legend>
							<div class="form-group">
								<label class="col-md-4 control-label" for="name">Nombre del evento</label>  
							  	<div class="col-md-4">
							  		<input id="name" name="name" placeholder="name" class="form-control input-md" required="" type="text">
							  		<span class="help-block">Inserta el nombre del evento</span>  
							  	</div>
							</div>
							<div class="form-group">
								<label class="col-md-4 control-label" for="place">Lugar del evento</label>  
							  	<div class="col-md-4">
							  		<input id="place" name="place" placeholder="Ej: Oviedo" class="form-control input-md" required="" type="text">
							  		<span class="help-block">Inserta el lugar dónde se hará el evento</span>  
							  	</div>
							</div>
							<div class="form-group">
								<label class="col-md-4 control-label" for="startdate">Fecha de inicio</label>  
							  	<div class="col-md-4">
							  		<input id="startdate" name="startdate" placeholder="Ej: 01-01-2015" class="form-control input-md" required="" type="text">
							  		<span class="help-block">Inserta la fecha de inicio del evento</span>  
							  	</div>
							</div>
							<div class="form-group">
								<label class="col-md-4 control-label" for="enddate">Fecha de término</label>  
							  	<div class="col-md-4">
							  		<input id="enddate" name="enddate" placeholder="Ej: 01-01-2015" class="form-control input-md" required="" type="text">
							  		<span class="help-block">Inserta la fecha en la que termina el evento</span>  
							  	</div>
							</div>
							<div class="form-group">
								<label class="col-md-4 control-label" for="category">Categoría</label>
							  	<div class="col-md-4">
							    	<select id="category" name="category" class="form-control">
							      		<option value="1">Categoría 1</option>
							      		<option value="2">Categoría 2</option>
							    	</select>
							  	</div>
							</div>
							<div class="form-group">
								<label class="col-md-4 control-label" for="shortdescription">Descripción corta</label>  
							  	<div class="col-md-4">
							  		<input id="shortdescription" name="shortdescription" placeholder="placeholder" class="form-control input-md" required="" type="text">
							  		<span class="help-block">Inserta una descripción corta del evento</span>  
							  	</div>
							</div>
							<div class="form-group">
								<label class="col-md-4 control-label" for="longdescription">Descripción detallada</label>
							  	<div class="col-md-4">                     
							    	<textarea class="form-control" id="longdescription" name="longdescription">default text</textarea>
							  	</div>
							</div>
							
							<div class="form-group"> 
								<div class="col-md-1">
							  		<input id="valid" name="valid" class="form-control input-md" required="" type="hidden" value="1">
							  	</div>
							</div>
							<div class="form-group">
							  	<div class="col-md-offset-4 col-md-4">
							    	<button id="save" name="save" class="btn btn-primary">Crear</button>
							  	</div>
							</div>
						</fieldset>
					</form>