
package entidades;

public class Ahorcado {
    // Atributos
    
    private char[] palabraABusca;
    private int letrasEncontradas;
    private int jugadasMaxima;
    
    // Constructor

    public Ahorcado() {
    }

    public Ahorcado(char[] palabraabusca, int letrasEncontradas, int jugadasMaxima) {
        this.palabraABusca = palabraabusca;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMaxima = jugadasMaxima;
    }

    // Métodos getter & setter

    public char[] getPalabraABusca() {
        return palabraABusca;
    }

    public void setPalabraABusca(char[] palabraabusca) {
        this.palabraABusca = palabraabusca;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadasMaxima() {
        return jugadasMaxima;
    }

    public void setJugadasMaxima(int jugadasMaxima) {
        this.jugadasMaxima = jugadasMaxima;
    }
    
}
    