/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial.
*/
package guía3;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese un número que sera el límite de la suma");
        int limite = leer.nextInt();
        int suma=0;
        int num;
        
        do {
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            suma=suma+num;
        } while (suma<=limite);
    }
}      