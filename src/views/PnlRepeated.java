/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Dell
 */
public class PnlRepeated extends JPanel{

    private Graphics graphics;
    public PnlRepeated() {
        this.setBackground(Color.BLUE);
    }
        
      public void draw( int number){
          if (number!=0) {
              
        graphics.setColor(Color.GRAY);
        graphics.fillRect((this.getHeight()+this.getX())/2-50, (this.getHeight()+this.getY())/2-75, 75 , 120);
        for (int i = 0; i < number; i++) {
            graphics.fillRect((this.getHeight()+this.getX())/2-50,(this.getHeight()+this.getY())/2+75+i, 75, 2);
        }
          }
    }
}
