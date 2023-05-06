/*
Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método 
"calcular_area" que calcule y devuelva el área del rectángulo. Luego crea un
objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 y imprime el
área del rectángulo.
 */
package guia7.ejercicioextra6;

import Entidades.Rectángulo;

public class Guia7EjercicioExtra6 {

    public static void main(String[] args) {
      Rectángulo rectangulo1 = new Rectángulo();
      rectangulo1.setLado1(4);
      rectangulo1.setLado2(6);
        System.out.println("El area del rectangulo es: "+rectangulo1.calcular_area());
    }
    
}
