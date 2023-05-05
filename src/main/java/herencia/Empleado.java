package herencia;

import org.openqa.selenium.json.JsonOutput;

public class Empleado extends Persona {
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado(){
        this.idEmpleado = contadorEmpleado++;
    }
    public Empleado(String nombre,double sueldo){
        //super(nombre);
        this();//Se llama al constructor vacio
        this.nombre = nombre;
        this.sueldo = sueldo;


    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String toString(){
        return "Id Empleado:" + idEmpleado+
                ", Nombre:" + nombre +
                ", sueldo: " + sueldo;
    }


}
