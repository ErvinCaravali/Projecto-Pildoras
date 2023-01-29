
package streams;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author Eevin Caravali Ibarra
 */
public class AccesoFichero {
    public static void main(String[] args) {
        LeerFichero accediendo = new LeerFichero();
        accediendo.lee();
    }
}

class LeerFichero {
    public void lee() {
        
        try {
            entrada = new FileReader("src/streams/ejemplo.txt");
            BufferedReader mibuffer = new BufferedReader(entrada); 
 
            String linea = "";
            while(linea != null) {
                
                linea = mibuffer.readLine();
                
                if(linea!=null)
                System.out.println(linea);
                
            }   
        } catch (IOException e) {
            System.out.println("No se ha encontrado el archivo");
        } finally {
            try {
                entrada.close();                
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        
    }
    FileReader entrada;
}
