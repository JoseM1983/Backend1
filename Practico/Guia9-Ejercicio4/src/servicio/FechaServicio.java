
package servicio;

import java.util.Date;
import java.util.Scanner;

public class FechaServicio {
    
    public Date fechaDeNacimiento(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el día de Nacimiento");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes de Nacimiento");
        int mes = (leer.nextInt()-1);
        System.out.println("Ingrese el año de Nacimiento");
        int anio = (leer.nextInt()-1900);
        return new Date(anio,mes,dia);
    }
    public Date fechaActual(){
        return new Date();
    }
    public int diferencia(Date nacimiento,Date actual){
        int edad;
        if (nacimiento.getMonth()>actual.getMonth()){
            edad = (actual.getYear()-nacimiento.getYear()-1);
        } else if (nacimiento.getMonth() == actual.getMonth()){
            if (nacimiento.getDate()>actual.getDate()){
                edad = (actual.getYear()-nacimiento.getYear()-1);
            } else {
                edad = (actual.getYear()-nacimiento.getYear());
            }
        } else {
            edad = (actual.getYear()-nacimiento.getYear());
        }
        return edad;
    } 
}
