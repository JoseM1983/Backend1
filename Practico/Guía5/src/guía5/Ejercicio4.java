/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
A se denota por B y se obtiene cambiando sus filas por columnas (o
viceversa).
 */
package guía5;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
    int[][] matriz = new int[4][4];
    
    String aux;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j]=(int) (Math.random()*10);
            }
        }
        for (int[] fila: matriz){
        aux ="";
            for (int elemento: fila) {
                aux+= elemento + " ";
        } 
            System.out.println(aux);   
        }
        System.out.println("");
        
        //Traspuesta
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[j][i]+" ");
            }
            System.out.println("");
        }
    }
}
