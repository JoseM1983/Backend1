
package Servicio;

import Entidades.Cadena;
import java.util.Scanner;

public class CadenaServicio {
    
    public void mostrarVocales(Cadena cadena1)  {
        String[] v ={"A","E","I","O","U"};
        int contvocales=0;
        for (int i = 0; i < cadena1.getLongitud(); i++) {
            for (int j = 0; j < 5; j++) {
                if (cadena1.getFrase().substring(i, i+1).toUpperCase().equals(v[j])){
                    contvocales++;
                }
            }
        }
        System.out.println("Vocales: "+contvocales);
    }
    public void invertirFrase (Cadena cadena1){
        for (int i = 0; i < cadena1.getLongitud(); i++) {
            System.out.print(cadena1.getFrase().substring(cadena1.getLongitud()-i-1, cadena1.getLongitud()-i));
        }
        System.out.println("");
    }
    public void vecesRepetido(Cadena cadena1){
        Scanner leer = new Scanner(System.in);
        int cont = 0;
        System.out.println("Ingrese una letra para saber cuantas veces esta en la frase ingresada");
        String letra = leer.nextLine();
        int posicion = cadena1.getFrase().indexOf(letra);
        while (posicion !=-1) {
            cont++;
            posicion = cadena1.getFrase().indexOf(letra, posicion+1);
        }
        System.out.println("La letra: "+letra+" se encuentra "+cont+" veces");
    }
    public void compararLongitud(Cadena cadena1){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase para comparar las longitudes de la misma");
        String frase2 = leer.nextLine();
        if (cadena1.getFrase().length()== frase2.length()){
            System.out.println("Las 2 cadenas tienes la misma longitud. Dicha longitud es: "+frase2.length());
        } else {
            System.out.println("Las 2 cadenas tienen distinta longitud");
            System.out.println("La cadena "+cadena1.getFrase()+" tiene una longitud de "+cadena1.getFrase().length());
            System.out.println("La cadena "+frase2+" tiene una longitud de "+frase2.length());
        } 
    }
    public void unirFrases(Cadena cadena1){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase para unir a la frase del objeto");
        String frase2 = leer.nextLine();
        System.out.println(cadena1.getFrase()+"-"+frase2);
    }
    public void reemplazar(Cadena cadena1){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra que desee remplazar por %");
        String letra = leer.nextLine();
        cadena1.setFrase(cadena1.getFrase().replaceAll(letra, "%"));
        System.out.println(cadena1.getFrase());
        cadena1.setFrase(cadena1.getFrase().replaceAll("%", letra));
        System.out.println(cadena1.getFrase());
    }
    public boolean contiene (Cadena cadena1){
        Scanner leer = new Scanner(System.in);
        int cont = 0;
        System.out.println("Ingrese una letra para saber si esta dentro de la frase");
        String letra = leer.nextLine();
        for (int i = 0; i < cadena1.getFrase().length(); i++) {
            if (cadena1.getFrase().substring(i, i+1).equals(letra)){
            cont++;
            }
        }
        return cont>0;
    } 
}
    


