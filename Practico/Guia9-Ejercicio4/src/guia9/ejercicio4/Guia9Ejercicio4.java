/*

 */
package guia9.ejercicio4;

import java.util.Date;
import servicio.FechaServicio;

public class Guia9Ejercicio4 {

    public static void main(String[] args) {
    
    FechaServicio ss = new FechaServicio();
    Date nacimiento = ss.fechaDeNacimiento();
    Date fechaActual = ss.fechaActual();
    int edad = ss.diferencia(nacimiento, fechaActual);
    String descripcionnacimiento = nacimiento.toString();
    String descripcionActual = fechaActual.toString();
    System.out.println("La edad del usuario es "+edad);
    }
}
