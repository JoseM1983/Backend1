/*
Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i. * 0.86 libras es un 1 €
ii. * 1.28611 $ es un 1 €
iii. * 129.852 yenes es un 1 €
*/
package guía4;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese la cantidad de Euros a convertir");
        double euros = leer.nextDouble();
        String moneda;
        
        System.out.println("Elija a que moneda desea convertir");
        System.out.println("Dolares");
        System.out.println("Yenes");
        System.out.println("Libras");
        moneda = leer.next();
        
        while (!"Dolares".equalsIgnoreCase(moneda) && (!"Yenes".equalsIgnoreCase(moneda)) && !"Libras".equalsIgnoreCase(moneda)) {
            System.out.println("Se ha ingresado mal la moneda. POr favor, ingresela nuevamente");
            moneda = leer.next();
        }
        
        conversion(euros, moneda);
        
    }
    public static void conversion(double euros, String moneda){
        switch (moneda){
            case "Dolares":
                System.out.println("Por "+euros+" Euros le corresponden "+(euros*1.28611)+" Dolares");
                break;
            case "Yenes":
                System.out.println("Por "+euros+" Euros le corresponden "+(euros*0.86)+" Libras");
                break;
            case "Libras":
                System.out.println("Por "+euros+" Euros le corresponden "+(euros*129.852)+" Yenes");
                break;
        }
    }
}
