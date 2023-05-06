
package Servicios;

import Entidades.Raices;
import java.util.Scanner;

public class ServicioRaices {

    public Raices crearObjeto(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de a");
        double a = leer.nextDouble();
        System.out.println("Ingrese el valor de b");
        double b = leer.nextDouble();
        System.out.println("Ingrese el valor de c");
        double c = leer.nextDouble();
        
        return new Raices(a,b,c);
    }
    public static double getDeterminante(Raices raiz){
        double discriminante = Math.pow(raiz.getB(), 2)-(4*raiz.getA()*raiz.getC());
        return discriminante;
    }
    public static boolean tieneRaices(Raices raiz){
        return getDeterminante(raiz)>0;
    }
    public static boolean tieneRaiz(Raices raiz){
        return getDeterminante(raiz)==0;
    }
    public static void obtenerRaices(Raices raiz){
        if (tieneRaices(raiz)){
        double determinante = Math.sqrt(getDeterminante(raiz));
        double raiz1 = (-raiz.getB()+determinante)/(2*raiz.getA());
        double raiz2 = (-raiz.getB()-determinante)/(2*raiz.getA());
        System.out.println("Las dos raíces son: " + raiz1 + " y " + raiz2);
        } 
    }
    public static void obtenerRaiz(Raices raiz){
        if (tieneRaiz(raiz)){
        double raiz3 = (-raiz.getB() / (2 * raiz.getA()));
         System.out.println("La única raíz es: " + raiz3);
        }
    }
    public static void calcular(Raices raiz){
        if (tieneRaices(raiz)){
            obtenerRaices(raiz);
        } else if (tieneRaiz(raiz)){
            obtenerRaiz(raiz);
        } else {
            System.out.println("No tiene solucion");
        }
    }
 }
    
        
