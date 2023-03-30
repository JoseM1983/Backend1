/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene
una M cantidad de hijos. Escriba un programa que pida la cantidad de
familias y para cada familia la cantidad de hijos para averiguar la media
de edad de los hijos de todas las familias.
 */
package guía3;
import java.util.Scanner;

public class EjercicioExtra14 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        int suma = 0;
        int cont=0;
        
        System.out.println("Ingrese la cantidad de familias");
        int n = leer.nextInt();
               
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la cantidad de hijos de la familia "+(i+1)+" de "+n);
            int m = leer.nextInt();
            for (int j = 0; j < m; j++) {
                System.out.println("Ingrese la edad del hijo "+(j+1)+" de "+m);
                int edad = leer.nextInt();
                suma=suma+edad;
                cont++;
            }
        }
        System.out.println("La media de edad de los hijos de todas las familias es "+(suma/(cont)));
    }
}
