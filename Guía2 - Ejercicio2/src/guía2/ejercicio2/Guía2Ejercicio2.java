/*
 Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla
 */
package guía2.ejercicio2;
import java.util.Scanner;

public class Guía2Ejercicio2 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese su nombre");
        String nombre = leer.nextLine();
        System.out.println("Tu nombre es "+nombre);
    }
    
}
