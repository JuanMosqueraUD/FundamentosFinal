/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;
import datos.VehiculoDAO;
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
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setPlaca(placa);
        vehiculo.setTipo(tipo);
        VehiculoDAO.incluirVehiculo(vehiculo);
    }
}
