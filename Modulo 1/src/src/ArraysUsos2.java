
import javax.swing.JOptionPane;


/**
 *
 * @author Ervin Caravali Ibarra
 */
public class ArraysUsos2 {
    
    public static void main(String[] args) {
        /*
        String [] paises = new String[8];
        
        Mpaises[0] = "España";
        Mpaises[1] = "Colombia";
        Mpaises[2] = "Turquia";
        Mpaises[3] = "Argelia";
        Mpaises[4] = "Canada";
        Mpaises[5] = "EE.UU";
        Mpaises[6] = "Polonia";
        Mpaises[7] = "Dinamarca";
        */
        
        String [] Mpaises = {"España", "Colombia", "Turquia", "Argelia", "Canada", "EE.UU", "Polonia", "Dinamarca"};
        
        /*
        for(int i = 0; i < Mpaises.length; i++) {
            System.out.println("Pais " + (i+1) + " " + Mpaises[i]);
        }
        */
        
        
        /*
        for(int i = 0; i < 8; i++) {
            
            Mpaises[i] = JOptionPane.showInputDialog("Introduce pais" + (i+1));
           System.out.println("Pais " + (i+1) + " " + Mpaises[i]);
        }
        */
        
        
        for(String elemento:Mpaises) {
            System.out.println(elemento);
        }
        

        
    }

}
