/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;
import datos.VehiculoDAO;
import java.time.OffsetDateTime;
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
    
    
    public void insertarFechaHoraEnBD(OffsetDateTime fechaHora) throws PYException{
        Registro Registro = new Registro();
        Registro.setFecha_ingreso(fechaHora);
        
        VehiculoDAO.insertarFechaHoraEnBD(fechaHora);
    }
    
    
    public void insertarFechaHoraSalida(OffsetDateTime fechaHora) throws PYException{
        Registro Registro = new Registro();
        Registro.setFecha_salida(fechaHora);
        VehiculoDAO.insertarFechaHoraSalida(fechaHora);
    }
}
