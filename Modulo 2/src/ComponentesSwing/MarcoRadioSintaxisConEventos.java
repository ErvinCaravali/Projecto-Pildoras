/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComponentesSwing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author ervin
 */
public class MarcoRadioSintaxisConEventos extends JFrame {

    public MarcoRadioSintaxisConEventos() {
        setBounds(550, 300, 550, 300);
        setVisible(true);
        Radio_Lamina miLamina = new Radio_Lamina();
        add(miLamina);
    }

    public static void main(String[] args) {
        MarcoRadioSintaxisConEventos sin = new MarcoRadioSintaxisConEventos();
    }

   

    private class Radio_Lamina extends JPanel {

        private JLabel texto;
        private JRadioButton boton1, boton2, boton3, boton4;

        public Radio_Lamina() {

            setLayout(new BorderLayout());
            texto = new JLabel("En un Lugar muy lejano......");

            add(texto, BorderLayout.CENTER);

            ButtonGroup miGrupo1 = new ButtonGroup();
            boton1 = new JRadioButton("Pequeño", false);
            boton2 = new JRadioButton("Mediano", true);
            boton3 = new JRadioButton("Grande", false);
            boton4 = new JRadioButton("Muy Grande", false);
            
            JPanel LaminaRdio = new JPanel();
            
            miGrupo1.add(boton1);
            miGrupo1.add(boton2);
            miGrupo1.add(boton3);
            miGrupo1.add(boton4);
            
            LaminaRdio.add(boton1);
            LaminaRdio.add(boton2);
            LaminaRdio.add(boton3);
            LaminaRdio.add(boton4);
            
            add(LaminaRdio,BorderLayout.SOUTH);
            
            boton1.addActionListener(new Evento_Radio());
            boton2.addActionListener(new Evento_Radio());
            boton3.addActionListener(new Evento_Radio());
            boton4.addActionListener(new Evento_Radio());
            }
        private class Evento_Radio implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==(boton1)) {
                  texto.setFont(new Font("Serif",Font.PLAIN,10));
                }
                else if (e.getSource()==(boton2)) {
                  texto.setFont(new Font("Serif",Font.PLAIN,18));
                }
               else  if (e.getSource()==(boton3)) {
                  texto.setFont(new Font("Serif",Font.PLAIN,38));
                }
               else   if (e.getSource()==(boton4)) {
                  texto.setFont(new Font("Serif",Font.PLAIN,50));
                }
            }
        
        }
    }
}
