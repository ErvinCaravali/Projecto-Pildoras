
package poo;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Ervin Caravali Ibarra
 */
public class Uso_Persona {
    
    public static void main(String[] args) {
        
        Persona[] lasPersonas = new Persona[2];
        
        lasPersonas[0] = new Empleado2("Diana", 50000, 2009, 02, 25);
        lasPersonas[1] = new Alumno("Dario", "Matematicas");
        
        for(Persona p: lasPersonas) {
            
            System.out.println(p.getNombre() + ", " + p.getDescripcion());
            
        }
        
    }

}


abstract class Persona {
    
    public Persona(String nom) {
        nombre = nom;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public abstract String getDescripcion();
    
    private String nombre;
    
}

class Empleado2 extends Persona{
    
    public Empleado2(String nom, double sue, int anio, int mes, int dia) {
        
        super(nom);
        
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
        altaContrato = calendario.getTime();
        IdSiguiente++;
        Id = IdSiguiente;  
      
    }
    
    private String nombre;
    private double sueldo;
    private Date altaContrato;
    private static int IdSiguiente;
    private int Id;

    @Override
    public String getDescripcion() {
        return "Este empleado tiene un Id = " + Id + " con un sueldo = " + sueldo;
    }
 
}

class Alumno extends Persona {
    
    public Alumno(String nom, String car) {
        super(nom);
        carrera = car;
        
    }
    
    public String getDescripcion() {
        
        return "Este alumno está estudiando la carrera de " + carrera;
        
    }
    
    private String carrera;
}
