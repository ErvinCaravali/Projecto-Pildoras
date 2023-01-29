package manipular_archivos;

import java.io.*;

/**
 *
 * @author Ervin Caravali Ibarra
 */
public class AccesoFicheros {

    public static void main(String[] args) {

        File ruta = new File("src" + File.separator + "manipular_archivos");

        System.out.println(ruta.getAbsolutePath());

        String[] nombresArchivos = ruta.list();

        for (String nombres_archivo : nombresArchivos) {
            System.out.println(nombres_archivo);
            File file = new File(ruta.getAbsolutePath(), nombres_archivo);
            if (file.isDirectory()) {
                String[] archivosSubcarpeta = file.list();

                for (String archivos_subcarpeta1 : archivosSubcarpeta) {
                    System.out.println(archivos_subcarpeta1);
                }
            }
        }
    }
}
