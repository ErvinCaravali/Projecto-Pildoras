
package texts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.*;

/**
 *
 * @author Ervin Caravali Ibarra
 */
public class ProcesadorIIStiloEditor {
    public static void main(String[] args) {
        MenuProcesador_II menu = new MenuProcesador_II();
    }
}

class MenuProcesador_II extends JFrame{
    
    public MenuProcesador_II(){
        PanelProcesador_II mipanel = new PanelProcesador_II();
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
        configura_menu("Times New Roman", "fuente", "Times New Roman", 9, 10);
        configura_menu("Verdana", "fuente", "Verdana", 9, 10);
        
        
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
        if (menu == "fuente") {
            fuente.add(elem_menu);
            if(tipo_letra == "Arial") {
                elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Arial"));
            } else if (tipo_letra == "Times New Roman") {
                elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Times New Roman"));
                
            } else if (tipo_letra == "Verdana") {
                elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Verdana"));
            }
        } else if (menu == "estilo") {
            estilo.add(elem_menu);
            if(estilos == Font.BOLD) {
                elem_menu.addActionListener(new StyledEditorKit.BoldAction());
            } else if (estilos == Font.ITALIC) {
                elem_menu.addActionListener(new StyledEditorKit.ItalicAction());
            }
            
        } else if (menu == "tamanio") {
            tamanio.add(elem_menu);
            elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", tam));
        }

    }
    
    
    JTextPane miarea;
    JMenu fuente, estilo, tamanio;
    Font letras;
}
