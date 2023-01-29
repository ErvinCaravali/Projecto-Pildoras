
import javax.swing.JOptionPane;

/**
 *
 * @author Ervin Caravali Ibarra 1925648 Calulo de Peso ideal, esto teniendo en
 * cuenta el genero y la altura.
 */
public class PesoIdeal {

    public static void main(String[] args) {

        int pesoIdeal = 0;
        String genero = JOptionPane.showInputDialog("Introduca su genero");
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));

        do {

            if (genero.equalsIgnoreCase("H")) {
                pesoIdeal = altura - 110;
                System.out.println("Tu peso ideal es: " + pesoIdeal + " kg");
                break;
            } else if (genero.equalsIgnoreCase("M")) {
                pesoIdeal = altura - 120;
                System.out.println("Tu peso ideal es: " + pesoIdeal + " kg");
                break;
            } else {
                System.out.println("no ingreso los campos adecuadamente ");

                break;
            }

        } while (genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);

    }

}
