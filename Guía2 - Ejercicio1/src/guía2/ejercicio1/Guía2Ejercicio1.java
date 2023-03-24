/*
Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma
 */
package guía2.ejercicio1;
import java.util.Scanner;
        
public class Guía2Ejercicio1 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número que desea sumar");
        
        // Declaro el tipo de variable al mismo tiempo que la solicito al usuario
        // Tambien podría haberla declarado anteriormente para luego solicitarla por Scanner
        
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número que a sumar");
        int num2 = leer.nextInt();
        
        int suma = num1 + num2;
        
        // Muestro las 2 formas de presentarlo por pantalla
        System.out.println("La suma de ambos números es igual a "+suma);
        System.out.println("La suma de ambos números es igual a "+(num1+num2));
    }
    
}
