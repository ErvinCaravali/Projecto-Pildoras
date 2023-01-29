
import java.util.Scanner;


/**
 *
 * @author Ervin Caravali Ibarra 1925648
 */
public class UsoTallas {
    
    // definicion de  Talla {MINI, MEDIANO, GRANDE, EXTRAGRANDE};

    
    enum Talla {
        MINI("S"), MEDIANO("M"), GRANDE("L"), EXTRAGRANDE("XL");
        
        private Talla(String delimitacion) {
            
            this.delimitacion = delimitacion;
            
        }
        
        public String dameAbreviatura() {
            return delimitacion;
            
        }
        private String delimitacion;
    }
    
    public static void main(String[] args) {
        
        Scanner entradaiNFO = new Scanner(System.in);
        
        System.out.println("ESCRIBA SU TALLA : MINI, MEDIANO, GRANDE, EXTRAGRANDE");
        
        String entradaDatos = entradaiNFO.next().toUpperCase();
        
        Talla MiTalla = Enum.valueOf(Talla.class, entradaDatos);
        
        System.out.println("TALLA = " + MiTalla);
        
        System.out.println("ABREVIATURA = " + MiTalla.dameAbreviatura());
        
    }

}

