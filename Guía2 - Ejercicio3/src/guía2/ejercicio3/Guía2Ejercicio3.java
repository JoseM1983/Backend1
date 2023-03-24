/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package guía2.ejercicio3;
import java.util.Scanner;

public class Guía2Ejercicio3 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        
        System.out.println("La frase ingresada en mayusculas es:");
        System.out.println(frase.toUpperCase());
        
        System.out.println("La frase ingresada en minusculas es:");
        System.out.println(frase.toLowerCase());
    }
    
}
