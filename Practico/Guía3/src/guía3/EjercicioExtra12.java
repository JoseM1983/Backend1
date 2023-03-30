/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
números del 0-0-0 al 9-9-9, con la particularidad que cada vez que
aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
package guía3;
import java.util.Scanner;

public class EjercicioExtra12 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
     
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    String cadenai = String.valueOf(i);
                    String cadenaj = String.valueOf(j);
                    String cadenak = String.valueOf(k);
                        if (cadenai.equals("3")) {
                        cadenai="E";
                        }
                        if (cadenaj.equals("3")) {
                        cadenaj="E";
                        }
                        if (cadenak.equals("3")) {
                        cadenak="E";
                        }
                    System.out.println(cadenai+"-"+cadenaj+"-"+cadenak);        
                }
            }
        }
    }
}