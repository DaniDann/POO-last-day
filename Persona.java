/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cursopoo;

/**
 *
 * @author urica
 */
public class Persona {
    public String curp;
    public int edad;
    public String nombre;
    public String primerApellido;
    public String segundoApellido;
    
    public Persona(String curp, int edad, String nombre, String primerApellido, String segundoApellido){
        this.curp = curp;
        this.edad = edad;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }
    
    public String getCurp(){
        return this.curp;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getPrimerApellido(){
        return this.primerApellido;
    }
    public String getSegundoApellido(){
        return this.segundoApellido;
    }
    public void setCurp(String curp){
        this.curp = curp;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setPrimerApellido(String primerApellido){
        this.primerApellido = primerApellido;
    }
    public void setSegundoApellido(String segundoApellido){
        this.segundoApellido = segundoApellido;
    }
    
}
