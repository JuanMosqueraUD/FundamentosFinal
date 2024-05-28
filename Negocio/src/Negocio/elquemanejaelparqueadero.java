/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;
import datos.VehiculoDAO;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import util.PYException;
/**
 *
 * @author Janus
 */
public class elquemanejaelparqueadero {
    private Vehiculo Vehiculo;
    private VehiculoDAO VehiculoDAO;
    
    public elquemanejaelparqueadero() {
       VehiculoDAO = new VehiculoDAO();
       
    }
    
  
   public void incluirVehiculo(String placa, String tipo, String area) throws PYException {

        Plaza Plaza = VehiculoDAO.buscarPlaza(area+Integer.toString(1));
        if(Plaza.estaOcupado()== false){
           Plaza.setEstado(true);
           Vehiculo Vehiculo = new Vehiculo();
           Vehiculo.setPlaca(placa);
           Vehiculo.setTipo(tipo);
           VehiculoDAO.incluirVehiculo(Vehiculo,Plaza);
           VehiculoDAO.updatePlaza(Plaza, Vehiculo);
           JOptionPane.showMessageDialog(null, "plaza asignada " + Plaza.getidPlaza());
        }else if(Plaza.estaOcupado()== true){
            Plaza = VehiculoDAO.buscarPlaza(area+Integer.toString(2));
            if(Plaza.estaOcupado()== false){
                Plaza.setEstado(true);
                Vehiculo Vehiculo = new Vehiculo();
                Vehiculo.setPlaca(placa);
                Vehiculo.setTipo(tipo);
                VehiculoDAO.incluirVehiculo(Vehiculo,Plaza);
                VehiculoDAO.updatePlaza(Plaza, Vehiculo);
                JOptionPane.showMessageDialog(null, "plaza asignada " + Plaza.getidPlaza());
            }else{
                JOptionPane.showMessageDialog(null, "no hay plazas disponibles en esta area");
            }
        }else{
            JOptionPane.showMessageDialog(null, "no hay plazas disponibles en esta area");
        }




    }
    public String tipoVehiculo(String placa){
        try{
        Vehiculo Vehiculo = VehiculoDAO.buscarTipoVehiculo(placa);
        Vehiculo.setPlaca(placa);
        String tipo= Vehiculo.getTipo();
        placa = Vehiculo.getPlaca();
        return tipo;
        }catch (PYException ex) {
            Logger.getLogger(elquemanejaelparqueadero.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
                
        
    }
   
    
    
    public void insertarFechaHoraEnBD(OffsetDateTime fechaHora, String direccion, String nombre) throws PYException{
        Registro Registro = new Registro();
        Parqueadero Parqueadero = new Parqueadero();
        Parqueadero.setDireccion(direccion);
        Parqueadero.setNombre(nombre);
        Registro.setFecha_ingreso(fechaHora);
        VehiculoDAO.insertarFechaHoraEnBD(fechaHora, Parqueadero);
    }
    
    
    public void insertarFechaHoraSalida(OffsetDateTime fechaHora, String placa) throws PYException{
        Vehiculo Vehiculo = new Vehiculo();
        Registro Registro = new Registro();
        Registro.setFecha_salida(fechaHora);
        Vehiculo.setPlaca(placa);
        VehiculoDAO.insertarFechaHoraSalida(fechaHora, Vehiculo);
        JOptionPane.showMessageDialog(null, "Recibo listo para generar");
    }
    
        public String getHoraEntrada(String placa){
        try {
            Factura Factura = VehiculoDAO.buscarFactura(placa);
            String entrada = Factura.getFecha_entrada();
            return entrada;
        } catch (PYException ex) {
            Logger.getLogger(elquemanejaelparqueadero.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
        
        public String getHoraSalida(String placa){
        try {
            Factura Factura = VehiculoDAO.buscarFactura(placa);
            String salida = Factura.getFecha_salida();
            return salida;
        } catch (PYException ex) {
            Logger.getLogger(elquemanejaelparqueadero.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
        
        public String gerIdpago(String placa){
        try{
           Factura Factura = VehiculoDAO.buscarFactura(placa);
           String id_pago = Factura.getId_pago();
           return id_pago;
        }catch (PYException ex) {
            Logger.getLogger(elquemanejaelparqueadero.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        }
    
    
        public int Tarifa(String Placa){
           Vehiculo Vehiculo = new Vehiculo();
           Tarifa Tarifa = new Tarifa();
           try{
            Vehiculo = VehiculoDAO.buscarTipoVehiculo(Placa);
            
           String tipo = Vehiculo.getTipo();
           Vehiculo.setPlaca(Placa);
           String placa = Vehiculo.getPlaca();
           
           
           Tarifa = VehiculoDAO.Tarifa(tipo, Placa);
           int tarifa= Tarifa.getValor();
           return tarifa;
           }catch (PYException ex) {
            Logger.getLogger(elquemanejaelparqueadero.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
        }
        
        
        
}



