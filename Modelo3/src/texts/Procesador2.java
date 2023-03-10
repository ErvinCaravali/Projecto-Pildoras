
package texts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Ervin Caravali Ibarra
 */
public class Procesador2 {
    public static void main(String[] args) {
        MenuProcesador2 menu = new MenuProcesador2();
    }
}

class MenuProcesador2 extends JFrame{
    
    public MenuProcesador2(){
        PanelProcesador2 mipanel = new PanelProcesador2();
        add(mipanel);
        setVisible(true);
        setBounds(500, 300, 550, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }
}

class PanelProcesador_II extends JPanel{
    public PanelProcesador_II(){
        
        setLayout(new BorderLayout());
        JPanel panelmenu = new JPanel();
        
        JMenuBar mibarra = new JMenuBar();
        
 
        fuente = new JMenu("Fuente");
        estilo = new JMenu("Estilo");
        tamanio = new JMenu("Tamaño");
        
        configura_menu("Arial", "fuente", "Arial", 9, 10);
        configura_menu("Times New Roman", "fuente", "", 9, 10);
        configura_menu("Verdana", "fuente", "", 9, 10);
      
        
        configura_menu("Negrita", "estilo", "", Font.BOLD, 1);
        configura_menu("Cursiva", "estilo", "", Font.ITALIC, 1);
        
      
        
        configura_menu("12", "tamanio", "", 9, 12);
        configura_menu("16", "tamanio", "", 9, 16);
        configura_menu("20", "tamanio", "", 9, 20);
        configura_menu("24", "tamanio", "", 9, 24);
        
                
        mibarra.add(fuente);
        mibarra.add(estilo);
        mibarra.add(tamanio);
        
        panelmenu.add(mibarra);
        add(panelmenu, BorderLayout.NORTH);
        
        miarea = new JTextPane();
        add(miarea, BorderLayout.CENTER);
        
    }
    
    public void configura_menu(String rotulo, String menu, String tipo_letra, int estilos, int tam) {
        JMenuItem elem_menu = new JMenuItem(rotulo);
        if (null != menu) switch (menu) {
            case "fuente" -> fuente.add(elem_menu);
            case "estilo" -> estilo.add(elem_menu);
            case "tamanio" -> tamanio.add(elem_menu);
            default -> {
            }
        }
        elem_menu.addActionListener(new Gestiona_Eventos(rotulo, tipo_letra, estilos, tam));
    }
    
    private class Gestiona_Eventos implements ActionListener {
        
        String tipo_texto, menu;
        int estilo_letra, tamanio_letra;
        
        Gestiona_Eventos(String elemento, String texto2, int estilo2, int tam_letra){
            tipo_texto = texto2;
            estilo_letra = estilo2;
            tamanio_letra = tam_letra;
            menu = elemento;
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            
            letras = miarea.getFont();
            if(null != menu) switch (menu) {
                case "Arial", "Courier", "Verdana" -> {
                    estilo_letra = letras.getStyle();
                    tamanio_letra = letras.getSize();
                }
                case "Cursiva", "Negrita" -> {
                    if(letras.getStyle() == 1 || letras.getStyle() == 2) {
                        estilo_letra = 3;
                    }   tipo_texto = letras.getFontName();
                    tamanio_letra = letras.getSize();
                }
                case "12", "16", "20", "24" -> {
                    estilo_letra = letras.getStyle();
                    tipo_texto = letras.getFontName();
                }
                default -> {
                }
            }
            
            miarea.setFont(new Font(tipo_texto, estilo_letra, tamanio_letra));
            
            System.out.println("Tipo: " + tipo_texto + " Estado: " + estilo_letra + " Tamaño: " + tamanio_letra);
            
            
        }
    }
    
    JTextPane miarea;
    JMenu fuente, estilo, tamanio;
    Font letras;
}



