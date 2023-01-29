
/**
 *
 * @author Ervin Caravali Ibarra 1925648
 */
public class UsosArrays2V2 {
    
    public static void main(String[] args) {
        int [] mAleatoria = new int [1500];
        
        for(int i = 0; i < mAleatoria.length; i++) {
            mAleatoria[i] = (int)Math.round(Math.random()*100);
        }
        
        for(int numeros:mAleatoria) {
            System.out.println(numeros + " ");
        }
    }
}