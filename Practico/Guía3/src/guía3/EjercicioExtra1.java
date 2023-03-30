/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.

 */
package guía3;
import java.util.Scanner;

public class EjercicioExtra1 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese una cantidad de minutos para que calculemos el equivalente en días y horas");
        double minutos = leer.nextInt();
        double horas = Math.floor(minutos/60);
        double dias = Math.floor(horas/24);
        horas = horas - 24*dias;
        minutos=minutos-horas*60-dias*24*60;
        
        System.out.println("Corresponde a:");
        System.out.println(dias+" dias, "+horas+" horas y "+minutos+" minutos");
        
    }
}