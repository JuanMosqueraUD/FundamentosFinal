/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Negocio;

import datos.VehiculoDAO;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.HomeAdmin;
import main.Login;
import util.PYException;

/**
 *
 * @author User
 */
public class Negocio {

    /**
     * @param args the command line arguments
     */
  public static void main(String args[]) {
      VehiculoDAO VehiculoDAO = new VehiculoDAO();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });

    }
    
}
