/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import java.time.*;

/**
 *
 * @author CARLOS
 */
public class Registro {
    
    private String id;
    private String fecha_ingreso;
    private String minutos_totales;
    private String tipo_servicio;
    

    
    public Registro(){
       
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getMinutos_totales() {
        return minutos_totales;
    }

    public void setMinutos_totales(String minutos_totales) {
        this.minutos_totales = minutos_totales;
    }

    public String getTipo_servicio() {
        return tipo_servicio;
    }

    public void setTipo_servicio(String tipo_servicio) {
        this.tipo_servicio = tipo_servicio;
    }
    
    
}
