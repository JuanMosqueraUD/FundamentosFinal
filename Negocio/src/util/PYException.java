/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author User
 */
public class PYException extends Exception {
      private String detalle;
      private String clase;
      /**
       * M�todo constructor que recoge la descripción del 
       * error que genero la excepción.
       * 
       * @param error
       *        cadena que contiene la descripción del error.
       */

      public PYException(String clase,String error) {
        super(error);
        this.clase = clase; 
        detalle = error;
      }

      public String toString() {
        return "["+clase+"] "+detalle;
      }
 }

