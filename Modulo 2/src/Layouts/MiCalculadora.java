package Layouts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author Ervin Caravali Ibarra
 */
class CalculadoraVentana extends JFrame {
    public CalculadoraVentana() {
        add(new PanelSuperior());
        setTitle("Mi Calculadora");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
    }
}

public class MiCalculadora {
    public static void main(String[] args) {
        CalculadoraVentana calculadora = new CalculadoraVentana();
    }
}

class PanelSuperior extends JPanel {

    private JPanel Inferior = new JPanel();
    private JButton pantallas = new JButton("0");
    private boolean principio;
    private double resultado;
    private String ultimaOperacion;

    public PanelSuperior(){
        principio = true;
        ActionListener insertar = new InsertaNumero();
        ActionListener orden = new AccionOperador();

        setLayout(new BorderLayout());
        pantallas.setEnabled(false);
        add(pantallas, BorderLayout.NORTH);
        Inferior.setLayout(new GridLayout(4,4));
        ponerBoton("7", insertar);
        ponerBoton("8", insertar);
        ponerBoton("9", insertar);
        ponerBoton("/", orden);
        ponerBoton("4", insertar);
        ponerBoton("5", insertar);
        ponerBoton("6", insertar);
        ponerBoton("*", orden);
        ponerBoton("1", insertar);
        ponerBoton("2", insertar);
        ponerBoton("3", insertar);
        ponerBoton("-", orden);

        ponerBoton("0", insertar);
        ponerBoton(".", insertar);
        ponerBoton("=", orden);
        ponerBoton("+", orden);

        add(Inferior, BorderLayout.CENTER);

        ultimaOperacion = "=";


    }

    private class InsertaNumero implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String entrada = e.getActionCommand();
            if(principio){
                pantallas.setText("");
                principio = false;
            }
            pantallas.setText(pantallas.getText() + entrada);
        }
    }

    private void ponerBoton(String rotulo, ActionListener oyente){
        JButton boton = new JButton(rotulo);
        boton.addActionListener(oyente);
        Inferior.add(boton);
    }

    private class AccionOperador implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String operacion = e.getActionCommand();
            calcular(Double.parseDouble(pantallas.getText()));
            ultimaOperacion = operacion;
            principio = true;

        }

        public void calcular(double x){
            if(ultimaOperacion.equals("+")){
                resultado+=x;
                System.out.println(resultado);
            }else if(ultimaOperacion.equals("-")){
                resultado-=x;
            }else if(ultimaOperacion.equals("*")){
                resultado*=x;
            }else if(ultimaOperacion.equals("/")){
                resultado/=x;
            }
            else if(ultimaOperacion.equals("=")){
                resultado = x;
            }
            pantallas.setText("" + resultado);
        }
    }
}

