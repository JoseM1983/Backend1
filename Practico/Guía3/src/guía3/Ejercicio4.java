/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’.
Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”,
en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Substring y equals() de Java.
 */
package guía3;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese una frase de 8 caracteres");
        String frase = leer.nextLine();

        if (frase.length()==8) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");}
    }
}        
