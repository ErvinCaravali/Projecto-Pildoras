
import java.util.Scanner;


/**
 *
 * @author Ervin Caravali Ibarra 1925648
 * Esta aplicacion  deermina la edad que  tendra un usuario al año siguiente. 
 */
public class EntradaEjemplo1 {
    
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        
        System.out.println("Introduca su nombre");
        
        String nombreDeusuario = entradaDatos.nextLine();
        
        System.out.println("Introduca su edad");
        
        int edadDelusuario = entradaDatos.nextInt();
        
        System.out.println("Quiubo, " + nombreDeusuario + ", el proximo año usted tendra "+ (edadDelusuario + 1) + " años");
        
    }

}
