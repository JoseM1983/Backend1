
package Entidades;

public class Rectángulo {
    
    // Atributos
    private int lado1;
    private int lado2;
    
    // Constructor

    public Rectángulo() {
    }

    public Rectángulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    // Métodos get and set

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    
    // Otros métodos
    public int calcular_area(){
    return lado1*lado2;
    }
}
