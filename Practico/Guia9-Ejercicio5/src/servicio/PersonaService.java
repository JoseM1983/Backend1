/*

 */
package servicio;

import entidades.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {
    
    public Persona crearPersona(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona");
        String nombre = leer.nextLine();
        System.out.println("Ingrese el día de nacimiento");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        int mes = leer.nextInt()-1;
        System.out.println("Ingrese el año de nacimiento");
        int anio = leer.nextInt()-1900;
        Date fechaDeNacimiento = new Date(anio,mes,dia);
        return new Persona(nombre, fechaDeNacimiento);
    }
    public int calcularEdad(Persona Persona1){
        Date actual = new Date();
        int edad;
        
        if (Persona1.getFechaDeNacimiento().getMonth()>actual.getMonth()){
            edad = (actual.getYear()-Persona1.getFechaDeNacimiento().getYear()-1);
        } else if (Persona1.getFechaDeNacimiento().getMonth() == actual.getMonth()){
            if (Persona1.getFechaDeNacimiento().getDate()>actual.getDate()){
                edad = (actual.getYear()-Persona1.getFechaDeNacimiento().getYear()-1);
            } else {
                edad = (actual.getYear()-Persona1.getFechaDeNacimiento().getYear());
            }
        } else {
            edad = (actual.getYear()-Persona1.getFechaDeNacimiento().getYear());
        }
        return edad;
    }
    public boolean menorQue(Persona persona1,int consulta){
        return calcularEdad(persona1)<consulta;
    }
    public void mostrarPersona(Persona persona1){
        System.out.println("Nombre "+persona1.getNombre());
        System.out.println("Fecha de Nacimiento: "+ persona1.getFechaDeNacimiento());
    }
}
