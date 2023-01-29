
package DisposicionesAvanzadas;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Ervin Caravali Ibarra 1925648
 */
public class LibreDisposicion {
    public static void main(String[] args) {
        FrameLibre frame = new FrameLibre();
    }
}

class FrameLibre extends JFrame {
    public FrameLibre() {
        add(new PanelLibre());
        setSize(600, 400);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}

class PanelLibre extends JPanel {
    public PanelLibre() {
        
        setLayout( new EnColumnas());
        JLabel nombre = new JLabel("Nombre: ");
        JLabel apellido = new JLabel("Apellido: ");
        JLabel edad = new JLabel("Edad: ");
        JLabel telefono = new JLabel("Telefono: ");
        
        JTextField cnombre = new JTextField(10);
        JTextField capellido = new JTextField(10);
        JTextField cedad = new JTextField(10);
        JTextField ctelefono = new JTextField();
        
        
        add(nombre);
        add(cnombre);
        
        add(apellido);
        add(capellido);
        
        add(edad);
        add(cedad);
        
        add(telefono);
        add(ctelefono);
    }
}

class EnColumnas implements LayoutManager {
   private int b;
    private int o = 20;
    @Override
    public void addLayoutComponent(String name, Component comp) {
    }

    @Override
    public void removeLayoutComponent(Component contenedor) {
    }

    @Override
    public Dimension preferredLayoutSize(Container contenedor) {
        
        return null;
        
    }

    @Override
    public Dimension minimumLayoutSize(Container contenedor) {
        return null;
    }

    @Override
    public void layoutContainer(Container contenedor) {
        
        int d = contenedor.getWidth();
        
        b = d/2;
        
        int contador = 0;
        
        int n = contenedor.getComponentCount();
        
        for(int i = 0; i < n; i++) {
            
            contador++;
            Component c = contenedor.getComponent(i);
            c.setBounds(b-100, o, 100, 20);
            
            b+=100;
            
            if(contador%2 == 0) {
                
                b = d/2;
                o += 40;
                 
            }
        }
        
    }
    
   
    
}

