
package integrador;

import Entidades.Estudiante;
import Servicios.ServicioEstudiante;
import java.util.Scanner;

public class Integrador {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de estudiantes");
        int cantEst = leer.nextInt();
        Estudiante estudiante[] = new Estudiante[cantEst];
        ServicioEstudiante ss = new ServicioEstudiante();
                
        ss.cargarEstudiantes(estudiante, cantEst);
        double notaProm = ss.promedioNotas(estudiante, cantEst);
        System.out.println("El promedio de notas de todo el curso es: "+notaProm); 
        int cantNotasMayorProm = ss.notaMayorProm(estudiante, cantEst, notaProm);
        System.out.println("La cantidad de notas mayor al promedio es: "+cantNotasMayorProm);
        ss.nombreAlumnosNotaMayorPromedio(estudiante,cantEst,notaProm,cantNotasMayorProm);
        
        }
        
    }
    

