/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
muestre su equivalente en romano.
*/
package guía3;
import java.util.Scanner;

public class EjercicioExtra4 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese un numero del 1 al 10 para convertirlo a Romano");
        int num = leer.nextInt();
        
        while (num<1 || num >10) {
            System.out.println("El número ingresado no esta dentro del parámetro. Ingrese otro número");
            num = leer.nextInt();
        }
    
        switch (num){
            case 1:
                System.out.println("El numero "+num+" en Romanos es: I");
                break;
            case 2:
                System.out.println("El numero "+num+" en Romanos es: II");
                break;
            case 3:
                System.out.println("El numero "+num+" en Romanos es: III");
                break;
            case 4:
                System.out.println("El numero "+num+" en Romanos es: IV");
                break;
            case 5:
                System.out.println("El numero "+num+" en Romanos es: V");
                break;
            case 6:
                System.out.println("El numero "+num+" en Romanos es: VI");
                break;
            case 7:
                System.out.println("El numero "+num+" en Romanos es: VII");
                break;
            case 8:
                System.out.println("El numero "+num+" en Romanos es: VIII");
                break;
            case 9:
                System.out.println("El numero "+num+" en Romanos es: IX");
                break;
            default:
                System.out.println("El numero "+num+" en Romanos es: X");
        
        
        
        }
    }
}
