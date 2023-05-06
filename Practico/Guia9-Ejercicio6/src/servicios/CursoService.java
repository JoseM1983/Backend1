
package servicios;

import entidad.Curso;
import java.util.Scanner;

public class CursoService {
    
    public String[] crearAlumnos(){
        String[] alumnos = new String[5];
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno "+(i+1)+" de 5");
            alumnos[i] = leer.next();
        }
        return alumnos;
    }
    public Curso crearCurso(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del curso");
        String nombre = leer.next();
        System.out.println("Ingrese la cantidad de horas por día del curso");
        int horas = leer.nextInt();
        System.out.println("Cantidad de días por semana del curso");
        int dias = leer.nextInt();
        System.out.println("Turno (Mañana o Tarde");
        String turno = leer.next();
        System.out.println("Ingrese el precio por hora");
        double precio = leer.nextDouble();
        String[] alumnos = crearAlumnos();
        
        return new Curso(nombre,horas,dias,turno,precio,alumnos);
    }
    public void calcularGananciaSemanal(Curso curso){
        double gananciaSemanal = (curso.getCantidadHorasPorDia()*curso.getPrecioPorHora()*curso.getAlumnos().length*curso.getCantidadDiaPorSemana());
        System.out.println("La ganancia semanal es de: "+gananciaSemanal);
    }
}
