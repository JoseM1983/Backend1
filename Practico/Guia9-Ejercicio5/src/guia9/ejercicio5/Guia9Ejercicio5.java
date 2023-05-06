/*
Implemente la clase Persona en el paquete entidades. Una persona tiene
un nombre y una fecha de nacimiento (Tipo Date), constructor vacío,
constructor parametrizado, get y set. Crear una clase PersonaService,
en el paquete servicio, con los siguientes métodos:
a) Método crearPersona que pida al usuario Nombre y fecha de
nacimiento de la persona a crear. Retornar el objeto Persona creado.
b) Método calcularEdad que calcule la edad del usuario utilizando el
atributo de fecha de nacimiento y la fecha actual.
c) Método menorQue recibe como parámetro una Persona y una edad.
Retorna true si la persona es menor que la edad consultada o false
en caso contrario.
d) Método mostrarPersona que muestra la información de la persona
deseada.
*/
package guia9.ejercicio5;

import entidades.Persona;
import java.util.Scanner;
import servicio.PersonaService;

public class Guia9Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonaService ss = new PersonaService();
        Persona Persona1 = ss.crearPersona();
        int edad = ss.calcularEdad(Persona1);
        System.out.println("Ingrese una edad para saber si la persona es menor a dicha edad");
        int consulta = leer.nextInt();
        System.out.println(ss.menorQue(Persona1, consulta));
        ss.mostrarPersona(Persona1);
    }
    
}
