package Eventos;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;



/**
 *
 * @author Ervin Caravali Ibarra
 */
public class EventosTeclado {
    public static void main(String[] args) {
        VentanaTeclado Ventana = new VentanaTeclado();
    }
}

class Teclas extends KeyAdapter {
    public void keyPressed(KeyEvent e){
          int codigo = e.getKeyCode();
          char letra = e.getKeyChar();

          System.out.println("Tecla: " + letra + " | " + "Codigo de  la tecla: " + codigo);

    }
}

class VentanaTeclado extends JFrame{

    public VentanaTeclado(){
        setTitle("Eventos del teclado");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        addKeyListener(new Teclas()); 
        this.getContentPane().setBackground(Color.orange);
    }
}


