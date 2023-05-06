package Entidad;

// Atributos

import java.util.Scanner;

public class Libro {
    private int ISBN;
    private String titulo;
    private String autor;
    private int numPaginas;

// Constructor con parámetros
    public Libro(int ISBN, String titulo, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

// Contructor sin parámetros
    public Libro() {
    }

// Métodos
    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    public void cargarLibro(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el ISBN del libro");
        this.ISBN = leer.nextInt();
        System.out.println("Ingrese el título del libro");
        this.titulo = leer.next();
        System.out.println("Ingrese el Autor del libro");
        this.autor = leer.next();
        System.out.println("Ingrese el numero de páginas del libro");
        this.numPaginas = leer.nextInt();
    }    
    public void mostrarLibro(){
        System.out.println("El ISBN es "+this.ISBN);
        System.out.println("El Titulo es "+this.titulo);
        System.out.println("El Autor es "+this.autor);
        System.out.println("El número de páginas es "+this.numPaginas);
        
    }    
    
    
}
