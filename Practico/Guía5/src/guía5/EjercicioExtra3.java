/*
Crear una función rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o
procedimiento que imprima el vector.

 */
package guía5;
import java.util.Scanner;

public class EjercicioExtra3 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int tamano = leer.nextInt();
        
        rellenarVector(tamano);
        mostrarVector(rellenarVector(tamano), tamano);
    }
    public static int[] rellenarVector(int tamano){
    int[] vector = new int[tamano];
            for (int i = 0; i < tamano; i++) {
                vector[i]=(int)(Math.random()*10);
            }
    return vector;
            
    }
    public static void mostrarVector(int vector[], int tamano){
            for (int i = 0; i < tamano; i++) {
                System.out.print(vector[i]+" ");
            }
            System.out.println("");
    }
}