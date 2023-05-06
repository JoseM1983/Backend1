/*
Los profesores del curso de programación de Egg necesitan llevar un
registro de las notas adquiridas por sus 10 alumnos para luego obtener
una cantidad de aprobados y desaprobados. Durante el período de
cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos
evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el
arreglo. Al final del programa los profesores necesitan obtener por
pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta
que solo aprueban los alumnos con promedio mayor o igual al 7 de sus
notas del curso.
 */
package guía5;
import java.util.Scanner;

    public class EjercicioExtra4 {
        
    public static void main(String[] args) {    
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de alumnos en la clase");
        int alumnos = leer.nextInt();
    
    //pedirNotas(alumnos);  
    aprobadosDesaprobados(pedirNotas(alumnos),alumnos);
        }
    
    public static double[] pedirNotas(int alumnos){
        Scanner leer = new Scanner(System.in);
        double vector[] = new double[alumnos];
        
        for (int i = 0; i < alumnos; i++) {
            System.out.println("Ingrese las notas del alumno "+(i+1));
            System.out.println("Primer trabajo practico");
            int practico1 = leer.nextInt();
            System.out.println("Segundo trabajo practico");
            int practico2 = leer.nextInt();
            System.out.println("Primer integrador");
            int integrador1 = leer.nextInt();
            System.out.println("Segundo integrador");
            int integrador2 = leer.nextInt();
            vector[i] = ((practico1*0.10)+(practico2*0.15)+(integrador1*0.25)+(integrador2*0.5));
        }
    return vector;   
    } 
    public static void aprobadosDesaprobados(double vector[], int alumnos){
        int aprobados=0;
        for (int i = 0; i < alumnos; i++) {
            if (vector[i]>=7){
                aprobados++;
            }
        }
        System.out.println("La cantidad de aprobados es: "+aprobados+". Promedio: "+Math.floor(aprobados/alumnos));
        System.out.println("La cantidad de desaprobados es: "+(alumnos-aprobados)+". Promedio: "+Math.floor(aprobados/alumnos));
    }
    }
