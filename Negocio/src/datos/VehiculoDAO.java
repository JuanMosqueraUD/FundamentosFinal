 package datos;

import Negocio.Parqueadero;
import Negocio.Plaza;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.Timestamp;

import Negocio.Vehiculo;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
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
    public  void incluirVehiculo(Vehiculo Vehiculo) throws PYException {
      try {
      
        String strSQL = "INSERT INTO Vehiculo (k_placa, i_tipo) VALUES(?,?)";
        Connection conexion = ServiceLocator.getInstance().tomarConexion();
        PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
        prepStmt.setString(1, Vehiculo.getPlaca()); 
        prepStmt.setString(2, Vehiculo.getTipo()); 
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
    
     public void registrarSalidaVehiculo(String placa, LocalDateTime fechaSalida) {
        Connection conexion = null;
        CallableStatement stmt = null;

        try {
            // Establecer la conexión con la base de datos
            conexion = ServiceLocator.getInstance().tomarConexion();

            // Llamar a la función almacenada
            String sql = "{ call registrar_salida_vehiculo(?, ?) }";
            stmt = conexion.prepareCall(sql);
            stmt.setString(1, placa);
            stmt.setTimestamp(2, Timestamp.valueOf(fechaSalida));

            // Ejecutar la llamada
            stmt.execute();

            System.out.println("Salida registrada para el vehículo con placa: " + placa);
        } catch (SQLException se) {
            // Manejo de errores JDBC
            se.printStackTrace();
        } catch (Exception e) {
            // Manejo de errores de Class.forName
            e.printStackTrace();
        } finally {
            // Bloque finally para cerrar recursos
            try {
                if (stmt != null) stmt.close();
            } 
           catch (SQLException se2) {
            } // No hace nada
            try {
                if (conexion != null) conexion.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
     
    public void insertarFechaHoraEnBD(OffsetDateTime fechaHora, Parqueadero Parqueadero ) throws PYException {
         try{
             
         
        String strSQL = "INSERT INTO Registro (f_ingreso, k_direccion, k_nombre) VALUES (?,?,?) ";
        Connection conexion = ServiceLocator.getInstance().tomarConexion();
        PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
        prepStmt.setObject(1,fechaHora);
        prepStmt.setString(2, Parqueadero.getDireccion()); 
        prepStmt.setString(3,Parqueadero.getNombre()); 
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
    
    public void insertarFechaHoraSalida(OffsetDateTime fechaHora) throws PYException {
         try{
             
         
        String strSQL = "INSERT INTO Registro f_salida VALUES (?)";
        Connection conexion = ServiceLocator.getInstance().tomarConexion();
        PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
        prepStmt.setObject(1,fechaHora); 
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
        String strSQL = "UPDATE plaza set i_estaocupado = ? where k_nomenclatura = ?";
        Connection conexion = ServiceLocator.getInstance().tomarConexion();
        PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
        prepStmt.setBoolean(1, plaza.estaOcupado()); 
        prepStmt.setString(2, plaza.getidPlaza()); 
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
    
    public  void incluirParqueadero(Parqueadero Parqueadero) throws PYException {
      try {
      
        String strSQL = "UPDATE Registro set k_direccion = ?, k_nombre= ? WHERE k_direccion = ? and k_nombre= ?" ;
        Connection conexion = ServiceLocator.getInstance().tomarConexion();
        PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
        prepStmt.setString(1, Parqueadero.getDireccion()); 
        prepStmt.setString(2,Parqueadero.getNombre()); 
        prepStmt.setString(3, Parqueadero.getDireccion()); 
        prepStmt.setString(4,Parqueadero.getNombre()); 
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
}


