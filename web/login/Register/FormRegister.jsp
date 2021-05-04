<%-- 
    Document   : FormRegister
    Created on : 30/05/2018, 12:41:55 PM
    Author     : Noah
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Registro</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="estilos.css" type="text/css">

    </head>
    <body>
        <div class="container">

    <form class="well form-horizontal" action="../../SERVPersona" method="post"  id="contact_form">
<fieldset>

<!-- Form Name -->
<legend><b>Formulario de Registro</b></legend>

<!-- Text input-->

<div class="form-group">
  <label class="col-md-4 control-label">Codigo</label>  
  <div class="col-md-4 inputGroupContainer">
  <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input  name="txtCodigo" placeholder="Code" class="form-control"  type="text" <% if(request.getAttribute("codigo")!=null){ %>   
                     value ='<%=request.getAttribute("codigo") %>'
                  <% } %> >
    </div>
  </div>
</div>



<div class="form-group">
  <label class="col-md-4 control-label">Nombres</label>  
  <div class="col-md-4 inputGroupContainer">
  <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input  name="txtNombres" placeholder="First Name" class="form-control"  type="text" <% if(request.getAttribute("nombres")!=null){ %>   
                     value ='<%=request.getAttribute("nombres") %>'
                  <% } %> >
    </div>
  </div>
</div>

<!-- Text input-->

<div class="form-group">
  <label class="col-md-4 control-label" >Apellidos</label> 
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input name="txtApellidos" placeholder="Last Name" class="form-control"  type="text" <% if(request.getAttribute("apellidos")!=null){ %>   
                     value ='<%=request.getAttribute("apellidos") %>'
                  <% } %> >
    </div>
  </div>
</div>

<!-- Text input-->
       <div class="form-group">
  <label class="col-md-4 control-label">Correo Electronico</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
  <input name="txtCorreo" placeholder="E-Mail Address" class="form-control"  type="text" <% if(request.getAttribute("correo")!=null){ %>   
                     value ='<%=request.getAttribute("correo") %>'
                  <% } %> >
    </div>
  </div>
</div>


<!-- Text input-->
       
<div class="form-group">
  <label class="col-md-4 control-label">Numero Celular</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-earphone"></i></span>
  <input name="txtCelular" placeholder="(845)555-1212" class="form-control" type="text" <% if(request.getAttribute("celular")!=null){ %>   
                     value ='<%=request.getAttribute("celular") %>'
                  <% } %> >
    </div>
  </div>
</div>

<!-- Text input-->
      
<div class="form-group">
  <label class="col-md-4 control-label">Direccion</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span>
  <input name="txtDireccion" placeholder="Address" class="form-control" type="text" <% if(request.getAttribute("direccion")!=null){ %>   
                     value ='<%=request.getAttribute("direccion") %>'
                  <% } %> >
    </div>
  </div>
</div>

<!-- Text input-->
 
<div class="form-group">
  <label class="col-md-4 control-label">Ciudad</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span>
  <input name="txtCiudad" placeholder="city" class="form-control"  type="text" <% if(request.getAttribute("ciudad")!=null){ %>   
                     value ='<%=request.getAttribute("ciudad") %>'
                  <% } %> >
    </div>
  </div>
</div>

<!-- Select Basic -->


<div class="form-group">
  <label class="col-md-4 control-label">Descripción acerca de ti</label>
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
        	<textarea class="form-control" name="txtDescripcion" placeholder="Description" <% if(request.getAttribute("descripcion")!=null){ %>   
                     value ='<%=request.getAttribute("descripcion") %>'
                  <% } %> ></textarea>
  </div>
  </div>
</div>

<!-- Success message -->
<div class="alert alert-success" role="alert" id="success_message">Success <i class="glyphicon glyphicon-thumbs-up"></i> Thanks for contacting us, we will get back to you shortly.</div>

<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label"></label>
  <div class="col-md-4">
    <button type="submit" class="btn btn-warning" name="btnRegistrar" >Enviar <span class="glyphicon glyphicon-send"></span></button>
  </div>
</div>

</fieldset>
</form>
</div>
    </body>
</html>
