
package Poo;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

/**
 *
 * @author Ervin Caravali Ibarra 1925648
 */
public class PruebaTemporizador2 {
    
    public static void main(String[] args) {
        
        Reloj miReloj = new Reloj();
        miReloj.enMarcha(3000, true);
        
        JOptionPane.showMessageDialog(null, "Pulse aceptar para detener");
        System.exit(0);
        
        
    }

}

class Reloj {
    
    public void enMarcha(int intervalo, final boolean sonido) {
        
        class DameHora2 implements ActionListener {
            
            public void actionPerformed(ActionEvent evento) {
            
                Date ahora = new Date();
            
                System.out.println("Se pone la hora cada 3 seg" + ahora);
                
                if(sonido) {
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        }
        
        ActionListener oyente = new DameHora2();
        Timer miTemporizador = new Timer(intervalo, oyente);
        miTemporizador.start();
    }  
}
 