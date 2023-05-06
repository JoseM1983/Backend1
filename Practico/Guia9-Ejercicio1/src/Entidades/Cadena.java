
package Entidades;

public class Cadena {
    
    // Atributos
    private String frase;
    private int longitud;
    
    // Constructor
    public Cadena(){
    }
    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }
   
    // Metodos getter & setter

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitudFrase(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longitudFrase=" + longitud + '}';
    }
    
    
    
    
}
