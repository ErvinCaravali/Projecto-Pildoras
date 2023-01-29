
import java.util.Scanner;

public class AdivinadorDeNumeros {

    /**
     *
     * @author Ervin Caravali Ibarra :1925648 Esta Aplicacion Genera un numero
     * aleatorio entre 0 y 100, se emplea el metodo random de Math.
     * @param args
     */
    public static void main(String[] args) {

        Scanner datoEntrada = new Scanner(System.in);
        int intentoS = 0;
        int AleatorioS = (int) (Math.random() * 100);
        int numeroS = 0;

        while (numeroS != AleatorioS) {
            intentoS++;
            System.out.println("Introduce un numero : ");
            numeroS = datoEntrada.nextInt();

            if (numeroS > AleatorioS) {
                System.out.println(" Es incorrecto, el numero aleatorio es menor");
            } else if (numeroS < AleatorioS) {
                System.out.println("  Es incorrecto, el numero aleatorio es más grande");
            }
        }
        System.out.println("El numero de intentos realizados es: " + intentoS);
        System.out.println("lo has logrado Ganaste!!");

    }
}
