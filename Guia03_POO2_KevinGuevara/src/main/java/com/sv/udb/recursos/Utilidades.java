/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.recursos;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Kevin
 */
public class Utilidades {
    
    public String mostrarFecha(Date date_s){
        SimpleDateFormat dt = new SimpleDateFormat("dd/mm/yyyy"); 
        String date = dt.format(date_s);
        return date;
    }

}
