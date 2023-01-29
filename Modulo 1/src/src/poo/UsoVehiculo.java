
package poo;



/**
 *
 * @author Ervin Caravali Ibarra
 */
public class UsoVehiculo {
    
    public static void main(String[] args){
        
        Autos micoche1 = new Autos();
        micoche1.setColor("Rojo");
        
        Furgoneta miFurgoneta1 = new Furgoneta(7, 580);
        miFurgoneta1.setColor("azul");
        miFurgoneta1.configuraAsientos("si");
        miFurgoneta1.configuraClimatizador("si");
        
        System.out.println(micoche1.dime_datos_generales() + " " + micoche1.getColor());
        
        System.out.println(miFurgoneta1.dime_datos_generales() + miFurgoneta1.dimeDatosFurgoneta());
        
      
        
    }
    

    }
   
    
    
    
    
    
