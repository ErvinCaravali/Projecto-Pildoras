
import javax.swing.JOptionPane;


/**
 *
 * @author Ervin Caravali Ibarra 1925648
 */
public class EntradaEjemplo2 {
    
    public static void main(String[] args) {
        String nombreDeusuario = JOptionPane.showInputDialog("Introduca su nombre:");
        String edadDelUsuario = JOptionPane.showInputDialog("Introduce su edad:");
        
        int edadusuario = Integer.parseInt(edadDelUsuario);
        
        System.out.println("Hola " + nombreDeusuario + ". El año que viene usted tendra " + (edadusuario+1) + " años");
    }
    
}
