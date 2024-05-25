/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

/**
 *
 * @author CARLOS
 */
public class Plaza {
    
    private boolean estado;
    private String id_plaza;
    
    
    public Plaza(){
        
    }

    public boolean estaOcupado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getidPlaza() {
        return id_plaza;
    }

    public void setidPlaza(String id_plaza) {
        this.id_plaza = id_plaza;
    }
    
    
}
