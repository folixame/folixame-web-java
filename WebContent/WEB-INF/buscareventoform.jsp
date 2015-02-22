<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	        		<form class="form-horizontal">
						<fieldset>
							<legend>Buscar evento</legend>
							<div class="form-group">
								<label class="col-md-4 control-label" for="name">Nombre del evento</label>  
							  	<div class="col-md-4">
							  		<input id="name" name="name" placeholder="name" class="form-control input-md" required="" type="text">
							  	</div>
							</div>
							<div class="form-group">
								<label class="col-md-4 control-label" for="place">Lugar del evento</label>  
							  	<div class="col-md-4">
							  		<input id="place" name="place" placeholder="Ej: Oviedo" class="form-control input-md" required="" type="text">
							  	</div>
							</div>
							<div class="form-group">
								<label class="col-md-4 control-label" for="startdate">Fecha de inicio</label>  
							  	<div class="col-md-4">
							  		<input id="startdate" name="startdate" placeholder="Ej: 01-01-2015" class="form-control input-md" required="" type="text">
							  	</div>
							</div>
							<div class="form-group">
								<label class="col-md-4 control-label" for="enddate">Fecha de t�rmino</label>  
							  	<div class="col-md-4">
							  		<input id="enddate" name="enddate" placeholder="Ej: 01-01-2015" class="form-control input-md" required="" type="text">  
							  	</div>
							</div>
							<div class="form-group">
								<label class="col-md-4 control-label" for="category">Categor�a</label>
							  	<div class="col-md-4">
							    	<select id="category" name="category" class="form-control">
							      		<option value="1">Categor�a 1</option>
							      		<option value="2">Categor�a 2</option>
							    	</select>
							  	</div>
							</div>
							<div class="form-group">
								<label class="col-md-4 control-label" for="shortdescription">Descripci�n </label>  
							  	<div class="col-md-4">
							  		<input id="shortdescription" name="shortdescription" placeholder="placeholder" class="form-control input-md" required="" type="text"> 
							  	</div>
							</div>
							<div class="form-group">
							  	<div class="col-md-offset-4 col-md-4">
							    	<button id="save" name="buscar" class="btn btn-primary">Buscar</button>
							  	</div>
							</div>
						</fieldset>
					</form>