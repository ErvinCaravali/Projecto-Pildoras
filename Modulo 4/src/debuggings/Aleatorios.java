
package debuggings;

import javax.swing.JOptionPane;

/**
 *
 * @author Ervin Caravali Ibarra
 */
public class Aleatorios {
    
    public static void main(String[] args) {
        
        int element = Integer.parseInt(JOptionPane.showInputDialog("Ingrece numeros  a  la matriz"));
        
        int atorio[] = new int[element];
        
        for(int i = 0; i < atorio.length; i++) {
            atorio[i] = (int)(Math.random()*100);
        }
        
        for(int em : atorio) {
            System.out.println(em);
        }
    } 
}