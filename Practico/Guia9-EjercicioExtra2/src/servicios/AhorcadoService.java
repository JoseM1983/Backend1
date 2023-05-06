
package servicios;

import entidades.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {

Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearJuego(){
                
        System.out.println("Ingrese la palabra a descubrir");
        String palabraABuscar = leer.next();
        char[] palabra = new char[palabraABuscar.length()];
        for (int i = 0; i < palabraABuscar.length(); i++) {
            palabra[i] = palabraABuscar.charAt(i);
        }
        System.out.println("Ingrese la cantidad de jugadas máximas");
        int jugadasMaxima = leer.nextInt();
        
        return new Ahorcado(palabra,0,jugadasMaxima);
    }
    public int longitud(Ahorcado a){
    return a.getPalabraABusca().length;
    }
    
    public void buscar(Ahorcado a){
        
        System.out.println("Ingrese una letra a buscar");
        char letra = leer.next().charAt(0);
        char[] palabra = a.getPalabraABusca();
        
        for (int i = 0; i < a.getPalabraABusca().length; i++) {
            if (palabra[i]==letra) {
                
            } else {
                System.out.println("La letra no fue encontrada");
            }      
        }
    }
}

