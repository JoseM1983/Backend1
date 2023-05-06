/*
Crea una clase en Java donde declares una variable de tipo array de
Strings que contenga los doce meses del año, en minúsculas. A
continuación, declara una variable mesSecreto de tipo String, y hazla
igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario
acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
adivinar el mes secreto. Un ejemplo de ejecución del programa podría
ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:
febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
package guia9.ejercicioextra1;

import java.util.Scanner;

public class Guia9EjercicioExtra1 {

    public static void main(String[] args) {
        
        String[]mes={"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        String mesSecreto=mes[3]; // el mes secreto es abril...no marzo.
        System.out.print("Adivine el mes secreto. Introduzca el nombre del mes en minusculas: ");
        Scanner  leer =new Scanner(System.in);
        String entradaTeclado=leer.nextLine();

        while (!entradaTeclado.equals(mesSecreto)){
            System.out.print("No ha acertado. Intente adivinarlo introduciendo otro mes: ");
            entradaTeclado=leer.nextLine();
        }
        System.out.println("¡Ha acertado!");
    }
}
