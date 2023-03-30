/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
 */
package guía2;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el nombre");
        String nombre = leer.nextLine();
        System.out.println("Hola "+nombre);
}
}