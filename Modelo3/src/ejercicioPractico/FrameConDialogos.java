
package ejercicioPractico;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.util.Date;

/**
 *
 * @author Ervin Caravali Ibarra 1925648
 */



public class FrameConDialogos extends JFrame {
    
    public FrameConDialogos() {
        
        JPanel panelCuadricula = new JPanel();
        
        panelCuadricula.setLayout(new GridLayout(2,3));
        
        String primero[] = {"Mensaje", "Confirmar", "Opcion", "Entrada"};
        
        panelTipo = new PanelDeBotones("Tipo", primero);
        
        panelTipoMensajes = new PanelDeBotones("Tipo de Mensaje", new String [] {
           "ERROR_MESSAGE",
            "INFORMATION_MESSAGE",
            "WARNING_MESSAGE",
            "QUESTION_MESSAGE",
            "PLAIN_MESSAGE"
        });
        
        panelMensaje = new PanelDeBotones("Mensaje", new String [] {
           "Cadena",
           "Icono",
           "Componente",
           "Otros",
           "Object[]"
            
        });
        
        panelTipoOpcion = new PanelDeBotones("Confirmar", new String[] {
           "DEFAULT_OPTION",
            "YES_NO_OPTION",
            "YES_NO_CANCEL_OPTION",
            "OK_CANCEL_OPTION"
        });
        
        panelOpciones = new PanelDeBotones("Opcion", new String[] {
           "String[]",
            "Icon[]",
            "Object[]"
        });
        
        panelEntrada = new PanelDeBotones("Entrada", new String[] {
            "Campo de Texto",
            "Combo"
        });
        
        setLayout(new BorderLayout());
        
        panelCuadricula.add(panelTipo);
        
        panelCuadricula.add(panelTipoMensajes);
        
        panelCuadricula.add(panelMensaje);
        
        panelCuadricula.add(panelTipoOpcion);
        
        panelCuadricula.add(panelOpciones);
        
        panelCuadricula.add(panelEntrada);
        
        //Se construyo el panel inferior
        
        JPanel panelMostrar = new JPanel();
        
        JButton botonMostrar = new JButton("Mostrar");
        
        botonMostrar.addActionListener(new AccionMostrar());
        
        panelMostrar.add(botonMostrar);
        
        add(panelMostrar, BorderLayout.SOUTH);
        
        add(panelCuadricula, BorderLayout.CENTER);
        
        
        
        setTitle("Prueba de Dialogos");
        
        setSize(600, 450);
        
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
        
    }
    
    //----------------------Proporciona Mensaje---------------------------------//
    
    public Object dameMensaje() {
        String s = panelMensaje.dameSeleccion();
        if(s.equals("Cadena")) {
            return cadenaMensaje;
        } else if (s.equals("Icono")) {
            return iconoMensaje;
        } else if (s.equals("Componente")) {
            return componenteMensaje;
        } else if(s.equals("Otros")) {
            return objetoMensaje;
        } else if (s.equals("Object[]")) {
            return new Object[] {cadenaMensaje, iconoMensaje, componenteMensaje, objetoMensaje};
        } else {
            return null;
        }
    }
    
    //---------------------------DEVUELVE TIPO Y TAMBIEN # DE BOTONES EN CONFIRMAR----------------------------------------------//
    
    public int dameTipo(PanelDeBotones panel) {
        
        String s = panelTipoMensajes.dameSeleccion();
        if(s.equals("ERROR_MESSAGE") || s.equals("YES_NO_OPTION")) {
            return 0;
        } else if(s.equals("INFORMATION_MESSAGE") || s.equals("YES_NO_CANCEL_OPTION")) {
            return 1;
        } else if(s.equals("WARNING_MESSAGE") || s.equals("OK_CANCEL_OPTION")) {
            return 2;
        } else if (s.equals("QUESTION_MESSAGE")) {
            return 3;
        } else if(s.equals("PLAIN_MESSAGE") || s.equals("DEFAULT_OPTION")) {
            return -1;
        } else {
            return 0;
        }
    }
        
        
        //-----------------------------------DA OPCIONES A PANEL OPCION---------------------------------------//
        
        public Object[] dameOpciones(PanelDeBotones panel) {
            String s = panel.dameSeleccion();
            if(s.equals("String[]")) {
                
                return new String [] {"Amarillo", "Azul", "Rojo"};
                
            } else if(s.equals("Icon[]")) {
                
                return new Object[]{ new ImageIcon("src/barra_herramientas/bolaAzul.png"), new ImageIcon("src/barra_herramientas/bolaAmarilla.png"), new ImageIcon("src/barra_herramientas/bolaRoja.png")};
                
            } else if(s.equals("Object[]")) {
                
                return new Object[] {cadenaMensaje, iconoMensaje, componenteMensaje, objetoMensaje};
                
            } else {
                return null;
            }
        }
    
        
        //--------------------------------------------------------------------------//
    
    
    //--------------------------------------------------------------------------//
    
    private class AccionMostrar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //System.out.println(panelTipo.dameSeleccion());
            
            if(panelTipo.dameSeleccion().equals("Mensaje")) {
                JOptionPane.showMessageDialog(FrameConDialogos.this, dameMensaje(), "Título", dameTipo(panelTipoMensajes));
                
            } else if(panelTipo.dameSeleccion().equals("Confirmar")) {
                
                JOptionPane.showConfirmDialog(FrameConDialogos.this, dameMensaje(), "Titulo", dameTipo(panelTipoOpcion), dameTipo(panelTipoMensajes));
                
            } else if (panelTipo.dameSeleccion().equals("Entrada")) {
                
                if(panelEntrada.dameSeleccion().equals("Campo de Texto")) {
                    
                    JOptionPane.showInputDialog(FrameConDialogos.this, dameMensaje(), "Titulo", dameTipo(panelTipoMensajes));
                    
                } else {
                    JOptionPane.showInputDialog(FrameConDialogos.this, dameMensaje(), "Titulo", dameTipo(panelTipoMensajes), null, new String[] {"Amarillo", "Azul", "Rojo"}, "Azul");
                }
                
            } else if (panelTipo.dameSeleccion().equals("Opcion")) {
                
                JOptionPane.showOptionDialog(FrameConDialogos.this, dameMensaje(), "Titulo", 1, dameTipo(panelOpciones), null, dameOpciones(panelOpciones), null);
                
            }
        }
    
    
}

class Panel_Ejemplo extends JPanel {
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D rectangulo = new Rectangle2D.Double(0, 0, getWidth(), getHeight());
        g2.setPaint(Color.yellow);
        g2.fill(rectangulo);
        
        }
    }

    private PanelDeBotones panelTipo, panelTipoMensajes, panelMensaje, panelTipoOpcion, panelOpciones, panelEntrada;
    private String cadenaMensaje = "Mensaje";
    private Icon iconoMensaje = new ImageIcon("src/barra_herramientas/bolaAzul.png");
    private Object objetoMensaje = new Date();
    private Component componenteMensaje = new Panel_Ejemplo();

}

