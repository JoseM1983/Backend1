/*
Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
*/
package guía5;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese el tamaño del vector");
        int tamano = leer.nextInt();
        int[] vector = new int[tamano];
        
        // Genero números aleatorios del 1 al 99.999
        for (int i = 0; i < tamano; i++) {
            vector[i]=(int) (Math.random() * 100000);
        }
        
        int cont1=0;
        int cont2=0;
        int cont3=0;
        int cont4=0;
        int cont5=0;
        
        // Muestro el vector para controlar los resultados
        for (int n: vector)
            System.out.println(n);
        
        for (int i = 0; i < tamano; i++) {
        String numCadena = String.valueOf(vector[i]);
            switch (numCadena.length()){
                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
                case 4:
                    cont4++;
                    break;
                case 5:
                    cont5++;
                    break;
            }
        }
        System.out.println("hay ");
        System.out.println(cont1+" numeros de 1 dígito");
        System.out.println(cont2+" numeros de 2 dígitos");
        System.out.println(cont3+" numeros de 3 dígitos");
        System.out.println(cont4+" numeros de 4 dígitos");
        System.out.println(cont5+" numeros de 5 dígitos");
    }
}
