
package manipular_archivos;

import java.io.*;

/**
 *
 * @author Ervin Caravali Ibarra
 */
public class Eliminar {
    public static void main(String[] args) {
        
        File ruta2 = new File("src" + File.separator + "manipulararchivos" + File.separator + "pruebatexto.txt");
        
        ruta2.delete();
    }
}


