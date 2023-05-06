/*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario".
Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un
empleado en función de su edad y salario actual. El aumento salarial debe ser del
10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
*/
package guia7.ejercicioextra5;

import Entidades.Empleado;

public class Guia7EjercicioExtra5 {

    public static void main(String[] args) {
        Empleado juancito = new Empleado("Jauncito",10000,32);
        Empleado pedrito = new Empleado("Pedrito",10000,28);
        juancito.calcular_aumento();
        pedrito.calcular_aumento();
        System.out.println("El sueldo de juancito es "+juancito.getSalario());
        System.out.println("El sueldo de predito es "+pedrito.getSalario());
        
    }
    
}
