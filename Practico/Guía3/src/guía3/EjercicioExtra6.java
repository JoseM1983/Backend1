/*
Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general.
 */
package guía3;
import java.util.Scanner;

public class EjercicioExtra6 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese la cantidad de personas de la muestra");
        int N = leer.nextInt();
        
    double sumaEstMay = 0;
    double sumaEstMen = 0;
    int mayor=0;
    int menor=0;
    
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese la estatura de la persona "+(i+1)+" de "+N);
            double estatura = leer.nextDouble();
            if (estatura>=1.60){
                sumaEstMay=sumaEstMay+estatura;
                mayor++;
            } else {
                sumaEstMen=sumaEstMen+estatura;
                menor++; 
                sumaEstMay=sumaEstMay+estatura;
                mayor++;
            }
        }
    double promMay=(sumaEstMay/mayor);
    double promMen=(sumaEstMen/menor);
        
    if (menor==0) {
        System.out.println("No hay nadie con estatura menor a 1.60");
        } else {
        System.out.println("El promedio de estatura que se encuentra por debajo de 1.60 es: "+promMen);
        System.out.println("El promedio de estatura general es: "+promMay);
        }
    }
}
