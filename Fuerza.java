
package com.mycompany.ejerciciopoo;

public class Fuerza extends Maquina {
  
     private String Zonaatrabajar;
    private String  consultar;

    public Fuerza(String Zonaatrabajar, String consultar, int precio, String marca, boolean mantenimiento) {
        super(precio, marca, mantenimiento);
        this.Zonaatrabajar = Zonaatrabajar;
        this.consultar = consultar;
    }

    public String getZonaatrabajar() {
        return Zonaatrabajar;
    }

    public void setZonaatrabajar(String Zonaatrabajar) {
        this.Zonaatrabajar = Zonaatrabajar;
    }

    public String getConsultar() {
        return consultar;
    }

    public void setConsultar(String consultar) {
        this.consultar = consultar;
    }

    
   
}
