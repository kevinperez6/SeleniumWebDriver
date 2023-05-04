package test;
import herencia.Cliente;

import java.util.Date;

public class TesteHerencia {
    public static void main(String[] args) {
        Cliente empleado2 = new Cliente("Andrew",new Date(),true,'M',21,"tv 87 #12a");
        System.out.println(empleado2);
    }
}
