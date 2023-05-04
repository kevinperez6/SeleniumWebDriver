package prueba;

import contextoStatico.Persona;
import org.openqa.selenium.json.JsonOutput;

import java.sql.SQLOutput;

public class pruebaStatic {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Kevin Andres");
        Persona persona2 = new Persona("Uriel");
        imprimir(persona1);
    }
    public static void imprimir(Persona persona){
        System.out.println("Persona = " + persona);
    }
}
