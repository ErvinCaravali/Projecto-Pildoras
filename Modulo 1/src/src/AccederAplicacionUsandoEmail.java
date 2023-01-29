
import javax.swing.JOptionPane;


/**
 *
 * @author Ervin Caravali Ibarra 1925648
 *  Evalua si un correo electronico ,como controseña de ingreso, es correcto o incorecto,pero esta vez usando un bucle for;
 */
public class AccederAplicacionUsandoEmail {
    
    public static void main(String[] args) {
        boolean point = false;
        int arroba = 0;
        
        
        String Email = JOptionPane.showInputDialog("Introduce email para ingresar: ");
        
        for(int i = 0;  i < Email.length(); i++) {
            if(Email.charAt(i) == '@') {
                arroba++;
            }
            if(Email.charAt(i) == '.') {
                point = true;
            }
        }
        
        if(arroba == 1 && point == true) {
            System.out.println("El email es correcto");
        } else {
            System.out.println("El email No es correcto");
        }
    }
}
