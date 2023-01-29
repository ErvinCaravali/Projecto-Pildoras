
import javax.swing.JOptionPane;


/**
 *
 * @author Ervin Caravali Ibarra :1925648
 * Evalua si la cotraseña de ingreso es correcta o incorecta. La aplicacion.
 */
public class AccesoAplicacionUsandoNombre {
    
    public static void main(String[] args) {
        String key = "Ervin Caravali Ibarra";
        String pass = "";
        
        while(key.equals(pass) == false) {
            pass = JOptionPane.showInputDialog("Introduce la contraseña, para iniciar");
            
            if(key.equals(pass) == false) {
                System.out.println("La contraseña  no es correcta");
            }
        }
        
        System.out.println(" La Contraseña correcta,se Permite el acceso");
    }

}
