<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<form class="form-horizontal">
<fieldset>

<!-- Form Name -->
<legend>Modificar producto</legend>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="textinput">Nombre del producto</label>  
  <div class="col-md-4">
  <input id="textinput" name="textinput" placeholder="nombre" class="form-control input-md" required="" type="text">
  <span class="help-block">Inserta el nombre del producto</span>  
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="shortdescription">Descripción corta</label>  
  <div class="col-md-4">
  <input id="shortdescription" name="shortdescription" placeholder="placeholder" class="form-control input-md" required="" type="text">
  <span class="help-block">Inserta una descripción corta del producto</span>  
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="price">Precio</label>  
  <div class="col-md-4">
  <input id="price" name="price" placeholder="12.0" class="form-control input-md" required="" type="text">
  <span class="help-block">Inserta el precio del producto</span>  
  </div>
</div>

<!-- Select Basic -->
<div class="form-group">
  <label class="col-md-4 control-label" for="categoy">Categoría</label>
  <div class="col-md-4">
    <select id="categoy" name="categoy" class="form-control">
      <option value="1">Categoría 1</option>
      <option value="2">Categoría 2</option>
    </select>
  </div>
</div>

<!-- Select Basic -->
<div class="form-group">
  <label class="col-md-4 control-label" for="event">Evento</label>
  <div class="col-md-4">
    <select id="event" name="event" class="form-control">
      <option value="1">Evento 1</option>
      <option value="2">Evento 2</option>
    </select>
  </div>
</div>

<!-- Textarea -->
<div class="form-group">
  <label class="col-md-4 control-label" for="longdescription">Descripción detallada</label>
  <div class="col-md-4">                     
    <textarea class="form-control" id="longdescription" name="longdescription">default text</textarea>
  </div>
</div>

<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label" for="save"></label>
  <div class="col-md-4">
    <button id="save" name="save" class="btn btn-primary">Modificar</button>
  </div>
</div>

</fieldset>
</form>