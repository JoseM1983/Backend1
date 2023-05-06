/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego,
crea un método "retirar_dinero" que permita retirar una cantidad de dinero del
saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo después de
realizar una transacción de retiro.
*/
package guia7.ejercicioextra4;

import Entidades.Cuenta;

public class Guia7EjercicioExtra4 {

    public static void main(String[] args) {
       Cuenta cuenta = new Cuenta();
       cuenta.retirar_dinero();
    }
    
}
