/*function mostrarEquipos(){
    document.getElementById("manEquipos").style.display = "block";
    document.getElementById("manCualquierCosa").style.display = "none";
}
function mostrarOtraCosa(){
    document.getElementById("manCualquierCosa").style.display = "block";
    document.getElementById("manEquipos").style.display = "none";
}*/
function buscarRegistro(idTxt, idTb){
    var tableReg = document.getElementById(idTb);
    var searchText = document.getElementById(idTxt).value.toLowerCase();
    var cellsOfRow="";
    var found=false;
    var compareWith="";

    // Recorremos todas las filas con contenido de la tabla
    for (var i = 1; i < tableReg.rows.length; i++)
    {
            cellsOfRow = tableReg.rows[i].getElementsByTagName('td');
            found = false;
            // Recorremos todas las celdas
            for (var j = 0; j < cellsOfRow.length && !found; j++)
            {
                    compareWith = cellsOfRow[j].innerHTML.toLowerCase();
                    // Buscamos el texto en el contenido de la celda
                    if (searchText.length == 0 || (compareWith.indexOf(searchText) > -1))
                    {
                            found = true;
                    }
            }
            if(found)
            {
                    tableReg.rows[i].style.display = 'table-row';
            } else {
                    // si no ha encontrado ninguna coincidencia, esconde la
                    // fila de la tabla
                    tableReg.rows[i].style.display = 'none';
            }
    }
}

/*function seleccionarElemento(id){
    document.getElementById("test"+id).checked = true;
    document.getElementById("btnConsultar").click();
}*/
function enabledID(){
    var txtId = document.getElementById("disabled");
    txtId.removeAttribute("disabled");
}
/*
function resetForm(id){
   document.getElementById(id).reset();
}*/