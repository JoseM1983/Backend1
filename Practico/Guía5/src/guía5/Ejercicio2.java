/*
Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido
*/
package guía5;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector");
        int tamano = leer.nextInt();
        int[] vector = new int[tamano];
        
        for (int i = 0; i < tamano; i++) {
        vector[i] = (int) (Math.random()*10);
        }
        
        System.out.println("Cual es el número a buscar dentro del vector");
        int num = leer.nextInt();
        int cont=0;
        
        for (int i = 0; i < tamano; i++) {
            if (vector[i]==num) {
                System.out.println("El número se encuentra en la posición: " +i);
                cont++;
            }
        }
        System.out.println("El número ingresado apararece en el arrego "+cont+" veces");
        
    }
}
