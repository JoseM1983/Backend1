/*
Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).
 */
package guía2.ejercicio4;
import java.util.Scanner;

public class Guía2Ejercicio4 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese la cantidad de grados centigrados que quiere convertir a Fahrenheit?");
        double centigrados = leer.nextDouble();
        
        double fahre=32+(9*centigrados/5);
        
        System.out.println("El correspondiente a "+centigrados +" grados centígrados es "+fahre +" grados Fahrenheit");
    }
    
}
