
package Servicios;

import Entidades.NIF;
import java.util.Scanner;

public class NIFServicios {
    
    public void crearNif(NIF Nif){
      Scanner leer = new Scanner(System.in);
      System.out.println("Ingrese el DNI");
      long DNI = leer.nextLong();
      Nif.setDNI(DNI);
      Nif.setLetra(calcularLetra(DNI));
    }
      
    public char calcularLetra(long DNI){
        int resto = (int) (DNI%23);
        System.out.println("resto");
        char[] Letra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return Letra[resto];
    }
    
    public void mostrar(NIF Nif){
        String dniStr = String.format("%08d", Nif.getDNI());
        System.out.println(dniStr+"-"+Nif.getLetra());
    }
    
}

