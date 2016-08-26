<%-- 
    Document   : index
    Created on : 26-abr-2016, 15:43:28
    Author     : Kevin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://displaytag.sf.net/el" prefix="display" %>
<%@page import="com.sv.udb.controlador.LugaAcceCtrl"%>
<!--%@page import="com.sv.udb.controlador.ProveedorCtrl"%>
<!--%@page import="com.sv.udb.modelo.Proveedor"%-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/estilo.css">
	<link rel="stylesheet" type="text/css" href="css/materialize.min.css">
        <link rel="stylesheet" type="text/css" href="css/icon.css">
        <link rel="stylesheet" href="iconos/style.css">
        <title>Lugar Acceso</title>
    </head>
    <body>
        <jsp:include page="inc/nav.jsp" flush="true"/>
        <div id="contenedor" >
            <div id="manEquipos">
                <div id="mensajes">
                <h1 class="center tituloMan">Lugar Acceso</h1>
            </div>
            <form id="frm" method="POST" action="LugaAcceServ">
                <div id="formulario">


                        <div class="row">
                            <div class="input-field col s12">
                                <input id="txtID" disabled placeholder="Código"  type="text" class="validate" name="txtID" value="${txtID}">
                            <label for="disabled">Código</label>
                          </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input id="txtNombre" placeholder="Nombre" type="text" class="validate" name="txtNombre" value="${txtNombre}">
                            <label for="nombre">Nombre</label>
                          </div>
                        </div>
                        <div class="row">
                        <div class="input-field col s6">
                            <input class="btn waves-effect waves-light" style="width: 100%; padding: 0px;" type="Submit" name="cursBoton" value="Guardar"/>
                        </div>
                        <div class="input-field col s6">
                            <input class="btn waves-effect waves-light" style="width: 100%; padding: 0px;" type="Submit" name="cursBoton" value="Modificar"  />
                        </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s6">
                                <input class="btn waves-effect waves-light" style="width: 100%; padding: 0px;" type="Submit" name="cursBoton" value="Eliminar"  />
                            </div>
                            <div class="input-field col s6">
                                 <input class="btn waves-effect waves-light" style="width: 100%; padding: 0px; text-decoration: none;" type="button" name="btnLimpiar" onclick="resetForm()" value="Limpiar"/>
                            </div>
                        </div>
                </div>
                <div id="registros">
                    <jsp:useBean id="frijol" class="com.sv.udb.controlador.LugaAcceCtrl" scope="page"/>
                    <div class="row">
                        <div class="input-field col s8">
                            <input  type="text" class="validate" id="txtBuscar" onkeyup="buscarRegistro('txtBuscar','tbData')">
                        <label for="disabled">Buscar Registro</label>
                        </div>
                        <div class="input-field col s4">
                            <h2 class="left menMan" id="mensAler">Estado: ${mensAler}</h2>
                        </div>
                    </div>
                        <table class="centered" style="color: #fff; background: #26A69A;">
                            <thead>
                                <tr>
                                    <th>Nombre</th>
                                    <th>Fecha Alta</th>
                                    
                                    <th style="display: none;"><span class="icon-appleinc"></span></th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${LugaAcceCtrl.ConsTodo()}" var="fila">
                                    <tr>
                                        <td><c:out value="${fila.nombLugaAcce}"></c:out></td>
                                        <td><c:out value="${fila.fechAlta}"></c:out></td>
                                        <td><input class="with-gap radioButton" type="radio" id="test<c:out value="${fila.codiLugaAcce}"></c:out>" value="<c:out value="${fila.codiLugaAcce}"></c:out>" name="radioButton" />
                                    <label for="test<c:out value="${fila.codiLugaAcce}"></c:out>"></labe></td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>

                    <!--div id="tabla">
                            
                    </div-->
                        <input class="btn waves-effect waves-light left" style="margin-top: 14px; display: none;" type="Submit" name="cursBoton" value="Consultar" id="btnConsultar" />

                </div>
            </form>

        </div>
    </body>
    <script src="js/jquery-2.1.3.js" charset="utf-8"></script>
    <script src="js/materialize.min.js" charset="utf-8"></script>
    <script src="js/dinamico.js" charset="utf-8"></script>
     <script>
         function seleccionarElemento(id){
            document.getElementById("test"+id).checked = true;
            document.getElementById("btnConsultar").click();
        }
        function enabledID(){
            var txtId = document.getElementById("disabled");
            txtId.removeAttribute("disabled");
            alert("HOLA");
            document.getElementById("LugaAcceServ").submit();
        }
        function resetForm(id){
           document.getElementById(id).reset();
        }
        $(document).on("pageload",function(){
          
        });
    	$('.button-collapse').sideNav({
	      menuWidth: 300, // Default is 240
	      edge: 'right', // Choose the horizontal origin
	      closeOnClick: true // Closes side-nav on <a> clicks, useful for Angular/Meteor
	    }
	  );
       
    </script>
    <script>
        function resetForm(){
            $("#disabled").val(null);
            $("#nombre").val(null);
            $("#tipo").val(null);
            $("#direccion").val(null);
            $("#telefono").html(null);
            $("#Estado").html(null);
            $("#disabled").attr("disabled", true);
        }
        function ocultar(){
            $("#tbData th:last-child").attr("style", "display: none;");
            $("#tbData td:last-child").attr("style", "display: none;");
            $("#tbData thead").attr("style", "display: none;");
        }
        function consultar(){
            $("#tbData tr").click(function(event) {
                var n = $(this).find("input.radioButton").val();
                var id = "test"+n;
                //$("#test"+n).attr("checked", true); // A VECES FALL :|
                document.getElementById(id).checked = true;
                //alert(id);
                //$("#btnConsultar").click();
                document.getElementById("btnConsultar").click();
                event.preventDefault();
            });
        }
        $(document).ready(function() {
            //OCULTAMOS LA ULTIMA COLUMNA DE LA TABLA DONDE SE MANTIENE EL RADIO BUTTON
            ocultar();
            //LE DECIMOS QUE AL DAR CLICK EN UNA FILA, ESTE SELECCIONE EL RADIO BUTTON CORRESPONDIENTE Y CLICKEE EL BOTON CONSULTAR
            consultar();
            //CURS BOTON
            
        });
    </script>
</html>
