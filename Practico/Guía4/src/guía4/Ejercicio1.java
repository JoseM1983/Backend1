/*
Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.

 */
package guía4;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese 2 números");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        System.out.println("Que quiere hacer con los números ingresados");
        System.out.println("1-Sumar");
        System.out.println("2-Restar");
        System.out.println("3-Multiplicar");
        System.out.println("4-Dividir");
        int opcion = leer.nextInt();
        
        if (num2==0) {
            System.out.println("Tener en cuenta que se ingreso un cero en el segundo número por lo que no va a poder realizar la división. Desea cambiarlo? (s/n)");
            String cambio = leer.next();
            if (!cambio.equalsIgnoreCase("s")) {
                System.out.println("como desee");
            } else {
            num2 = leer.nextInt();
            }
        }
        
        switch (opcion) {
            case 1:
                int suma=sumar(num1,num2);
                System.out.println("El resultado es "+suma);
                break;
            case 2:
                int resta = restar(num1,num2);
                System.out.println("El resultado es "+resta);
                break;
            case 3:
                int multiplica = multiplicar(num1,num2);
                System.out.println("El resultado es "+multiplica);
                break;
            case 4:
                double division = dividir(num1,num2);
                System.out.println("El resultado es "+division);
                break;
        }
    }

                public static int sumar(int num1, int num2){
                int resultado;
                resultado = num1 + num2;
                return resultado;
                }
                public static int restar(int num1, int num2){
                int resultado;
                resultado = num1 - num2;
                return resultado;
                }
                public static int multiplicar(int num1, int num2){
                int resultado;
                resultado = num1 * num2;
                return resultado;
                }
                public static double dividir(int num1, int num2){
                double resultado;
                resultado = num1 / num2;
                return resultado;
                }
}


