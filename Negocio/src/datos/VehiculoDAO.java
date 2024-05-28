 package datos;

import Negocio.Factura;
import Negocio.Parqueadero;
import Negocio.Plaza;
import Negocio.Registro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.Timestamp;

import Negocio.Vehiculo;
import java.text.SimpleDateFormat;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.HashSet;
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
    
    public void insertarFechaHoraSalida(OffsetDateTime fechaHora, Vehiculo Vehiculo) throws PYException {
         try{
             
         
        String strSQL = "update registro set f_salida= ? where k_idregistro=(select k_idregistro from registro, vehiculo, plaza, area, parqueadero where (vehiculo.k_placa = ? and vehiculo.k_nomenclatura=plaza.k_nomenclatura and plaza.k_idArea=area.k_idArea and area.k_nombre=parqueadero.k_nombre and area.k_direccion=parqueadero.k_direccion and registro.k_nombre=parqueadero.k_nombre and registro.k_direccion=parqueadero.k_direccion))";
        Connection conexion = ServiceLocator.getInstance().tomarConexion();
        PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
        prepStmt.setObject(1,fechaHora); 
        prepStmt.setObject(2,Vehiculo.getPlaca()); 
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
    
  
    public Factura buscarFactura(String placa) throws PYException{
            boolean existe = false;
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Factura e = new Factura(); //Instancia el objeto para retornar los datos del empleado
            String strSQL = "select f_ingreso, f_salida, k_idregistro from registro\n" +
"where k_idregistro=(select k_idregistro from registro, vehiculo, plaza, area, parqueadero \n" +
"where (vehiculo.k_placa = ? and vehiculo.k_nomenclatura=plaza.k_nomenclatura \n" +
"and plaza.k_idArea=area.k_idArea and area.k_nombre=parqueadero.k_nombre \n" +
"and area.k_direccion=parqueadero.k_direccion \n" +
"and registro.k_nombre=parqueadero.k_nombre \n" +
"and registro.k_direccion=parqueadero.k_direccion))";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setString(1, placa);
            ResultSet rs = prepStmt.executeQuery();

            while (rs.next()) {
                Timestamp tsIngreso = rs.getTimestamp("f_ingreso");
                Timestamp tsSalida = rs.getTimestamp("f_salida");

                if (tsIngreso != null) {
                    String fechaIngreso = sdf.format(tsIngreso);
                    e.setFecha_entrada(fechaIngreso);
                }

                if (tsSalida != null) {
                    String fechaSalida = sdf.format(tsSalida);
                    e.setFecha_salida(fechaSalida);
                }

                e.setId_pago(rs.getString("k_idregistro"));
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
    
    
}


