
package Entidad;

import java.util.Scanner;

public class Operacion {
    
    // Atributos
    private double numero1;
    private double numero2;
    
    //Constructor
    public Operacion(){
    }
    public Operacion(double numero1, double numero2){
    }
    
    // Métodos get and set

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    // Otros métodos
    public void crearOperacion(){
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor del número 1");
        this.numero1 = leer.nextDouble();
        System.out.println("Ingrese el valor del número 2");
        this.numero2 = leer.nextDouble();
    }
    
    public double sumar(){
        double suma = numero1 + numero2;
        System.out.println("La suma de los 2 números es: "+suma);
        return suma;
    }
    public double restar(){
        double resta = numero1 - numero2;
        System.out.println("La resta de los 2 números es: "+resta);
        return resta;
    }
    public double multiplicar(){
        double multiplicacion = numero1 * numero2;
        if (numero1==0 || numero2==0){
            System.out.println("La multiplicación de los numeros ingresados es: "+multiplicacion);
            System.out.println("Tener en cuenta que uno de los números ingresados es cero");
        } else {
            System.out.println("La multiplicación de los numeros ingresados es: "+multiplicacion);
        }
        return multiplicacion;
    }
    public double dividir(){
        double dividir;
        if (numero2==0){
            dividir=0;
            System.out.println("Imposible realizar la división cuando el divisor es cero");
            
        } else if (numero1==0) {
            dividir = numero1 / numero2;
            System.out.println("La división de los numeros ingresados es: "+dividir);
            System.out.println("El dividendo es cero");
           
        } else {
            dividir = numero1 / numero2;
            System.out.println("La división de los numeros ingresados es: "+dividir);
            
        }
        return dividir;
    }
}
