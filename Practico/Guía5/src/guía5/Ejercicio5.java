/*
Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
obtiene cambiando sus filas por columnas (o viceversa).
 */
package guía5;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de las matrices");
        int tamano = leer.nextInt();
        int [][] matriz = new int[tamano][tamano];
        
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                System.out.println("Ingrese el valor de la posición. Fila: "+i+" Columna: "+j);
                matriz[i][j]=leer.nextInt();
            }
        }
        int cont=0;
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                if ((matriz[i][j])!= -(matriz[j][i])) {
                cont++;    
                }
            }
        }
        if (cont>0){
            System.out.println("La matriz no es antisimétrica");
        } else {
            System.out.println("La matriz es antisimétrica");
        }
    }
}