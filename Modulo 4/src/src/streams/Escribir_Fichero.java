
package streams;

import java.io.*;

/**
 *
 * @author Ervin Caravali Ibarra 
 */
public class Escribir_Fichero {
    public static void main(String[] args) {
        Escribiendo accedeEscritura = new Escribiendo();
        accedeEscritura.escribir();
    }
}

class Escribiendo {
    
    public void escribir() {
        String frase = "Esto es una prueba de escritura 2";
        try {
            FileWriter escritura = new FileWriter("src/streams/texto_nuevo.txt", true);
            for(int i = 0; i < frase.length(); i++) {
                escritura.write(frase.charAt(i));
            }
            escritura.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
