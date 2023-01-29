
package serializacion;

import java.util.*;
import java.io.*;

/**
 *
 * @author Ervin Caravali Ibarra 
 */
public class Serializacion {
    public static void main(String[] args) {
        Administrador jefe = new Administrador("Ever", 880000, 2007, 11, 16);
        jefe.setIncentivo(4000);
        
        Empleado[] personal = new Empleado[3];
        personal[0] = jefe;
        personal[1] = new Empleado("Danilo", 11000, 2007, 9, 1);
        personal[2] = new Empleado("brandon", 18000, 2012, 7, 15);
        
        try {
            
            try (ObjectOutputStream escriboFichero = new ObjectOutputStream(new FileOutputStream("src/serializacion/empleado.dat"))) {
                escriboFichero.writeObject(personal);
            }
            
            Empleado[] personalRecuperado;
            try (ObjectInputStream recuperoFichero = new ObjectInputStream(new FileInputStream("src/serializacion/empleado.dat"))) {
                personalRecuperado = (Empleado[]) recuperoFichero.readObject();
            }
            
            for(Empleado e : personalRecuperado) {
                System.out.println(e);
            }
            
        } catch (IOException | ClassNotFoundException e) {
            
        }
        
    }

}


class Administrador extends Empleado {
    
    private static final long serialVersionUID = 1L;
    
    public Administrador(String n, double s, int anio, int mes, int dia) {
        super(n, s, anio, mes, dia);
        incentivo = 0;
    }
    
    @Override
    public double getSueldo() {
        double sueldoBase = super.getSueldo();
        return sueldoBase + incentivo;
    }
    public void setIncentivo(double b) {
        incentivo = b;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Incentivo = " + incentivo;
    }
    private double incentivo;
}


class Empleado implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
        public Empleado(String n, double s, int anio, int mes, int dia) {
            nombre = n;
            sueldo = s;
            GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
            fechaContrato = calendario.getTime();
        }
    
    public String getNombre() {
        return nombre;
    }
    
    public double getSueldo() {
        return sueldo;
    }
    
    public Date getFechaContrato() {
        return fechaContrato;
    }
    
    public void subirSueldo(double porcentaje) {
        double aumento = sueldo*porcentaje/100;
        sueldo += aumento;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", sueldo = " + sueldo + ", fecha de contrato = " + fechaContrato;
        
    }
    private final String nombre;
    private double sueldo;
    private final Date fechaContrato;
}





