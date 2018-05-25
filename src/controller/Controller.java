/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import models.Album;
import models.Pack;
import models.Sticker;
import views.DlgInit;
import views.GroupPack;
import views.Window;

/**
 *
 * @author Dell
 */
public class Controller implements ActionListener{

    private Album album;
    private Window window;
    private GroupPack groupPack;
    public Controller() {
        album = new Album();
        window = new Window(this, album);
        this.groupPack = new GroupPack();
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getActionCommand().equals("START")) {
			window.dlgInit.setVisible(true);
		}else if(e.getActionCommand().equals("ACCEPT")){
                    int number = Integer.parseInt(window.dlgInit.jTextField.getText());
                    window.dlgInit.setVisible(false);
                    for (int i = 0; i < number; i++) {                            
                        
                        groupPack.enqueue(new Pack());
                       
           }
                     getSticker();
		}
    }
    
    public void getSticker(){
        Timer timer = new Timer(1000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
                            for (int i = 0; i < 5; i++) {
                                Sticker sticker= groupPack.dequeue().getStickers()[i];
                                for (int j = 0; j < window.pnlAlbum.ROWS; j++) {
                                    for (int k = 0; k < window.pnlAlbum.COLUMS; k++) {
                                        for (int l = 0; l < window.pnlAlbum.COLUMS; l++) {
                                            for (int m = 0; m < window.pnlAlbum.ROWS; m++) {
                                            if (window.pnlAlbum.pnlPages[j][k].stickers[l][m].getSticker().getNumber()==sticker.getNumber()) {
                                                window.pnlAlbum.pnlPages[j][k].stickers[l][m].setBackground(Color.GREEN);
                                            }
                                                
                                            }
                                        }
                                    }
                                }
                            }
                            
			}
		});
		timer.start();
    }
    
}
