
package Entidades;

import java.util.Scanner;

    public class Puntos {
    
    // Atributos
        private int x1;
        private int y1;
        private int x2;
        private int y2;
        
    // Constructor
        
        
        
    // Métodos
        
    public void crearPuntos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de x1");
        x1 = leer.nextInt();
        System.out.println("Ingrese el valor de y1");
        y1 = leer.nextInt();
        System.out.println("Ingrese el valor de x2");
        x2 = leer.nextInt();
        System.out.println("Ingrese el valor de y2");
        y2 = leer.nextInt();
    }
    public void distancia(){
        double distancia = Math.sqrt((Math.pow((x1-x2),2)+Math.pow((y1-y2),2)));
        System.out.println("La distancia entre los 2 números es: "+distancia);
    }    
}
