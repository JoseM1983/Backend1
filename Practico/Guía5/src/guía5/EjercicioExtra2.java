/*
Escriba un programa que averigüe si dos vectores de N enteros son
iguales (la comparación deberá detenerse en cuanto se detecte alguna
diferencia entre los elementos).
 */
package guía5;
import java.util.Scanner;

public class EjercicioExtra2 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in); 
        System.out.println("Ingrese el tamaño de los vectores a comparar");
        int tamano = leer.nextInt();
        int[] vector1 = new int[tamano];
        int[] vector2 = new int[tamano];
        
        for (int i = 0; i < tamano; i++) {
        vector1[i] = leer.nextInt(); //(int)(Math.random()*10);
        vector2[i] = leer.nextInt();//(int)(Math.random()*10);
        }
        
        for (int i = 0; i < tamano; i++) {
            System.out.print(vector1[i]+" ");
        }
        System.out.println("");
        for (int i = 0; i < tamano; i++) {
            System.out.print(vector2[i]+" ");
        }
        System.out.println("");
        int cont=0;
        for (int i = 0; i < tamano; i++) {
            if (vector1[i]!=vector2[i]){
               cont++;
            }
        }
            if (cont>0){
                System.out.println("Los vectores no son iguales");
            }else{
                System.out.println("Los vectores son iguales");
            }
    }
}

