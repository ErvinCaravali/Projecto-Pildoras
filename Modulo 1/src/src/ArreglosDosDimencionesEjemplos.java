
/**
 *
 * @author Ervin Caravali Ibarra 1925648
 * Ejemplo de manejo de array de dos dimenciones.
 */
public class ArreglosDosDimencionesEjemplos {
    
    public static void main(String[] args) {
        double acumulados = 5000;
        double intereces = 0.20;
        double [][] saldo = new double[8][9];
        
        
        for(int i = 0; i < 8; i++) {
            
            for(int j = 1; j < 9; j++) {
                
            acumulados = acumulados +(acumulados*intereces);
            
            saldo[i][0] = acumulados;
            
            }
            
            intereces = intereces + 0.01;
            
        }
        
            for(int o = 0; o < 8; o++) {
                
                System.out.println("");
                
                for(int p = 0; p < 9; p++) {
                    
                    System.out.printf("%1.2f", saldo[o][p]);
                    
                    System.out.println(" ");
                }
            }
        
    }

}
