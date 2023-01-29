
import javax.swing.*;

/**
 *
 * @author Ervin Caravali Ibarra 1925648
 * Calculo de  nuemero  factorial.
 */
public class NumeroFactorial {

    public static void main(String[] args) {

        int results = 1;

        int numbers = Integer.parseInt(JOptionPane.showInputDialog("Introduca un numero"));

        for (int i =2; i <=numbers; i++) {
            results = results * i;
        }
        System.out.println("El factorial de " + numbers + " es " + results);

   

    }
}
