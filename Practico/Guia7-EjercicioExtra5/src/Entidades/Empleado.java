
package Entidades;

public class Empleado {
   
    // Atributos
    private String nombre;
    private double salario;
    private int edad;
    
    // Constructor
    
    public Empleado(String nombre, double salario, int edad){
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getEdad() {
        return edad;
    }

    // Métodos get and set
    public void setEdad(int edad) {    
        this.edad = edad;
    }

    // Otros métodos
    public void calcular_aumento() {
        if (edad>30) {
            this.salario=salario*1.1;
        } else {
            this.salario=salario*1.05;
        }
    }
   }
