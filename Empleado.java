
package com.mycompany.cursopoo;

public class Empleado extends Persona {
   private String rfc;
   private double sueldo;
   private boolean asegurado;
   public Empleado(String curp, int edad, String nombre, String primerApellido, String segundoApellido, String rfc, double sueldo, boolean asegurado){
       super(curp,edad,nombre,primerApellido,segundoApellido);
       this.rfc = rfc;
       this.sueldo = sueldo;
       this.asegurado = asegurado;
   }
   public String getRfc(){
       return this.rfc;
   }
   public double getSueldo(){
       return this.sueldo;
   }
   public boolean getAsegurado(){
       return this.asegurado;
   }
   public void setRfc(String rfc){
       this.rfc = rfc;
   }
   public void setSueldo(double sueldo){
       this.sueldo = sueldo;
   }
   public void setAsegurado(boolean asegurado){
       this.asegurado = asegurado;
   }
}
