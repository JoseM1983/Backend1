/*
Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario.
 */
package guía5;
import java.util.Scanner;

public class EjercicioExtra1 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in); 
        System.out.println("Ingrese el tamaño del vector");
        int tamano = leer.nextInt();
        int[] vector = new int[tamano];
    
        int suma=0;
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un número para la posicion "+i+" del vector de tamaño "+vector.length);
            vector[i]=leer.nextInt();
            suma+= vector[i];
        }
        System.out.println("La suma de los números ingresados es "+suma);
    }
}
