
package manipular_archivos;

import java.io.*;

/**
 *
 * @author Ervin Caravali Ibarra
 */
public class Rutas {
    public static void main(String[] args) {
        
        File archivo = new File("build");
        System.out.println(archivo.getAbsolutePath());
        System.out.println(archivo.exists());     
        
    }
}
