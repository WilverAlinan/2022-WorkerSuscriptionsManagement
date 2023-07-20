package com.kalum.workersuscriptionsmanagement.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MiVentana extends JFrame /*ventana*/ implements WindowListener, ActionListener {
    private JButton btnSaludar = new JButton(); /*boton*/


    public MiVentana(){
        this.setTitle("Mi ventana Demo");
        this.setSize(600,400); /*tama;o*/
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.btnSaludar.setText("Da Click"); /*Texto*/
        /*this.btnSaludar.setSize(60,40); //tama;o*/
        this.btnSaludar.setBounds(10,10,120,40);
        this.btnSaludar.addActionListener(this);/* */


        this.getContentPane().add(this.btnSaludar);
        this.setLayout(null);
        this.setVisible(true);

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        JOptionPane.showMessageDialog(null,"Hasta luego, esperamos que vuelvas");

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnSaludar){
            JOptionPane.showMessageDialog(null,"Hola mundo");
        }

    }
}
