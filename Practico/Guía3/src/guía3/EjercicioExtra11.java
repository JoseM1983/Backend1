/*
Escribir un programa que lea un número entero y devuelva el número de
dígitos que componen ese número. Por ejemplo, si introducimos el
número 12345, el programa deberá devolver 5. Calcular la cantidad de
dígitos matemáticamente utilizando el operador de división. Nota:
recordar que las variables de tipo entero truncan los números o
resultados.
*/
package guía3;
import java.util.Scanner;

public class EjercicioExtra11 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese un número y le calcularemos los dígitos del mismo");
        int num = leer.nextInt();
        int cont = 0;
        
        while (num==0) {
            System.out.println("El número debe ser distinto de cero");
            num=leer.nextInt();
        }
            
        do {
        num=(int) Math.floor(num/10);
        cont++;
        } while (((num)>=1) || ((num)<=-1)) ;
        
        System.out.println("El número ingresado contiene "+cont+" digitos");
    }
}
