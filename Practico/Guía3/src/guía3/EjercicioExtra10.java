/*
Realice un programa para que el usuario adivine el resultado de una
multiplicación entre dos números generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta. En
caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package guía3;
import java.util.Scanner;

public class EjercicioExtra10 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
        System.out.println("A continuación debera adivinar una multiplicación entre 2 número enteros del 0 al 10. Tiene 3 posibilidades");
        double num1 = Math.floor(Math.random()*10);
        double num2 = Math.floor(Math.random()*10);
        
        System.out.println(num1);
        System.out.println(num2);
        
        double multip = (num1*num2);
        int cont = 0;
        int result =0;
        
        do {
            System.out.println("Cual es el resultado de la multiplicación?");
            result = leer.nextInt();
            cont++;
            if (multip==result){
                System.out.println("Felicitaciones!!!");
            break;
            } else {
                System.out.println("Respuesta incorrecta. Tiene "+(3-cont)+" chances");
            }
        } while ((cont<3) || (result==multip));
        
        if (cont==3) {
            System.out.println("Lo sentimos. Ha utilizado todas las chances");
        }
    }
}
