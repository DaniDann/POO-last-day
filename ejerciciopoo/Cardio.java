
package com.mycompany.ejerciciopoo;


public class Cardio extends Maquina {
    private String tipo;

    public Cardio(String tipo, int precio, String marca, boolean mantenimiento) {
        super(precio, marca, mantenimiento);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
