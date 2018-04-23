/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**s
 *
 * @author Dell
 */
public class DlgInit extends JDialog{
    public JLabel lb;
    public JTextField jTextField;
    public JButton btnAcept;

    public DlgInit(ActionListener listener) {
        this.setSize(200, 150);
       	this.setIconImage(new ImageIcon(getClass().getResource("/IMG/album.png")).getImage());
        this.getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        this.setBackground(Color.yellow);
        this.lb = new JLabel("cuantos sobres desea simular");
        this.jTextField = new JTextField();
        this.btnAcept = new JButton("aceptar");
        this.btnAcept.setBackground(Color.red);
        btnAcept.addActionListener(listener);
        btnAcept.setActionCommand("ACCEPT");
        this.getContentPane().add(lb);
        this.getContentPane().add(jTextField);
        this.getContentPane().add(btnAcept);
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    }
    
    
}
