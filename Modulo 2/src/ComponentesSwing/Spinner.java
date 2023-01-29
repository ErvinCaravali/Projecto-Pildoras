/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComponentesSwing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author ervin Caravali
 */
public class Spinner extends JFrame {

    public Spinner() {
        setBounds(550, 300, 550, 300);
        setVisible(true);
        LaminaSss miLamina = new LaminaSss();
        add(miLamina);

    }

    public static void main(String[] args) {
        Spinner Frame = new Spinner();
    }

    private static class LaminaSss extends JPanel {

        public LaminaSss() {
            //setLayout(new BorderLayout());
            /*
            String Lista []= {"Enero","Febero","Marzo","Abril","Mayo","Junio","Julio","Agosto"
            ,"Septiembre","Obtubre","Nobiembre","Diciembre"};
             */

            // String Lista []= GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
            //JSpinner control = new JSpinner(new SpinnerDateModel());
            //JSpinner control = new JSpinner(new SpinnerListModel(Lista));
            JSpinner control = new JSpinner(new SpinnerNumberModel(5,0,10,1){
             public Object getNextValue(){
            
            return super.getPreviousValue();
            }
            
            public Object getPreviousValue(){
            
                return super.getNextValue();
            }
        
            
            });
            Dimension d = new Dimension(200, 20);
            control.setPreferredSize(d);
            add(control);
        }
        /*
        private class MimodeloSpinner extends SpinnerNumberModel{

            public MimodeloSpinner() {
                super(5,0,10,1);
                
            }
            public Object getNextValue(){
            
            return super.getPreviousValue();
            }
            
            public Object getPreviousValue(){
            
                return super.getNextValue();
            }
        
        }
        */
    }

}
