package com.mycompany.ejerciciopoo;

public class Cerebroestudiante {
    private String nombre;
    private int niveldeconfusion;
    private int energia;

    // Constructor
    public Cerebroestudiante(String nombre, int niveldeconfusion, int energia){
        this.nombre = nombre;
        this.niveldeconfusion = niveldeconfusion;
        this.energia = energia;
    }

    public void getNivelDeConfusion(int niveldeconfusion){
        this.niveldeconfusion = niveldeconfusion;

        if(niveldeconfusion >= 50 && niveldeconfusion <= 79){
            System.out.println("Procesamiento lento");
            energia =energia-10;
        } 
        else if(niveldeconfusion >= 80 && niveldeconfusion < 100){
            System.out.println("Intentando derivar el sentido de la vida");
            energia= energia-30;
        } 
        else if(niveldeconfusion == 100){
            System.out.println("MIEDO, PÁNICO Y TERROR!");
            energia = energia-80;
        } 
        else if(niveldeconfusion < 50){
            System.out.println("Estado: compilado perfectamente");
            energia= energia-5;
        }

        System.out.println(energia + "%");
    }

    public int getNivelDeConfusion(){
        return niveldeconfusion;
    }

    public void estudiar(String concepto){
        System.out.println(nombre + " está estudiando: " + concepto);
        
    }
}