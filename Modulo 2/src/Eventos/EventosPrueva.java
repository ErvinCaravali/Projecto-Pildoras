package Eventos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




/**
 *
 * @author Ervin Caravali Ibarra 1925648
 */



public class EventosPrueva {
    public static void main(String[] args) {
        Botones mYMarco = new Botones();
    }
}

class Botones extends JFrame{
    public Botones(){
        setVisible(true);
        setTitle("Mi Button");
        setSize(650, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Panel panelBoton = new Panel();
        add(panelBoton);
    }
}

class Panel extends JPanel implements ActionListener {
  JButton botonAmarillo = new JButton("Amarillo");
    JButton botonRojo = new JButton("Rojo");
    JButton botonAzul = new JButton("Azul");
    

    public Panel() {
        
        add(botonAzul);
        add(botonAmarillo);
        add(botonRojo);
        
        ColorFondo Amarillo = new ColorFondo(Color.yellow);
        ColorFondo Azul = new ColorFondo(Color.blue);
        ColorFondo Rojo = new ColorFondo(Color.red);
        
        botonAzul.addActionListener(Azul);
        botonAmarillo.addActionListener(Amarillo);
        botonRojo.addActionListener(Rojo);

    }
    
  
       private class ColorFondo implements ActionListener {
        private Color Fondo;
        public ColorFondo(Color P) {
            
            Fondo = P;
            
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            setBackground(Fondo);
        }
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object botonPulsado = e.getSource();

        if(botonPulsado == botonAzul){
            setBackground(Color.blue);
        }
        if(botonPulsado == botonAmarillo){
            setBackground(Color.yellow);
        }
        if(botonPulsado == botonRojo){
            setBackground(Color.red);
        }
    }
    
   
}
