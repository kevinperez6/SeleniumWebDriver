package arreglos;

import personaArreglos.Persona;

public class TestArreglos {
    public static void main(String[] args) {
        /*int edades[] = new int[3];//Un arreglo es un objeto
        System.out.println("Edades: " + edades);

        edades[0] = 10;
        edades[1] = 20;
        edades[2] = 30;

        for(int i = 0; i < edades.length; i++){
            System.out.println("Edades contenidas: " + edades[i]);
        }*/

        Persona personas[] = new Persona[2];
        personas[0] = new Persona("Juan");
        personas[1] = new Persona("Carlos");


        System.out.println("Persona 0 = " + personas[0]);
        System.out.println("Persona 0 = " + personas[1]);

        for(int i = 0; i <personas.length; i++){
            System.out.println("Personas =" + personas[i]);
        }
        String frutas[] = {"Naranja","Pera","Uva"};
        System.out.println("frutas[0] = " + frutas[0]);
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("i = " + i);
        }
    }
}
