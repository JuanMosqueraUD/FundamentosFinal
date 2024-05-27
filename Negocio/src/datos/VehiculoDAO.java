 package datos;

import Negocio.Plaza;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import Negocio.Vehiculo;
import util.PYException;
import util.ServiceLocator;

/**
 * @author Alba Consuelo Nieto.
 * Esta clase encapsula el acceso a la Base de Datos
 */
public class VehiculoDAO {
    /*
     * Constructor de la clase
     */
    public VehiculoDAO(){
  
    }
    /**
     * Incluye una nueva fila en la tabla EMPLOYEES.
     * @throws RHException
     */
    public  void incluirVehiculo(Vehiculo Vehiculo, Plaza Plaza) throws PYException {
      try {
      
        String strSQL = "INSERT INTO Vehiculo (k_placa, i_tipo, k_nomenclatura) VALUES(?,?,?)";
        Connection conexion = ServiceLocator.getInstance().tomarConexion();
        PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
        prepStmt.setString(1, Vehiculo.getPlaca()); 
        prepStmt.setString(2, Vehiculo.getTipo()); 
        prepStmt.setString(3, Plaza.getidPlaza()); 
        prepStmt.executeUpdate();
        prepStmt.close();
        ServiceLocator.getInstance().commit();
        
        
      } catch (SQLException e) {
           ServiceLocator.getInstance().rollback();
           throw new PYException( "EmpleadoDAO", "No pudo crear el vehiculo"+ e.getMessage());
      }  finally {
         ServiceLocator.getInstance().liberarConexion();
      }
      
    }
    
    public Plaza buscarPlaza(String nomenclaturaPlaza) throws PYException {
        boolean existe = false;
        try {
            Plaza e = new Plaza(); //Instancia el objeto para retornar los datos del empleado
            String strSQL = "SELECT k_nomenclatura, i_estaocupado FROM plaza WHERE k_nomenclatura = ?";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setString(1, nomenclaturaPlaza);
            ResultSet rs = prepStmt.executeQuery();
            while (rs.next()) {
                e.setidPlaza(rs.getString("k_nomenclatura"));
                e.setEstado(rs.getBoolean("i_estaocupado"));
                existe = true;
            }
            if (existe) 
                return e;
             else
                return null;
        } catch (SQLException e) {
            throw new PYException("VahiculoDAO", e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }
    }
    
    public void updatePlaza(Plaza plaza, Vehiculo vehiculo) throws PYException{
        try {
        String strSQL = "UPDATE plaza set i_estaocupado = ?, k_placa = ? where k_nomenclatura = ?";
        Connection conexion = ServiceLocator.getInstance().tomarConexion();
        PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
        prepStmt.setBoolean(1, plaza.estaOcupado()); 
        prepStmt.setString(2, vehiculo.getPlaca()); 
        prepStmt.setString(3, plaza.getidPlaza()); 
        prepStmt.executeUpdate();
        prepStmt.close();
        ServiceLocator.getInstance().commit();
        
        
      } catch (SQLException e) {
           ServiceLocator.getInstance().rollback();
           throw new PYException( "EmpleadoDAO", "No pudo crear el empleado"+ e.getMessage());
      }  finally {
         ServiceLocator.getInstance().liberarConexion();
      }
      
    }
    

    public void eliminarEmpleado(){
      //implementar
    }
    
    
 
 }


