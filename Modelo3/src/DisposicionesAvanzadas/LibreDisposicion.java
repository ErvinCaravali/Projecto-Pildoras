
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
        
        JTextField c_nombre = new JTextField(10);
        JTextField c_apellido = new JTextField(10);
        JTextField c_edad = new JTextField(10);
        JTextField c_telefono = new JTextField();
        
        /*
        nombre.setBounds(20, 20, 80, 10);
        
        c_nombre.setBounds(100, 17, 100, 20);
        
        apellido.setBounds(20, 60, 80, 15);
        
        c_apellido.setBounds(100, 55, 100, 20);   
        */
        
        add(nombre);
        add(c_nombre);
        
        add(apellido);
        add(c_apellido);
        
        add(edad);
        add(c_edad);
        
        add(telefono);
        add(c_telefono);
    }
}

class EnColumnas implements LayoutManager {

    @Override
    public void addLayoutComponent(String name, Component comp) {
    }

    @Override
    public void removeLayoutComponent(Component contenedor) {
    }

    @Override
    public Dimension preferredLayoutSize(Container contenedor) {
        
    }

    @Override
    public Dimension minimumLayoutSize(Container contenedor) {
        return null;
    }

    @Override
    public void layoutContainer(Container contenedor) {
        
        int d = contenedor.getWidth();
        
        x = d/2;
        
        int contador = 0;
        
        int n = contenedor.getComponentCount();
        
        for(int i = 0; i < n; i++) {
            
            contador++;
            Component c = contenedor.getComponent(i);
            c.setBounds(x-100, y, 100, 20);
            
            x+=100;
            
            if(contador%2 == 0) {
                
                x = d/2;
                y += 40;
                 
            }
        }
        
    }
    
    private int x;
    private int y = 20;
    
}

