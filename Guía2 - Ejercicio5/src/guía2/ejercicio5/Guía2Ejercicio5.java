/*
Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt().
 */
package guía2.ejercicio5;
import java.util.Scanner;

public class Guía2Ejercicio5 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero por teclado");
        int numero = leer.nextInt();
        
        System.out.println("El doble del número ingresado es: "+numero*2);
        System.out.println("El triple del número ingresado es: "+numero*3);
        double resultado=Math.sqrt(numero);
        System.out.println("La raíz cuadrada del número ingresado es: "+resultado);
        
        // Otra forma de mostrar el resultado sin guardar el resultado en una variable sería:
        System.out.println("La raíz cuadrada del número ingresado es: "+Math.sqrt(numero));
    }
    
}
