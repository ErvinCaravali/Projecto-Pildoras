package texts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Ervin Caravali Ibarra 1925648
 */
public class MenuConImagenes {

    public static void main(String[] args) {
        MenuProcesador2 menu = new MenuProcesador2();
    }
}

class MenuProcesador2 extends JFrame {

    public MenuProcesador2() {
        PanelProcesador2 mipanel = new PanelProcesador2();
        add(mipanel);
        setVisible(true);
        setBounds(500, 300, 550, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class PanelProcesador2 extends JPanel {

    JTextPane area;
    JMenu fuente, estilo, tamanio;
    Font letras;

    public PanelProcesador2() {

        setLayout(new BorderLayout());
        JPanel panelmenu = new JPanel();

        JMenuBar barra = new JMenuBar();

        fuente = new JMenu("Fuente");
        estilo = new JMenu("Estilo");
        tamanio = new JMenu("Tamaño");

        configura_menu("Arial", "fuente", "Arial", 9, 10, "");
        configura_menu("Times New Roman", "fuente", "Times New Roman", 9, 10, "");
        configura_menu("Verdana", "fuente", "Verdana", 9, 10, "");

        configura_menu("Negrita", "estilo", "", Font.BOLD, 1, "bin/graficos/negrita.png");
        configura_menu("Cursiva", "estilo", "", Font.ITALIC, 1, "bin/graficos/cursiva.png");

        configura_menu("12", "tamanio", "", 9, 12, "");
        configura_menu("16", "tamanio", "", 9, 16, "");
        configura_menu("20", "tamanio", "", 9, 20, "");
        configura_menu("24", "tamanio", "", 9, 24, "");

        barra.add(fuente);
        barra.add(estilo);
        barra.add(tamanio);

        panelmenu.add(barra);
        add(panelmenu, BorderLayout.NORTH);

        area = new JTextPane();
        add(area, BorderLayout.CENTER);

    }

    public void configura_menu(String rotulo, String menu, String tipo_letra, int estilos, int tam, String ruta_icono) {
        JMenuItem elem_menu = new JMenuItem(rotulo, new ImageIcon(ruta_icono));
        if (menu == "fuente") {
            fuente.add(elem_menu);
        } else if (menu == "estilo") {
            estilo.add(elem_menu);
        } else if (menu == "tamanio") {
            tamanio.add(elem_menu);
        }
        elem_menu.addActionListener(new GestionaEventos(rotulo, tipo_letra, estilos, tam));
    }

    private class GestionaEventos implements ActionListener {

        String tipotexto, menu;
        int estiloletra, tamanioletra;

        GestionaEventos(String elemento, String texto2, int estilo2, int tamletra) {
            tipotexto = texto2;
            estiloletra = estilo2;
            tamanioletra = tamletra;
            menu = elemento;
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            letras = area.getFont();
            if (menu == "Arial" || menu == "Courier" || menu == "Verdana") {
                estiloletra = letras.getStyle();
                tamanioletra = letras.getSize();
            } else if (menu == "Cursiva" || menu == "Negrita") {

                if (letras.getStyle() == 1 || letras.getStyle() == 2) {
                    estiloletra = 3;
                }

                tipotexto = letras.getFontName();
                tamanioletra = letras.getSize();
            } else if (menu == "12" || menu == "16" || menu == "20" || menu == "24") {
                estiloletra = letras.getStyle();
                tipotexto = letras.getFontName();
            }

            area.setFont(new Font(tipotexto, estiloletra, tamanioletra));

            System.out.println("Tipo: " + tipotexto + " Estado: " + estiloletra + " Tamaño: " + tamanioletra);

        }
    }

}
