/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import models.Sticker;

/**
 *
 * @author Dell
 */
public class PnlSticker extends JPanel{
    private Sticker sticker;
    public JLabel lbNumber;
    private Color color;

    public PnlSticker(Sticker sticker) {
        this.sticker = sticker;
        this.lbNumber = new JLabel(String.valueOf(sticker.getNumber()));
        this.setBackground(Color.gray);
        this.add(lbNumber);
    }

    public Sticker getSticker() {
        return sticker;
    }

    public void setSticker(Sticker sticker) {
        this.sticker = sticker;
    }

    
   
    
}
