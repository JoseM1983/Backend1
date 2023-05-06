/*
Realizar un programa que llene una matriz de tamaño NxM con valores
aleatorios y muestre la suma de sus elementos.
 */
package guía5;
import java.util.Scanner;

    public class EjercicioExtra5 {
        
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Indique el tamaño de la matriz");
        System.out.println("Filas(N)");
        int filas = leer.nextInt();
        System.out.println("Columnas(M)");
        int columnas = leer.nextInt();
    
    rellenarMatriz(filas,columnas);
    mostrarMatriz(rellenarMatriz(filas,columnas),filas,columnas);    
    }
    
    public static int[][] rellenarMatriz(int filas, int columnas){
    int matriz[][] = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int) (Math.random()*10);
            }
        }
    return matriz;
    }
    
    public static void mostrarMatriz(int matriz[][], int filas, int columnas){
        int suma = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("["+matriz[i][j]+"]");
                suma = suma + matriz[i][j];
            }
            System.out.println("");
        }
        System.out.println("La suma de todos los números de la matriz es: "+suma);
    }
    
}
