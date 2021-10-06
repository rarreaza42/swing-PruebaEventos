
import java.awt.MouseInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno_dam
 */
public class MiActionListener implements ActionListener{

    private PruebaEventos pruebaEventos;
    public MiActionListener(PruebaEventos pruebaEventos) {
        this.pruebaEventos = pruebaEventos;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        JButton jButton = (JButton) ae.getSource();
        String nombre = jButton.getText();
        pruebaEventos.setJLabel1("Has pulsado el " + nombre);
    }
    
}
