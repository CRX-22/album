/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.Album;
import views.DlgInit;
import views.Window;

/**
 *
 * @author Dell
 */
public class Controller implements ActionListener{

    private Album album;
    private Window window;
    public Controller() {
        window = new Window(this);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getActionCommand().equals("START")) {
			window.dlgInit.setVisible(true);
		}else if(e.getActionCommand().equals("ACCEPT")){
                    int number = Integer.parseInt(window.dlgInit.jTextField.getText());
                    window.dlgInit.setVisible(false);
                    
		}
    }
    
}
