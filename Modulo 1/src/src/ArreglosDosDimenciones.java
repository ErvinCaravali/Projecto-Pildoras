
/**
 *
 * @author Ervin Caravali Ibarra :1925648.
 * Esta aplicacion muestra un Array de dos dimecnioens.
 * 
 * @param args
 */
public class ArreglosDosDimenciones {
    
    public static void main(String[] args) {
        int[][] matrixOfnumbers = {
            {100,200,300,400,500},
            {600,700,800,900,1000},
            {1100,1200,1300,1400,1500},
            {1600,1700,1800,1900,2000}
        };
        
        
        matrixOfnumbers[0][0] = 1;
        matrixOfnumbers[0][1] = 2;
        matrixOfnumbers[0][2] = 3;
        matrixOfnumbers[0][3] = 4;
        matrixOfnumbers[0][4] = 5;
        
        matrixOfnumbers[1][0] = 6;
        matrixOfnumbers[1][1] = 7;
        matrixOfnumbers[1][2] = 8;
        matrixOfnumbers[1][3] = 9;
        matrixOfnumbers[1][4] = 10;
        
        matrixOfnumbers[2][0] = 11;
        matrixOfnumbers[2][1] = 12;
        matrixOfnumbers[2][2] = 13;
        matrixOfnumbers[2][3] = 14;
        matrixOfnumbers[2][4] = 15;
        
        matrixOfnumbers[3][0] = 16;
        matrixOfnumbers[3][1] = 17;
        matrixOfnumbers[3][2] = 18;
        matrixOfnumbers[3][3] = 19;
        matrixOfnumbers[3][4] = 20;
        
        
        for(int[]row:matrixOfnumbers) {
            
            System.out.println("");
            
            for(int r:row) {
                System.out.print(r + " ");
            }
        }
        
    }

}
