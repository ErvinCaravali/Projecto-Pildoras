
package poo;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Ervin Caravali Ibarra
 */
public class UsoEmpleado {

    public static void main(String[] args) {
        
       
        Jefatura jefe_RRHH = new Jefatura("Juan", 55000, 2006, 9, 25);
        
        jefe_RRHH.estableceIncetivo(2570);
        
        Empleado[] misEmpleados = new Empleado [6];
        
        misEmpleados[0] = new Empleado("Emanuel Rivas", 85000, 1990, 12, 17);
        misEmpleados[1] = new Empleado("Maria Rodriguez", 95000, 1995, 06, 02);
        misEmpleados[2] = new Empleado("Karen Moreno", 105000, 2002, 03, 15);
        misEmpleados[3] = new Empleado("Antonio Fernandez");
        misEmpleados[4] = jefe_RRHH;
        misEmpleados[5] = new Jefatura ("Maria", 95000, 1999, 5, 26);
        
        Jefatura jefa_Finanzas = (Jefatura) misEmpleados[5];
        jefa_Finanzas.estableceIncetivo(55000);
        
        System.out.println(jefa_Finanzas.tomarDecisiones("Dar más dias de vacaciones a los empleados"));
        System.out.println("El jefe " + jefa_Finanzas.getNombre() + " tiene un bonus de: " +
                            jefa_Finanzas.estableceBonus(500));
        
        System.out.println(misEmpleados[3].getNombre() + " tiene un bonus de: " + misEmpleados[3].estableceBonus(200));
        
        
        
        for(Empleado e:misEmpleados) {
            e.subeSueldo(5);    
        }
        
        Arrays.sort(misEmpleados);  
        
        for(Empleado e:misEmpleados) {
            System.out.println("Nombre: " + e.getNombre() + " Sueldo: " + e.getSueldo() + " Fecha de Alta: " + e.getFechaContrato());
        }
        
        
        
    }
    
}

class Empleado implements Comparable, Trabajadores {
    
    public Empleado(String nom, double sue, int anio, int mes, int dia) {
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
        altaContrato = calendario.getTime();
        IdSiguiente++;
        Id = IdSiguiente;
     
    }
    
    public Empleado(String nom) {
        
        this(nom, 30000, 2000, 01, 01);
        
        
    }
    
    public String getNombre() {
        return nombre + " Id: " + Id;
    }
    
    public double getSueldo() {
        return sueldo;
    }
    
    public Date getFechaContrato() {
        return altaContrato;
    }
    
    public void subeSueldo(double porcentaje) {
        
        double aumento = sueldo*porcentaje/100;
        sueldo+=aumento;
        
    }
    
    public int compareTo(Object miObjeto) {
        Empleado otroEmpleado = (Empleado) miObjeto;
        if(this.sueldo < otroEmpleado.sueldo) {
            return -1;
        }
        if(this.sueldo > otroEmpleado.sueldo) {
            return 0;
        }
        return 0;
    }
   
    
    private String nombre;
    private double sueldo;
    private Date altaContrato;
    private static int IdSiguiente;
    private int Id;

    @Override
    public double estableceBonus(double gratificacion) {
        
        return Trabajadores.Base + gratificacion;
    }
    
    
}

class Jefatura extends Empleado implements Jefes{
    
    
    public Jefatura(String nom, double sue, int anio, int mes, int dia) {
        super(nom, sue, anio, mes, dia);
        
        
    }
    
    public void estableceIncetivo(double b) {
        incentivo = b;
    }
    
    public double getSueldo() {
        double sueldoJefe = super.getSueldo();
        return sueldoJefe + incentivo;
    }
    
    public String tomarDecisiones(String decision) {
        return "Un miembro ha tomado la decision de: " + decision;
    }
    
    private double incentivo;

    @Override
    public double estableceBonus(double gratificacion) {
        double prima = 2000;
        return Trabajadores.Base + gratificacion + prima;
        
    }
    
}

class Director extends Jefatura {
    
    public Director(String nom, double sue, int anio, int mes, int dia) {
        
        super(nom, sue, anio, mes, dia);
        
    }
}