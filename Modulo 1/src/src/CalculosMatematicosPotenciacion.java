
/**
 *
 * @author Ervin Caravali Ibarra :1925648.
 * Esta aplicacion Ejemplifica el uso  del metodo pow,nuevamente;
 * 
 * @param args
 */
public class CalculosMatematicosPotenciacion{
    
    public static void main(String[] args) {
        double basis = 8;
        double exponent = 63;
        
        int result = (int) Math.pow(basis, exponent);
        System.out.println("La resuesta de: " + basis + " elevado a " + exponent+ " es " + result);
    }

}
