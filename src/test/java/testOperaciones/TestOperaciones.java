package testOperaciones;

import operaciones.Operaciones;

public class TestOperaciones {
    public static void main(String[] args) {
        int resultado = Operaciones.sumar(1,7);
        System.out.println("resultado = " + resultado);

        double resultado2 = Operaciones.sumar(6,7);
        System.out.println("resultado2 = " + resultado2);
    }
}
