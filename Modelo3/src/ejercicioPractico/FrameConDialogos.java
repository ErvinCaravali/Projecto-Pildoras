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
        panelCuadricula.setLayout(new GridLayout(2, 3));
        String primero[] = {"Mensaje", "Confirmar", "Opcion", "Entrada"};
        panelTipo = new PanelDeBotones("Tipo", primero);

        panelTipoMensajes = new PanelDeBotones("Tipo de Mensaje", new String[]{
            "ERROR_MESSAGE",
            "INFORMATION_MESSAGE",
            "WARNING_MESSAGE",
            "QUESTION_MESSAGE",
            "PLAIN_MESSAGE"
        });

        panelMensaje = new PanelDeBotones("Mensaje", new String[]{
            "Cadena",
            "Icono",
            "Componente",
            "Otros",
            "Object[]"

        });

        panelTipoOpcion = new PanelDeBotones("Confirmar", new String[]{
            "DEFAULT_OPTION",
            "YES_NO_OPTION",
            "YES_NO_CANCEL_OPTION",
            "OK_CANCEL_OPTION"
        });

        panelOpciones = new PanelDeBotones("Opcion", new String[]{
            "String[]",
            "Icon[]",
            "Object[]"
        });

        panelEntrada = new PanelDeBotones("Entrada", new String[]{
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

    public Object dameMensaje() {
        String s = panelMensaje.dameSeleccion();
        return switch (s) {
            case "Cadena" ->
                cadenaMensaje;
            case "Icono" ->
                iconoMensaje;
            case "Componente" ->
                componenteMensaje;
            case "Otros" ->
                objetoMensaje;
            case "Object[]" ->
                new Object[]{cadenaMensaje, iconoMensaje, componenteMensaje, objetoMensaje};
            default ->
                null;
        };
    }

    public int dameTipo(PanelDeBotones panel) {

        String si = panelTipoMensajes.dameSeleccion();
        return switch (si) {
            case "ERROR_MESSAGE", "YES_NO_OPTION" ->
                0;
            case "INFORMATION_MESSAGE", "YES_NO_CANCEL_OPTION" ->
                1;
            case "WARNING_MESSAGE", "OK_CANCEL_OPTION" ->
                2;
            case "QUESTION_MESSAGE" ->
                3;
            case "PLAIN_MESSAGE", "DEFAULT_OPTION" ->
                -1;
            default ->
                0;
        };
    }

    public Object[] dameOpciones(PanelDeBotones panel) {
        String so = panel.dameSeleccion();
        return switch (so) {
            case "String[]" ->
                new String[]{"Amarillo", "Azul", "Rojo"};
            case "Icon[]" ->
                new Object[]{new ImageIcon("src/barra_herramientas/bolaAzul.png"), new ImageIcon("src/barra_herramientas/bolaAmarilla.png"), new ImageIcon("src/barra_herramientas/bolaRoja.png")};
            case "Object[]" ->
                new Object[]{cadenaMensaje, iconoMensaje, componenteMensaje, objetoMensaje};
            default ->
                null;
        };
    }

    private class AccionMostrar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            switch (panelTipo.dameSeleccion()) {
                case "Mensaje" ->
                    JOptionPane.showMessageDialog(FrameConDialogos.this, dameMensaje(), "Título", dameTipo(panelTipoMensajes));
                case "Confirmar" ->
                    JOptionPane.showConfirmDialog(FrameConDialogos.this, dameMensaje(), "Titulo", dameTipo(panelTipoOpcion), dameTipo(panelTipoMensajes));
                case "Entrada" -> {
                    if (panelEntrada.dameSeleccion().equals("Campo de Texto")) {

                        JOptionPane.showInputDialog(FrameConDialogos.this, dameMensaje(), "Titulo", dameTipo(panelTipoMensajes));

                    } else {
                        JOptionPane.showInputDialog(FrameConDialogos.this, dameMensaje(), "Titulo", dameTipo(panelTipoMensajes), null, new String[]{"Amarillo", "Azul", "Rojo"}, "Azul");
                    }
                }
                case "Opcion" ->
                    JOptionPane.showOptionDialog(FrameConDialogos.this, dameMensaje(), "Titulo", 1, dameTipo(panelOpciones), null, dameOpciones(panelOpciones), null);
                default -> {
                }
            }
        }

    }

    class Panel_Ejemplo extends JPanel {

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            Rectangle2D rectangulo = new Rectangle2D.Double(0, 0, getWidth(), getHeight());
            g2.setPaint(Color.yellow);
            g2.fill(rectangulo);

        }
    }
    private final PanelDeBotones panelTipo;
    private final PanelDeBotones panelTipoMensajes;
    private final PanelDeBotones panelMensaje;

    private PanelDeBotones panelTipoOpcion, panelOpciones, panelEntrada;
    private final String cadenaMensaje = "Mensaje";
    private final Icon iconoMensaje = new ImageIcon("src/barra_herramientas/bolaAzul.png");
    private final Object objetoMensaje = new Date();
    private final Component componenteMensaje = new Panel_Ejemplo();

}
