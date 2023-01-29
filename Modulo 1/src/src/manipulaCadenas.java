




/**
 *
 * @author Ervin Caravali Ibarra 1925648
 */
public class manipulaCadenas {

	public static void main(String[] args) {
	
		String Nombre = "Ervin";
		String NombreFamiliar = "Brandon";
		
		System.out.println("Su nombre es: " + Nombre + ".");
		System.out.println("Su nombre tiene " + Nombre.length() + " letras.");
		System.out.println("El nombre de tu familiar es: " + NombreFamiliar + ".");
		System.out.println("El nombre de tu familiar tiene " + NombreFamiliar.length() + " letras.");
		System.out.println("La primera letra del nombre de su familiar es " + NombreFamiliar.charAt(0) + ".");
		
		int ultimaLetra = Nombre.length();
		int ultimaLetra1 = NombreFamiliar.length();
		
		System.out.println("La ultima letra de su nombre es " + Nombre.charAt(ultimaLetra-1) + ".");
		System.out.println("La ultima letra del nombre  de su familiar nombre es " + NombreFamiliar.charAt(ultimaLetra1-1) + ".");
		
	}

}
