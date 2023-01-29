
package excepciones;

import javax.swing.*;



/**
 *
 * @author Ervin Caravali Ibarra
 */
public class Varias_Excepciones {
    
    public static void main(String[] args) {
        try {
            division();            
        } catch(ArithmeticException e) {
            System.out.println("Estás dividiendo por cero");
        } catch(NumberFormatException e) {
            System.out.println("No has introducido un numero");
            //System.out.println(e.getMessage());
            System.out.println("Se ha generado un error de este tipo:" + e.getClass().getName());
            
        } 

    }
    
    static void division() {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dividendo"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor"));
        
        System.out.println("El resultado es: " + num1/num2);
    }

}
