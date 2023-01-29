
package poo;

/**
 *
 * @author Ervin Caravali Ibarra 
 */

public class Autos {
    
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private int peso_total;
    private boolean asientos_cuero, climatizador;
    
    
    public Autos() {
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 500;
    }
    
      public void configuraClimatizador(String climatizador) {
        if(climatizador.equalsIgnoreCase("si")) {
            
            this.climatizador = true;
        } else {
            this.climatizador = false;
        }
    }
    
    public String getClimatizador() {
        if(climatizador == true) {
            return "El Auto tiene climatizador";
        } else {
            return "El Auto tiene aire acondicionado";
        }
    }
    
    public String getPesoCoche() {
        int peso_carroceria = 500;
        peso_total = peso_total + peso_carroceria;
        if(asientos_cuero == true) {
            peso_total += 50;
        } if(climatizador == true) {
            
            peso_total+=20;
            
        }
        return "El peso  en kg del Auto es " + peso_total;
        
    }
    public int precioCoche() {
        
        int precio_final = 10000;
        
        if(asientos_cuero == true) {
            precio_final += 2000;
        }
        if(climatizador == true) {
            precio_final += 1500;
        }
        return precio_final;
    }
    
    public String getLargo() {
        return "El largo del Auto es: " + largo;
    }
    
    public void setColor(String colorCoche) {
        color = colorCoche;
    }
    
    public String getColor() {
        return "El color del Auto es: " + color;
    }
    
    public String dime_datos_generales() {
        return "La plataforma del Auto tiene " + ruedas + " ruedas" + ". Mide " + largo/1000 + " metros con un ancho de " + ancho + " cms y un peso de plataforma de " + peso_plataforma + " kg";
    }
    
    public void configuraAsientos(String asientos_cuero) {
        if(asientos_cuero.equalsIgnoreCase("si")) {
            this.asientos_cuero = true;
        } else {
            this.asientos_cuero = false;
        }
    }
    
    public String getAsientos() {
        if(asientos_cuero) {
            return "El Auto tiene asientos de cuero";
        } else {
            return "El Auto tiene asientos de serie";
        }
    }
    
  
}


