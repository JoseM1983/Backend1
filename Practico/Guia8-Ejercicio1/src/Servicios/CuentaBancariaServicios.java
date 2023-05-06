package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicios {
Scanner leer = new Scanner(System.in);
CuentaBancaria cuenta1 = new CuentaBancaria();
// Métodos
    public CuentaBancaria crearCuenta(){
        System.out.println("Ingrese número de cuenta");
        cuenta1.setNumCuenta(leer.nextInt());
        System.out.println("Ingrese DNI");
        cuenta1.setDniCliente(leer.nextInt());
        return cuenta1; 
    }
    public void Ingresar (CuentaBancaria cuenta1){
        System.out.println("Ingrese la cantidad a ingresar");
        double ingreso = leer.nextDouble();
        cuenta1.setSaldoActual(cuenta1.getSaldoActual() + ingreso);
    }
    public void Retirar (CuentaBancaria cuenta1){
        System.out.println("Ingrese la cantidad a retirar");
        double retiro = leer.nextDouble();
        if (retiro>cuenta1.getSaldoActual()){
            System.out.println("Su retiro fue de "+cuenta1.getSaldoActual());
            cuenta1.setSaldoActual(0);
        } else {
            System.out.println("Su retiro fue de "+retiro);
            cuenta1.setSaldoActual(cuenta1.getSaldoActual()-retiro);
        }
    }
    public void ExtraccionRapida (CuentaBancaria cuenta1){
        System.out.println("Ingrese el monto a extraer de modo rapido");
        double rapido = leer.nextDouble();
        if (rapido>cuenta1.getSaldoActual()*0.2){
            System.out.println("Su retiro rapido excede el 20% de su saldo (maximo a retirar por este medio ("+cuenta1.getSaldoActual()*0.2+")");
        } else {
            System.out.println("Su retiro rapido fue de "+rapido+ " pesos");
            cuenta1.setSaldoActual(cuenta1.getSaldoActual()-rapido);
        }
    }
    public void consultarSaldo (CuentaBancaria cuenta1){
        System.out.println("Su saldo es de "+cuenta1.getSaldoActual());
    }
    public void mostrarDatos (CuentaBancaria cuenta1){
        System.out.println(cuenta1.toString());
    }
}
