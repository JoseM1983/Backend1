/*
Realice un programa que calcule y visualice el valor máximo, el valor
mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra
con el bucle “do - while”.
*/
package guía3;
import java.util.Scanner;

public class EjercicioExtra7 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese la cantidad de números de la muestra");
        int muestra = leer.nextInt();
        
        while (muestra<1) {
            System.out.println("La muestra no puede ser negativa. Ingrese nuevamente el tamaño de la muestra");
            muestra = leer.nextInt();
            }
        
        System.out.println("Ingrese el número 1 de "+muestra);
        int num = leer.nextInt();
        int max = num;
        int min = num;
        int suma = num;
        int cont = 1;
        
        while (cont<=muestra-1){
            System.out.println("Ingrese el número "+(cont+1)+" de "+muestra);
            num = leer.nextInt();
            
            //if (num>max) {
            //    max=num;
            // }
            // Otra forma de ingresar el máximo sería:
            max = Math.max(max,num);    
            
            // if (num<min){
            //    min=num;
            // }
            // Otra forma de ingresar el mínimo sería:
            min = Math.min(min,num);
            
            suma=suma+num;
            cont++;
        }
        
        System.out.println("El máximo numero ingresado es el "+max);
        System.out.println("El mínimo numero ingresado es el "+min);
        System.out.println("El promedio de los número ingresados es "+(suma/cont));
    }
}
