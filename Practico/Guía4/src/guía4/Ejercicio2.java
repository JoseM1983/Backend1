/*
Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.
 */
package guía4;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        String opcion;
    
    do {
        System.out.println("Ingrese el nombre de la persona");
        String nombre = leer.next();
        System.out.println("Ingrese la edad");
        int edad = leer.nextInt();
        
        impresion(nombre,edad);
        
        System.out.println("");
        System.out.println("Quiere ingresar otra persona?(Si/No)");
        opcion = leer.next();
        
        while ((!"Si".equalsIgnoreCase(opcion)) && (!"No".equalsIgnoreCase(opcion))) {
            System.out.println("La respuesta es incorrecta. Ingresela nuevamente (Si/No)");
            opcion = leer.next();
        }
    } while ("Si".equalsIgnoreCase(opcion));
        System.out.println("Hasta pronto!!!");
    }
    
    public static void impresion(String nombre, int edad){
        if (edad>=18){
            System.out.println("Su nombre es "+nombre+", tiene "+edad+" años por lo que es mayor de edad");
        } else {
            System.out.println("Su nombre es "+nombre+", tiene "+edad+" años por lo que es menor de edad");
        }
    }
}
