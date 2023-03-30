/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre
por pantalla el siguiente menú:El usuario deberá elegir una opción y el programa
deberá mostrar el resultado por pantalla y luego volver al menú.
El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que,
si el usuario selecciona la opción 5, en vez de salir del programa directamente,
se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir
del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa,
caso contrario se vuelve a mostrar el menú.
*/
package guía3;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
        String seguro="";
        System.out.println("Ingrese el primero de dos números enteros");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo");
        int num2 = leer.nextInt();
        double division = (num1/num2);
        
        do {
        System.out.println("Que desea realizar con los 2 números ingresados?");
        System.out.println("MENU");
        System.out.println("1-Suma");
        System.out.println("2-Resta");
        System.out.println("3-Multiplicar");
        System.out.println("4-Dividir");
        System.out.println("5-Salir");
        
        int opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("La suma de los números es "+(num1+num2));
            break;
            case 2:
                System.out.println("La resta de los números es "+(num1-num2));
            break;
            case 3:
                System.out.println("La multiplicación de los números es "+(num1*num2));
            break;
            case 4:
                if (num2==0) {
                    System.out.println("El denominador no puede ser cero");
                } else {
                    System.out.println("La division de los números es "+(division));
                }
            break;    
            case 5:
                System.out.println("Seguro desea salir (s/n)");
                seguro = leer.next();
                if (seguro.equals("s")) {
                    break;
                } 
            }
        } while (!seguro.equalsIgnoreCase("s"));
           
    }
}        
        
      
         
