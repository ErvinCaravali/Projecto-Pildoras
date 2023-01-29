
package manipular_archivos;

import java.io.*;

/**
 *
 * @author Erivn Caravali Ibarra
 */
public class Creando {
    public static void main(String[] args) {
        
        File ruta = new File("src" + File.separator + "manipular_archivos" + File.separator + "nuevodirectorio");
        File ruta2 = new File("src" + File.separator + "manipular_archivos" + File.separator + "pruebatexto.txt");
        
        String archivo_destino = ruta2.getAbsolutePath();
        
        try {

            ruta2.createNewFile();
        } catch (IOException e) {
        }
        
        Escribiendo accede_es = new Escribiendo();
        accede_es.escribir(archivo_destino);
        
    }
    
}

class Escribiendo {
    public void escribir(String ruta_archivo) {
        String frase = "Esta es mi practica";
        
        try {
            
            try (FileWriter escritura = new FileWriter(ruta_archivo)) {
                for(int i = 0; i < frase.length(); i++) {
                    
                    escritura.write(frase.charAt(i));
                    
                }
            }
            
        } catch (IOException e) {
            
        }
        
    }
}
