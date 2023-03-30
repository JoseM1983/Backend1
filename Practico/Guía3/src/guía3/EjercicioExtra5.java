/*
Una obra social tiene tres clases de socios:
○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
○ Los socios que menos aportan, los de tipo ‘C’, no reciben
descuentos sobre dichos tratamientos.
○ Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento) y determine el importe en efectivo a pagar por dicho
socio.
*/
package guía3;
import java.util.Scanner;

public class EjercicioExtra5 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese el tipo de socio (A, B o C)");
        System.out.println("A-Tipo A");
        System.out.println("B-Tipo B");
        System.out.println("C-Tipo C");
        String socio = leer.nextLine();
        
        while (!"A".equalsIgnoreCase(socio) && !"B".equalsIgnoreCase(socio) && !"C".equalsIgnoreCase(socio) ){
            System.out.println("Tipo de socio INCORRECTO. Ingreselo nuevamente");
            socio = leer.nextLine();
        }
        
        System.out.println("Ingrese el costo del tratamiento");
        double importe = leer.nextDouble();
        
        switch (socio){
            case "A":
                System.out.println("El costo del tratamiento es de "+importe*0.5);
                break;
            case "B":
                System.out.println("El costo del tratamiento es de "+importe*0.65);
                break;
            case "C":
                System.out.println("El costo del tratamiento es de "+importe);
        }
    }
}
