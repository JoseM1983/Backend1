
package Entidades;

import java.util.Scanner;

public class Cuenta {
   
    // Atributos
    private double saldo;
    private String titular;
    
    // Constructor
    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }
    
    // Métodos get and set

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    // Otros métodos
    public void retirar_dinero(){
    Scanner leer = new Scanner(System.in);
    saldo = 1000;
        System.out.println("Usted tiene un saldo de: "+saldo);
        System.out.println("Cuanto dinero desea retirar?");
        int retiro = leer.nextInt();
        if (retiro>saldo){
            System.out.println("Usted no dispone de los fondos suficientes para ese retiro");
        } else {
            saldo-=retiro;
            System.out.println("Usted retiro "+retiro+". Le queda un saldo de: "+saldo);}
    }
   
    
    
}
