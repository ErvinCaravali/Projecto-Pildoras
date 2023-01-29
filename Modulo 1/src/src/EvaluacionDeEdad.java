import java.util.*;

/**
 *
 * @author Ervin Caravali Ibarra 1925648 .
 * La aplicacion determina la Edad del ususrio,y lo ubica en un  raango de edad.
 * 
 */
public class EvaluacionDeEdad {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce su edad");
        
        int edad = entrada.nextInt();
        
        if (edad < 18) {
            System.out.println("Eres un joven menor de 18 años");
        } else if (edad < 65) {
            System.out.println("Eres un adulto menor  de 65 años");
        } else {
            System.out.println("Felicidades");
        }
    }

}
