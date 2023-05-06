
package Entidades;

public class Cafetera {
    
    // Atributos
    private double capacidadMaxima = 1000;
    private double cantidadActual;
    
    // Constructor
    public Cafetera(){
    }
    public Cafetera(double capacidadMaxima, double cantidadActual){
    this.capacidadMaxima = capacidadMaxima;
    this.cantidadActual = cantidadActual;
    }
    
    // Métodos getter & setter

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }
 
    
}
    

