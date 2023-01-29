
import javax.swing.*;
import java.util.*;

/**
 *
 * @author Ervin Caravali Ibarra :1925648 Esta Aplicacion Calcula Area de
 * figuras geometricas y radio deun circulo - Usando JOptionPane.showInputDialog y la clase Scanner.
 * @param args
 */
public class AreasFigurasGeometricas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        boolean salir = false;
        int figura;
        int lado;
        int base;
        int altura;
        int radio;
        while (!salir) {
            System.out.println("1: Cuadrado: ");
            System.out.println("2: Rectangulo:");
            System.out.println("3: Triangulo:");
            System.out.println("4: Circulo:");
            System.out.println("5: Salir:");
            figura = Integer.parseInt(JOptionPane.showInputDialog("Escoja  una opcion:"));
            switch (figura) {
                case 1:
                    lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));

                    System.out.println("El area del cuadrado es " + Math.pow(lado, 2));

                    break;

                case 2:
                     base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                    altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));

                    System.out.println("El area del rectangulo es " + base * altura);

                    break;
                case 3:
                    base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                    altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));

                    System.out.println("El area del triangulo es " + (base * altura) / 2);
                    break;
                case 4:
                     radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
                    System.out.println("El area del circulo es ");
                    System.out.printf("%1.2f", Math.PI * (Math.pow(radio, 2)));
                    break;
                case 5:
                    System.out.println("fin del Calculo ");
                    salir = true;
                    break;

                default:
                    System.out.println("La opción no es correcta");
            }
        }

    }

}
