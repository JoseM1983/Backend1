
package Entidades;

import java.util.Scanner;

public class Juego {
    // Atributos
    
    private int num1;
    private int num2;
    
    // Constructor

    public Juego() {
    }

    public Juego(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    // Metodos get and set

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    // Otros métodos

    public void iniciarJuego(){
        Scanner leer = new Scanner(System.in);
        int intentos = 0;
        int intentostotales = 0;
        int jugador1 = 0;
        int jugador2 = 0;
        String respuesta;
        do {
            System.out.println("Jugador uno...elija un número del 0 al 20 para que el jugador dos intente adivinar");
        
        num1 = leer.nextInt();
        
        while (num1<0 || num1>20) {
            System.out.println("El número ingresado no cumple con los parámetros. Ingreselo nuevamente");
            num1 = leer.nextInt();
        }
        
        System.out.println("Jugador dos... intente adivinar el número del 0 al 20 ingresado por el jugador uno");
       
        
            do {
                System.out.println("Ingrese un número. Tiene "+(3-intentos)+" intentos.");
                num2 = leer.nextInt();
                intentos++;
                intentostotales++;
                if (num1==num2){
                    System.out.println("Felicitaciones");
                    System.out.println("Intentos hasta acertar: "+intentostotales);
               
                    intentostotales=0;
                } else {
                    System.out.println("Incorrecto");
                    if (num1>num2){
                        System.out.println("El numero buscado es mayor");
                    } else {
                       System.out.println("El número buscado es menor");}
                }
            } while ((num1!=num2) && (intentos<3));
            intentos=0;
                if (num1==num2){
                jugador2++;
                } else {
                jugador1++;
                }
            System.out.println("Desea jugar nuevamente?(S/N)");
            respuesta = leer.next();
        } while (respuesta.equalsIgnoreCase("s"));
        System.out.println("Partidas ganadas por jugador 1: "+jugador1);
        System.out.println("Partidas ganadas por jugador 2: "+jugador2);
    }
}
