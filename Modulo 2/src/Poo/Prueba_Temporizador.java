
package Poo;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;

/**
 *
 * @author Ervin Caravali Ibarra 1925648
 */
public class Prueba_Temporizador {
    
    public static void main(String[] args) {
        
        DameHora oyente = new DameHora();
        Timer miTemporizador = new Timer(5000, oyente);
        miTemporizador.start();
        
        JOptionPane.showMessageDialog(null, "Pulse aceptar para detener");
        
        System.exit(0);
    }

}


class DameHora implements ActionListener {
    
    public void actionPerformed(ActionEvent e) {
        Date ahora = new Date();
        System.out.println("Se pone la hora cada 5 segundos: " + ahora);
        
        Toolkit.getDefaultToolkit().beep();
    }
}