package Service;

import Entidades.Persona;
import java.util.Scanner;

public class PersonaService {


// Métodos
    public Persona crearPersona(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        String nombre = leer.nextLine();
        
        System.out.println("Ingrese la edad");
        int edad = leer.nextInt();
        
        System.out.println("Ingrese el sexo (H - hombre, M - mujer, O - otro):");
        char sexo = leer.next().toUpperCase().charAt(0);
        while (sexo != 'H' && sexo != 'M' && sexo != 'O'){
            System.out.println("El sexo ingresado es incorrecto. Ingreselo nuevamente");
            sexo = leer.next().toUpperCase().charAt(0);
        }
        System.out.println("Ingrese el peso");
        double peso = leer.nextDouble();
        
        System.out.println("Ingrese la altura");
        double altura = leer.nextDouble();
        
        return new Persona(nombre, edad, sexo, peso, altura);
    } 

    public boolean esMayorDeEdad(Persona jose){
    return jose.getEdad()>18;
    }    
    
    public int calcularIMC(Persona jose){
    double resultado = (jose.getPeso()/(Math.pow(jose.getaltura(), 2)));
        if (resultado<20){
            return -1;
        } else if (resultado>=20 && resultado<=25){
            return 0;
        } else {
            return 1;
        }
    }
    
}
