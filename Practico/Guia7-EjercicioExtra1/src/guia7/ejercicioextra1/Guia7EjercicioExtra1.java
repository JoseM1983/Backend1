/*
Desarrollar una clase Cancion con los siguientes atributos: título y autor.
Se deberá definir además dos constructores: uno vacío que inicializa el título
y el autor a cadenas vacías y otro que reciba como parámetros el título y el
autor de la canción. Se deberán además definir los métodos getters y setters
correspondientes.
 */
package guia7.ejercicioextra1;

import Entidades.Cancion;

public class Guia7EjercicioExtra1 {

    public static void main(String[] args) {
        Cancion cancion1 = new Cancion();
        Cancion cancion2 = new Cancion("Elvis Presley","Merry Christmas Baby");
        
        cancion1.setAutor("Ricardo Arjona");
        cancion1.setTitulo("Señora de las 4 décadas");
        
        System.out.println("El autor de la primer cancion es "+cancion1.getAutor()+" y el titulo es: "+cancion1.getTitulo());
        System.out.println("El autor de la segunda cancion es "+cancion2.getAutor()+" y el titulo es: "+cancion2.getTitulo());
    }
    
}
