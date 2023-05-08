package Constantes;

public class PalabraFinal {
    public final static int MI_CONSTANTE = 10;
    private String nombre;

    public PalabraFinal(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void SetNombre(String nombre){
        this.nombre = nombre;
    }

    /*public static void main(String[] args) {
        final int miVariable = 10;
        System.out.println(miVariable);
    }*/
}
