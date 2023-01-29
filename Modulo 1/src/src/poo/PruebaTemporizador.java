
package poo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;

/**
 *
 * @author Ervin Caravali Ibarra
 */
public class PruebaTemporizador {
    
    public static void main(String[] args) {
        
        DameHora oyente = new DameHora();
        Timer miTemporizador = new Timer(5000, oyente);
        miTemporizador.start();
        
        JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
        
        System.exit(0);
    }

}


class DameHora implements ActionListener {
    
    public void actionPerformed(ActionEvent e) {
        Date ahora = new Date();
        System.out.println("Te pongo la hora cada 5 segundos: " + ahora);
    }
}