/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;
import datos.VehiculoDAO;
import java.time.OffsetDateTime;
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
    
  
    public void incluirVehiculo(String placa, String tipo) throws PYException {
        Vehiculo Vehiculo = new Vehiculo();
        Vehiculo.setPlaca(placa);
        Vehiculo.setTipo(tipo);
        VehiculoDAO.incluirVehiculo(Vehiculo);
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
