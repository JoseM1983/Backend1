
package Servicios;

import Entidades.ParDeNumeros;

public class ParDeNumerosServicios {
    
    public void mostrarValores(ParDeNumeros Numeros){
        System.out.println("Los números generados aleatoriamente son:");
        System.out.println("Numero 1: "+Numeros.getNum1());
        System.out.println("Numero 2: "+Numeros.getNum2());
    }
    public void devolverMayor(ParDeNumeros Numeros){
        double mayor = Math.max(Numeros.getNum1(), Numeros.getNum2());
        System.out.println("El mayor de los números es: "+mayor);
    }
    public void calcularPotencia(ParDeNumeros Numeros){
        Numeros.setNum1(Math.floor(Numeros.getNum1()));
        Numeros.setNum2(Math.floor(Numeros.getNum2()));
        if (Numeros.getNum1()>Numeros.getNum2()){
            System.out.println("Elevar el mayor numero a la potencia del menor da como resultado: "+Math.pow(Numeros.getNum1(), Numeros.getNum2()));
        } else {
            System.out.println("Elevar el mayor numero a la potencia del menor da como resultado: "+Math.pow(Numeros.getNum2(), Numeros.getNum1()));
        }
    }
    public void obtenerRaiz(ParDeNumeros Numeros){
        Numeros.setNum1(Math.abs(Numeros.getNum1()));
        Numeros.setNum2(Math.abs(Numeros.getNum2()));
        if (Numeros.getNum1()>Numeros.getNum2()){
            System.out.println("La raiz cuadrada del menor número es: "+Math.sqrt(Numeros.getNum2()));
        } else {
            System.out.println("La raiz cuadrada del menor número es: "+Math.sqrt(Numeros.getNum1()));
        }
    }
}
