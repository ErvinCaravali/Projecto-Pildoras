
package poo;

/**
 *
 * @author Ervin Caravali Ibarra
 */
public class Pruebas {
    public static void main(String[] args) {
        Empleados trabajador1 = new Empleados("Carlangas");
        Empleados trabajador2 = new Empleados("Kiko");
        Empleados trabajador3 = new Empleados("Antonio");
        Empleados trabajador4 = new Empleados("Maria");
        
        System.out.println(trabajador1.devuelveDatos() + "\n" + trabajador2.devuelveDatos() + "\n" +
                           trabajador3.devuelveDatos() + "\n" + trabajador4.devuelveDatos());
        
        System.out.println(Empleados.dameIdSiguiente());
        
   
        
    }
            
}

class Empleados {

    private final String nombre;
    private String seccion;
    private int Id;
    private static int IdSiguiente = 1;
    
    
    public Empleados(String nom) {
        
        nombre = nom;
        seccion = "Administracion";
        Id = IdSiguiente;
        IdSiguiente++;
    
    }
    
    public void cambiaSeccion(String seccion) {
        this.seccion = seccion;
    }
    
    public String devuelveDatos() {
        return "El nombre es: " + nombre + " y la sección es " + seccion + " y el Id = " + Id;
    }
    
    public static String dameIdSiguiente() {
        return "El siguiente Id es: " + IdSiguiente;
    }
    
    
}
