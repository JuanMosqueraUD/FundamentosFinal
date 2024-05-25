/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

/**
 *
 * @author CARLOS
 */
public class Parqueadero {
    
    private String nombre;
    private String direccion;
    private String localidad;
    private int niveles_superiores;
    private int niveles_subterraneos;
   
    
     public Parqueadero(){
        
     }   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public int getNiveles_superiores() {
        return niveles_superiores;
    }

    public void setNiveles_superiores(int niveles_superiores) {
        this.niveles_superiores = niveles_superiores;
    }

    public int getNiveles_subterraneos() {
        return niveles_subterraneos;
    }

    public void setNiveles_subterraneos(int niveles_subterraneos) {
        this.niveles_subterraneos = niveles_subterraneos;
    }
    
     
     
}
