
package Servicios;

import java.util.Arrays;

public class ArregloServicios {
    
    public void inicializarA(double[] cincuenta){
        for (int i = 0; i < 50; i++) {
            cincuenta[i]=Math.random()*10;
        }
    }
    public void mostrarA(double[] cincuenta){
        for (int i = 0; i < 50; i++) {
            System.out.println(cincuenta[i]);
        }
    }
    public void ordenar(double[] cincuenta){
        int cuentaintercambio = 0;
        for (boolean ordenado = false; !ordenado;){
            for (int i = 0; i < cincuenta.length-1; i++) {
              if (cincuenta[i]<cincuenta[i+1]){
              double variableauxiliar = cincuenta[i];
              cincuenta[i]=cincuenta[i+1];
              cincuenta[i+1]=variableauxiliar;
              cuentaintercambio++;
              }
            }
            if (cuentaintercambio == 0){
            ordenado = true;
            }
        cuentaintercambio = 0;    
        }
        for (int i = 0; i < cincuenta.length-1; i++) {
            System.out.println(cincuenta[i]);
        }
    }
    public void inicializarB(double[] veinte, double[]cincuenta){
        System.arraycopy(cincuenta, 0, veinte, 0, 10);
        Arrays.fill(veinte, 10,20,0.5);
        for (int i = 0; i < 20; i++) {
        System.out.println(veinte[i]);    
        }
        
    }
}