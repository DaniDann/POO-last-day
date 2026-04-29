package com.mycompany.cursopoo;

public class Cliente extends Persona {

    public String inicioMebresia;
    public String finalMebresia;
    public String telefono;

    public Cliente(String curp, int edad, String nombre, String primerApellido, String segundoApellido, String inicioMembresia, String finalMembresia, String telefono) {
        super(curp, edad, nombre, primerApellido, segundoApellido);
        this.inicioMebresia = inicioMembresia;
        this.finalMebresia = finalMembresia;
    }
    public String getInicioMembresia(){
        return this.inicioMebresia;
    }
    public String getFinalMembresia(){
        return this.finalMebresia;
    }
    public String getTelefono(){
        return this.telefono;
    }
    public void setInicioMembresia(String inicioMembresia){
        this.inicioMebresia = inicioMebresia;
    }
    public void setFinalMembresia(String finalMembresia){
        this.finalMebresia = finalMebresia;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    
}
