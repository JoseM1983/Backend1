
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {
Scanner leer = new Scanner(System.in);    

Cafetera caf = new Cafetera();

    public void llenarCafetera(){
        if (caf.getCantidadActual()<caf.getCapacidadMaxima()){
            System.out.println("Se ingresaron "+(caf.getCapacidadMaxima()-caf.getCantidadActual())+" litros de café");
            caf.setCantidadActual(caf.getCapacidadMaxima());
        }
    }
    public void servirTaza(){
        System.out.println("Ingrese el tamaño de la taza");
        int tamano = leer.nextInt();
        if(caf.getCantidadActual()>tamano){
            System.out.println("Disfrute su cafe");
            caf.setCantidadActual(caf.getCantidadActual()-tamano);
            System.out.println("Quedan "+caf.getCantidadActual()+" litros de cafe");
        } else {
            System.out.println("Se le ha servido solo "+caf.getCantidadActual());
            caf.setCantidadActual(0);
        }
    }
    public void vaciarCafetera(){
        System.out.println("Se elimina la cantidad de "+caf.getCantidadActual()+" litros de cafe");
        caf.setCantidadActual(0);
    }
    public void agregarCafe(){
        System.out.println("Cuanto cafe desea agregar?");
        int tamano = leer.nextInt();
        System.out.println("Se agregaran "+tamano+" litros de cafe a los "+caf.getCantidadActual()+" que tenia la maquina");
        caf.setCantidadActual(caf.getCantidadActual()+tamano);
        System.out.println("La maquina quedo a un nivel de "+caf.getCantidadActual()+" litros de cafe");
    }
}
