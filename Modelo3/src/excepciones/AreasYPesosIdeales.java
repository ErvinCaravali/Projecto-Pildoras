
package excepciones;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Ervin Caravali Ibarra
 */
public class AreasYPesosIdeales {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         int lado ;
          int base;
         int altura;
         
        System.out.println("1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo");
         figura = Integer.parseInt(JOptionPane.showInputDialog("Elige una opcion:"));
        
       
        
        switch(figura) {
            case 1 -> {
                lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
                System.out.println(Math.pow(lado, 2));
            }
            
            case 2 -> {
                base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
                System.out.println("El area del rectangulo es " + base*altura);
            }
                
            case 3 -> {
                base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
                System.out.println("El area del triangulo es " + (base*altura)/2);
            }
                
            case 4 -> {
                int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio")); 
                System.out.println("El area del circulo es ");
                System.out.println(Math.PI*(Math.pow(radio, 2)));
            }
                
            default -> System.out.println("La opción no es correcta");          
        }
        
      
        
            altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm")); 
            System.out.println("Si eres hombre tu peso ideal es: " + (altura-110) + " kg");
            System.out.println("Si eres mujer tu peso ideal es: " + (altura-120) + " kg");
    }
    
    static int figura;

}
