/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;

/**
 *
 * @author Dell
 */
public class PnlAlbum extends JPanel{
     public PnlPage[][] pnlPages;
     private static final int COLUMS = 2;
     private static final int ROWS = 5;

    public PnlAlbum() {
        setBackground(Color.red);
        pnlPages = new PnlPage[ROWS][COLUMS];
        this.pnlPages = new PnlPage[ROWS][COLUMS];
        this.setLayout(new GridLayout(ROWS, COLUMS,10,10));
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMS; j++) {
                pnlPages[i][j]= new PnlPage();
                this.add(pnlPages[i][j]);
            }
            
        }
    }
     
     
}
