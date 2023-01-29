
public class CalculosMatematicos {
/**
 *
 * @author Ervin Caravali Ibarra :1925648.
 * Esta aplicacion Ejemplifica el uso  del metodo pow, casteo de un char a un int, y combertir double a bite;
 * 
 * @param args
 */
	public static void main(String[] args) {
		double root = Math.sqrt(129);
		System.out.println(root);
		
		int rounding= (int) Math.round(root);
		System.out.println(rounding);
		
                /*
		Ejemplos con el método pow.
		*/
		double basis = 9;
		double exponent = 25;
		int result = (int)Math.pow(basis, exponent);
		
		System.out.println("La respuesta de" + basis + " potencia  de " + exponent + " es: " + result);
		
		/*
	        casteo de un char a un int.
		*/
		int numero = 6936	;
		char pasardeIntAChar = (char) numero;
		System.out.println("La respuesta  de transformar  " + numero + " es: " + pasardeIntAChar);
		/*
		Paso de double a byte.
		*/
		double u = 3239484.18484428888888888;
		byte p;
		p = (byte) u;
		
		System.out.println("El resultado de b es: " + p);
		
		
	}

}
