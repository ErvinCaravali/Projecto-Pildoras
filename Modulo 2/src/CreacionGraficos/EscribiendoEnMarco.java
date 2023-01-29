package CreacionGraficos;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Ervin Caravali Ibarra
 */
public class EscribiendoEnMarco {
    public static void main(String[] args) {
        
        MarcoContexto miMarco = new MarcoContexto();
    
    }
}


class MarcoContexto extends JFrame{
    public MarcoContexto(){
        setVisible(true);
        setSize(600,450);
        setLocationRelativeTo(null);
        setTitle("Primer texto");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Lamina miLamina = new Lamina();
        add(miLamina);
    }
}

class Lamina extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("Estamos aprendiendo Swing", 100, 100);
    }
}



