
package ejercicioPractico;

import javax.swing.*;

/**
 *
 * @author Ervin Caravali Ibarra
 */
public class PanelDeBotones extends JPanel {
    
    public PanelDeBotones(String titulo, String [] opciones) {
        
        setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titulo));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        grupo = new ButtonGroup();
        
        for(int i = 0; i < opciones.length; i++) {
            
            
            JRadioButton bot = new JRadioButton(opciones[i]);
            bot.setActionCommand(opciones[i]);
            add(bot);
            grupo.add(bot);
            bot.setSelected(i==0);
            
            
        }
    }
    
    public String dameSeleccion() {
        /*
        ButtonModel boton = grupo.getSelection();
        String s = boton.getActionCommand();
        
        return s;
        */
        
        return grupo.getSelection().getActionCommand();
    }
    
    private ButtonGroup grupo;
}
