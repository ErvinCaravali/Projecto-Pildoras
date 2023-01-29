
package debuggingI;

import javax.swing.JOptionPane;

/**
 *
 * @author Ervin Caravali Ibarra 
 */
public class Aleatorios {
    
    public static void main(String[] args) {
        
        int elementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce elementos de la matriz"));
        
        int numAleatorio[] = new int[elementos];
        
        for(int i = 0; i < numAleatorio.length; i++) {
            numAleatorio[i] = (int)(Math.random()*100);
        }
        
        for(int elem : numAleatorio) {
            System.out.println(elem);
        }
    } 
}
