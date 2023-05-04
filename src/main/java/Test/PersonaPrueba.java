package Test;
import Encapsulamiento.*;
public class PersonaPrueba {
    public static void main(String[] args) {
    Persona persona1 = new Persona("Andres",10.000,true);
        System.out.println("persona1 = " + persona1.getNombre());
        persona1.setNombre("Andres Perez");
        System.out.println("persona1 = " + persona1.getNombre());
        System.out.println("Persona1: " + persona1);/*El print llama automaticamente al metodo toString*/
    }
}
