
package com.mycompany.cursopoo;
public class clientedegym {
    public String nombre;
    public int edad;
    public String correo;
    public String telefono;
    private double numcliente;
    
    public static int numclientes=0;
    
    public clientedegym(String nombre, int edad, String correo, double numcliente){
        this.numcliente=numcliente;
        this.nombre= nombre;
        this.edad=edad;
        this.correo=correo;
        this.telefono=telefono;
                numclientes++;
        
        
    }
    
    
    
}
