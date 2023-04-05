/*
Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.

 */
package guía5;

public class Ejercicio1 {

    public static void main(String[] args) {
    
        int[] vector = new int[100];
        
        for (int i = 0 ; i < vector.length; i++) {
        vector[i]=vector.length-1-i;
        }
        
        String aux="";
        
        System.out.println("Vector");
        for (int elemento: vector){
        aux = aux + " " + elemento;
        // aux += " "+elemento;
        }
        System.out.println(aux);
    }
}
