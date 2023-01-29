
package streams;

import java.io.*;

/**
 *
 * @author Ervin Caravali Ibarra
 */
public class Lectura_Escritura {
    public static void main(String[] args) {
        
        int count = 0;
        int datosEntrada[] = new int[91360];
        
        
        try {
            try (FileInputStream archivolectura = new FileInputStream("src/streams/imagen.jpg")) {
                boolean ar = false;
                
                while(!ar) {
                    int byte_entrada = archivolectura.read();
                    
                    if(byte_entrada!=-1)
                        datosEntrada[count] = byte_entrada;
                    else
                        ar = true;
                    
                    System.out.println(datosEntrada[count]);
                    
                    count++;
                }
            }
        } catch (IOException e) {
            System.out.println("No se encuentra la imagen");
        }
        System.out.println(count);
        creaFichero(datosEntrada);
    }
    
    static void creaFichero(int datosNuevoFichero[]) {
        try {
            try (FileOutputStream ficheroNuevo = new FileOutputStream("src/streams/imagen_copia.jpg")) {
                for(int i = 0; i < datosNuevoFichero.length; i++) {
                    ficheroNuevo.write(datosNuevoFichero[i]);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al crear copia del archivo");
        }
    }
}
