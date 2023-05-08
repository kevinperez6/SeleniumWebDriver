package pruebaConstantes;

import Constantes.PalabraFinal;
import org.openqa.selenium.remote.JsonToWebElementConverter;


public class TetsFinal{
    public static void main(String[] args) {
       // PalabraFinal.MI_CONSTANTE = 2;
        System.out.println(PalabraFinal.MI_CONSTANTE);

        final PalabraFinal persona1 = new PalabraFinal("lenovo");
        //No se puede agregar un nuevo objeto al ya creado
        System.out.println("Nombre persona: " + persona1.getNombre());
        persona1.SetNombre("Nuevo nombre");
        System.out.println("Nuevo nombre: " + persona1.getNombre());
    }
}
