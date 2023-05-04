package herencia;

import java.util.Date;

public class Cliente extends Persona {
    private int idCliente;
    private static int contadorEmpleado;
    private Date fechaRegistro;
    private boolean vip;

    public Cliente(String nombre,Date fechaRegistro, boolean vip, char genero, int edad, String direccion){
        super(nombre,genero,edad,direccion);
        this.idCliente = contadorEmpleado++;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }
    public int GetIdCliente(){
        return this.idCliente;
    }
    public void SetFechaRegistro(Date fechaRegistro){
        this.fechaRegistro = fechaRegistro;
    }
    public Date getFechaRegistro(){
        return this.fechaRegistro;
    }
    public void SetVip(boolean vip){
        this.vip = vip;
    }
    public boolean GetVip(){
        return this.vip;
    }

    @Override
    public String toString() {
        return "Cliente" +
                "idCliente=" + idCliente +
                ", fechaRegistro= " + fechaRegistro +
                ", vip= " + vip +(super.toString());
    }
}
