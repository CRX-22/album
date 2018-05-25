/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Dell
 */
public class PnlGroupPack extends JPanel{

    private JLabel jLabel;
    private  Graphics graphics;
    public PnlGroupPack() {
        this.setBackground(Color.MAGENTA);
        ImageIcon img = new ImageIcon(getClass().getResource("/IMG/sobre.png"));
        jLabel = new JLabel(img);
        this.add(jLabel, BorderLayout.SOUTH);
    }

    
    
    
}
