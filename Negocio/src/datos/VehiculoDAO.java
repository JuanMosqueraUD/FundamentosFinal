 package datos;

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
    public  void incluirVehiculo(Vehiculo vehiculo) throws PYException {
      try {
      
        String strSQL = "INSERT INTO Vehiculo (k_placa, i_tipo, n_marca, n_modelo, n_color, k_nomenclatura) VALUES(?,?,?,?,?,?)";
        Connection conexion = ServiceLocator.getInstance().tomarConexion();
        PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
        prepStmt.setString(1, vehiculo.getPlaca()); 
        prepStmt.setString(2, vehiculo.getTipo()); 
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
    
    public void modificarEmpleado(){
      //implementar
    }
    
    public void eliminarEmpleado(){
      //implementar
    }
    
    public Empleado buscarEmpleado(Integer employee_id) throws RHException {
        boolean existe = false;
        try {
            Empleado e = new Empleado(); //Instancia el objeto para retornar los datos del empleado
            String strSQL = "SELECT employee_id, first_name, last_name, job_id, email, hire_date FROM employees WHERE employee_id = ?";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setInt(1, employee_id);
            ResultSet rs = prepStmt.executeQuery();
            while (rs.next()) {
                e.setEmployee_id(rs.getInt(1));
                e.setFirst_name(rs.getString(2));
                rs.getString(3);
                rs.getString(4);
                rs.getString(5);
                rs.getDate(6);
                existe = true;
            }
            if (existe) 
                return e;
             else
                return null;
        } catch (SQLException e) {
            throw new RHException("EmpleadoDAO", e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }
    }
    
  
    public void actualizarSalario(int id, Double salario) throws RHException {
            if (buscarEmpleado(id) != null) {
                try{
                String strSQL = "UPDATE employees SET salary = ? WHERE employee_id = ? ";
                Connection conexion = ServiceLocator.getInstance().tomarConexion();
                PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
                prepStmt.setInt(1, id);
                prepStmt.setDouble(2, salario);
                prepStmt.executeUpdate();
                prepStmt.close();
                ServiceLocator.getInstance().commit();
                }
               catch (SQLException e) {
                    ServiceLocator.getInstance().rollback();
                    throw new RHException("EmpleadoDAO", "No pudo modificar salario " + e.getMessage());
                 } finally {
                      ServiceLocator.getInstance().liberarConexion();
                 }
            } else {
                 throw new RHException("EmpleadoDAO", "Empleado no existe ");
            }
         
    }
 }


