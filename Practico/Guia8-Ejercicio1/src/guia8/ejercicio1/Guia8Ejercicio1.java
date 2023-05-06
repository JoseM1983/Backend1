/*
Realizar una clase llamada CuentaBancaria en el paquete Entidades con
los siguientes atributos: numeroCuenta(entero), dniCliente(entero largo),
saldoActual. Agregar constructor vacío, con parámetros, getters y
setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que
contenga:
a) Método para crear cuenta pidiéndole los datos al usuario.
b) Método ingresar(double): recibe una cantidad de dinero a ingresar y
se le sumará al saldo actual.
c) Método retirar(double): recibe una cantidad de dinero a retirar y se le
restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
retirar se retirará el máximo posible hasta dejar la cuenta en 0.
d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
Validar que el usuario no saque más del 20%.
e) Método consultarSaldo: permitirá consultar el saldo disponible en la
cuenta.
f) Método consultarDatos: permitirá mostrar todos los datos de la
cuenta.
 */
package guia8.ejercicio1;


import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicios;
import java.util.Scanner;

public class Guia8Ejercicio1 {

    public static void main(String[] args) {  
    Scanner leer = new Scanner(System.in);    
    
        CuentaBancariaServicios ss1 = new CuentaBancariaServicios();
        CuentaBancaria cuenta1 = ss1.crearCuenta();
        int opcion;
        
        do{
            System.out.println("MENU");
            System.out.println("1-Ingresar Dinero");
            System.out.println("2-Retirar Dinero");
            System.out.println("3-Extracción Rápida");
            System.out.println("4-Consultar Saldo");
            System.out.println("5-Consultar Datos");
            System.out.println("9-Salir");
            opcion = leer.nextInt();
            
            switch (opcion){
                case 1:    
                    ss1.Ingresar(cuenta1);
                    break;
                case 2:
                    ss1.Retirar(cuenta1);
                    break;
                case 3:
                    ss1.ExtraccionRapida(cuenta1);
                    break;
                case 4:
                    ss1.consultarSaldo(cuenta1);
                    break;
                case 5:
                    ss1.mostrarDatos(cuenta1);
                    break;
                case 9:
                    System.out.println("Hasta pronto!");
                    break;
                default:
                    System.out.println("La opción ingresada no es correcta");
            }
        } while (opcion!=9);
    }
}    