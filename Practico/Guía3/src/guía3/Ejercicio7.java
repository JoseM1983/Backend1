/*
Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE), y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(), Length(), equals().
 */
package guía3;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
        int cor = 0; 
        int inc = 0;
        boolean FDE = false;
        System.out.println("A continuación se le va a solicitar ingresar cadenas para el dispositivo RS232");        
        do {
            System.out.println("Ingresar cadena");
            String cadena = leer.nextLine();
            if (!cadena.equalsIgnoreCase("&&&&&")) {
                if ((cadena.length()) == 5 && "X".equalsIgnoreCase(cadena.substring(0,1)) && "O".equalsIgnoreCase(cadena.substring(4,5))){
                cor++;
                } else {
                inc++;
                }
            } else {
            FDE = true;
            }
        } while (FDE==false);
               
        System.out.println("Cantidad de lecturas correctas: "+cor);
        System.out.println("Cantidad de lecturas incorrectas: "+inc);
    }
}