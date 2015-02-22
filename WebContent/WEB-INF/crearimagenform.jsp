<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<form class="form-horizontal">
<fieldset>

<!-- Form Name -->
<legend>Crear imagen</legend>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="name">Nombre</label>  
  <div class="col-md-4">
  <input id="name" name="name" placeholder="nombre" class="form-control input-md" required="" type="text">
  <span class="help-block">Inserta un nombre para la imagen</span>  
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="alt">Descripción</label>  
  <div class="col-md-4">
  <input id="alt" name="alt" placeholder="descripción" class="form-control input-md" required="" type="text">
  <span class="help-block">Inserta una descripción corta para la imagen</span>  
  </div>
</div>

<!-- File Button --> 
<div class="form-group">
  <label class="col-md-4 control-label" for="file">Archivo</label>
  <div class="col-md-4">
    <input id="file" name="file" class="input-file" type="file">
  </div>
</div>

<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label" for="save"></label>
  <div class="col-md-offset-4 col-md-4">
    <button id="save" name="save" class="btn btn-primary">Crear</button>
  </div>
</div>
</fieldset>
</form>
