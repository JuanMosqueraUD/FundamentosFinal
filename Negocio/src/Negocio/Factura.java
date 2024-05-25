/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

/**
 *
 * @author CARLOS
 */
public class Factura {
    public Factura(){
        
    }
    
    private String id_pago;
    private int valor_final;
    private String fecha_salida;

    public String getId_pago() {
        return id_pago;
    }

    public void setId_pago(String id_pago) {
        this.id_pago = id_pago;
    }

    public int getValor_final() {
        return valor_final;
    }

    public void setValor_final(int valor_final) {
        this.valor_final = valor_final;
    }

    public String getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }
    
    
    
    
}
