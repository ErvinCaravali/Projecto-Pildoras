
import javax.swing.JOptionPane;

/**
 *
 * @author Ervin Caravali Ibarra 1925648 Entrada de Numeros
 */
public class EntradaDeNumeros {

    public static void main(String[] args) {
          double numero = 10960.0;
        System.out.printf("%1.2f", numero / 3);
       

       String numero1 = JOptionPane.showInputDialog("Introdusca un numero");

        double numero2 = Double.parseDouble(numero1);

        System.out.print("La raiz cuadrada  de: " + numero2 + " es ");

        System.out.printf("%1.2f", Math.sqrt(numero2));
        
      

    }

}
