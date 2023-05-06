
package Entidades;

public class NIF {
    
    // Atributos
    private long DNI;
    private char letra;
    
    // Constructor

    public NIF() {
    }

    public NIF(long DNI, char letra) {
        this.DNI = DNI;
        this.letra = letra;
    }
    
    // Métodos

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    
}
