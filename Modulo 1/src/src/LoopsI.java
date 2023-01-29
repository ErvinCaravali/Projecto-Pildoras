
import javax.swing.*;

/**
 *
 * @author Ervin Caravali Ibarra :1925648 Evalua si la contraseña de ingreso es
 * correcta o incorecta. La aplicacion,este es un diseño usando el bucle do
 * while,para practicar otros ciclos.
 */
public class LoopsI {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String key = "Agenjo";
        String pass = "";

        do {
            pass = JOptionPane.showInputDialog("Introduce la contraseña");

            if (key.equals(pass) == false) {
                System.out.println("Contraseña incorrecta");
            } else {
                System.out.println("Acceso concedido");
            }
        } while (key.equals(pass) == false);
    }

}
