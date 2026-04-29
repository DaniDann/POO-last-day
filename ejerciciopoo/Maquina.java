
package com.mycompany.ejerciciopoo;

public class Maquina {
    private int precio;
    private String marca;
    private boolean mantenimiento;
    
    public Maquina(int precio, String marca,boolean mantenimiento){
        this.precio=precio;
        this.marca=marca;
        this.mantenimiento=mantenimiento;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(boolean mantenimiento) {
        this.mantenimiento = mantenimiento;
    }
   


}

