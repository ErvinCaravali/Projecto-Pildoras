package excepciones;

import javax.swing.*;

/**
 *
 * @author Ervin Caravali Ibarra
 */
public class Fallos {
    
    public static void main(String[] args) {
        int [] miMatriz = new int[5];
        /*
        miMatriz[0] = 5;
        miMatriz[1] = 38;
        miMatriz[2] = 12;
        miMatriz[3] = -243;
        miMatriz[4] = 64;
        miMatriz[5] = 81;
        */
            
        for(int i = 0; i < 5; i++) {
            System.out.println("Posicion: " + i + " = " + miMatriz[i]);
        }
        
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
        System.out.println("Hola " + nombre + " Tienes " + edad + " años." + " El programa terminó su ejecución");
        
    }

}
