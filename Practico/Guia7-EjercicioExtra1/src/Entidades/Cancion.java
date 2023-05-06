
package Entidades;

public class Cancion {
    
// Atributos
    private String Autor;
    private String Titulo;
    
// Constructor
    public Cancion(){
    }

    public Cancion(String Autor, String Titulo) {
        this.Autor = Autor;
        this.Titulo = Titulo;
    }
    
// Métodos

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }
    
}
