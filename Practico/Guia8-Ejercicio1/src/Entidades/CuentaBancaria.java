
package Entidades;

public class CuentaBancaria {
    
    // Atributos
    int numCuenta;
    int dniCliente;
    double saldoActual;
    
    // Constuctor
    public CuentaBancaria(){
    }
    
    public CuentaBancaria(int numCuenta, int dniCliente, double saldoActual){
    this.numCuenta = numCuenta;
    this.dniCliente = dniCliente;
    this.saldoActual = saldoActual;
    }
    
    // Métodos Getter & Setter

    public int getNumCuenta() {
        return numCuenta;
    }
    public void setNumCuenta(int numCuenta){
        this.numCuenta=numCuenta;
    }
    public int getDniCliente(){
        return dniCliente;
    }
    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }
    public double getSaldoActual(){
    return saldoActual;
    }
    public void setSaldoActual(double saldoActual){
    this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numCuenta=" + numCuenta + ", dniCliente=" + dniCliente + ", saldoActual=" + saldoActual + '}';
    }
    
    
}
