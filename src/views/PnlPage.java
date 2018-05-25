/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import models.Page;

/**
 *
 * @author Dell
 */
public class PnlPage extends JPanel{
    private Page page;
    public PnlSticker[][] stickers;
    private static final int COLUMS = 5;
    private static final int ROWS = 2;
    private JPanel panel;
    private JLabel jLabel;

    public PnlPage(Page page) {
        this.page = page;
        stickers = new PnlSticker[ROWS][COLUMS];
        this.setBackground(new Color((int )(Math.random())*256,(int )(Math.random())*256,(int )(Math.random())*256));
        this.jLabel = new JLabel(String.valueOf(page.getNumber()));
        jLabel.setBackground(Color.lightGray);
        this.panel = new JPanel();
        this.setLayout(new BorderLayout());
        this.panel.setLayout(new GridLayout(ROWS, COLUMS,10,10));
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMS; j++) {
                for (int k = 0; k < 10; k++) {             
                stickers[i][j]= new PnlSticker(page.getStickers()[k]);   
                }
                this.panel.add(stickers[i][j]);
            }
            
        }
        this.add(jLabel, BorderLayout.NORTH);
        this.add(panel, BorderLayout.CENTER);
        init();
    }

    private void init() {
        
    }

    
    
}
