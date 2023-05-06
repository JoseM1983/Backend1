
package Entidad;

import java.util.Scanner;

public class Rectangulo {
    
    // Atributos
        private int base;
        private int altura;
    
    // Contructor
        public Rectangulo() {
    }
        public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
        
    // Métodos get and set
        public int getBase() {
        return base;
    }
        public void setBase(int base) {
        this.base = base;
    }
        public int getAltura() {
        return altura;
    }
        public void setAltura(int altura) {
        this.altura = altura;
    }

    // Otros Métodos
        public void crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base del rectángulo");
        base = leer.nextInt();
        System.out.println("Ingrese la altura del rectángulo");
        altura = leer.nextInt();
        }
        public void superficie(){
        int superficie = base * altura;
            System.out.println("La superficie del rectángulo es: "+superficie);
        }
        public void perimetro(){
        int perimetro = (base + altura) * 2;
            System.out.println("El perimetro del rectángulo es: "+perimetro);
        }
        public void dibujar(){
            for (int i = 0; i < altura; i++) {
                for (int j = 0; j < base; j++) {
                    if (i==0 || j==0 || i==(altura-1) || j==(base-1)){
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println("");
            }
        }
}
