/*
Crear un programa que dado un número determine si es par o impar.
 */

package guía3;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese un número para determinar si es par o no");
        int num = leer.nextInt();
    
        if (num%2==0) {
        System.out.println("El número es par");
        } else {
        System.out.println("El número es impar");
        }
    }
}