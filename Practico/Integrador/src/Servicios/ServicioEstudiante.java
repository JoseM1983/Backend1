
package Servicios;

import Entidades.Estudiante;
import java.util.Scanner;

public class ServicioEstudiante {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void cargarEstudiantes(Estudiante estudiante[], int cantEst){
        for (int i = 0; i < cantEst; i++) {
            System.out.println("Ingrese el nombre del alumno "+(i+1)+" de "+cantEst);
            String nombre = leer.next();
            System.out.println("Ingrese la nota promedio del alumno "+(i+1)+" de "+cantEst);
            double nota = leer.nextDouble();
            estudiante[i] = new Estudiante(nombre, nota);
        }
    }
    public double promedioNotas(Estudiante estudiante[], int cantEst){
        double sumaNota = 0;
        for (int i = 0; i < cantEst; i++) {
            sumaNota += estudiante[i].getNota();
        }
        double notaPromedio = (sumaNota/cantEst);
        return notaPromedio;
    }
    public int notaMayorProm(Estudiante estudiante[], int cantEst, double notaProm){
        int cont = 0;
        for (int i = 0; i < cantEst; i++) {
            if (estudiante[i].getNota()>notaProm){
            cont++;
            }
        }
        return cont;
    }
    public void nombreAlumnosNotaMayorPromedio(Estudiante estudiante[], int cantEst, double notaProm, int notasMayorProm){
        String[] nomMayProm = new String[notasMayorProm];
        int contador = 0;
        for (int i = 0; i < cantEst; i++) {
            if (estudiante[i].getNota()>notaProm){
                nomMayProm[contador] = estudiante[i].getNombre();
                contador++;
            }
        }
        for (int i = 0; i < notasMayorProm; i++) {
            System.out.println(nomMayProm[i]);
            
        }
    }
}
