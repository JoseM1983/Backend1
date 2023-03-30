/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos.
El programa deberá después mostrar el resultado de la suma
 */
package guía2;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese el primer número a sumar");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número a sumar");
        int num2 = leer.nextInt();
        
        // formas de exponer el resultado
        // 1-
        System.out.println("La suma de los números ingresados es igual a "+(num1+num2));
        
        // 2-
        int suma = num1+num2;
        System.out.println("La suma de los números ingresados es igual a "+suma);        
    }
}