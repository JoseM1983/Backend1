package Entidades;

public class Persona {
// Realizar una clase llamada Persona en el paquete de entidades que
// tengan los siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’
// para mujer, ‘O’ para otro), peso y altura. Si desea añadir algún otro
// atributo, puede hacerlo. Agregar constructores, getters y setters.

    // Atributos
        private String nombre;
        private int edad;
        private char sexo;
        private double peso;
        private double altura;
     
    // Constructores
        public Persona(){
        }
        public Persona(String nombre, int edad, char sexo, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        }
    
    // Métodos getter & setter

        public String getNombre() {
        return nombre;
        }
        public void setNombre(String nombre) {
        this.nombre = nombre;
        }
        public int getEdad(){
        return edad;
        }
        public void setEdad(int edad){
        this.edad = edad;
        }
        public char getSexo (){
        return sexo;
        }
        public void setSexo(char sexo){
        this.sexo = sexo;
        }
        public double getPeso(){
        return peso;
        }
        public void setPeso(double peso){
        this.peso = peso;
        }
        public double getaltura(){
        return altura;
        }
        public void setAltura(double altura){
        this.altura = altura;
        }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
        
}
 
