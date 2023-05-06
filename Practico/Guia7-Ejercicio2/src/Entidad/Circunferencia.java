package Entidad;

import java.util.Scanner;


public class Circunferencia {
  
    
    // Atributos
    private double radio;
    
    // Constructor

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }
    
    // Metodo Get and Set

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    // Otros Métodos
    
    public void crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia");
        this.radio = leer.nextDouble();
    }
    public void area(){
        double area = Math.pow((Math.PI*this.radio),2);
        System.out.println("Area: "+area);
    }
    public void perimetro(){
        double perimetro = (2*Math.PI*this.radio);
        System.out.println("Perímetro: "+perimetro);
    }
}

