/*
Escriba un programa que lea números enteros. Si el número es múltiplo
de cinco debe detener la lectura y mostrar la cantidad de números
leídos, la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben
sumarse. Nota: recordar el uso de la sentencia break.
 */
package guía3;
import java.util.Scanner;

public class EjercicioExtra8 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese número entero positivo");
        int num = leer.nextInt();
        
        int par = 0;
        int impar = 0;
        
        while (num%5!=0) {
            if (num%2==0){
            par++;
            } else {
            impar++;
            }
            System.out.println("Ingrese otro número par");
            num = leer.nextInt();
        }
        System.out.println("La cantidad de números leídos es "+(par+impar));        
        System.out.println("La cantidad de números pares es: "+par);
        System.out.println("La cantidad de números impares es: "+impar);
    }
}