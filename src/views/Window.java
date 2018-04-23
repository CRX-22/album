/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Dell
 */
public class Window extends JFrame{
    public PnlGroupPack pnlGroupPack;
    public PnlAlbum pnlAlbum;
    public PnlRepeated pnlRepeated;
    public PnlChangedSticker pnlChangedSticker;
    public DlgInit dlgInit;
    public JButton btnStart;
    public JPanel jPanel;
    public JPanel tittle;
    public JLabel jLabel;
    public JPanel pnlsim;

    public Window(ActionListener listener) {
        super("ALBUM SIMULATOR");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setExtendedState(MAXIMIZED_BOTH);
       	this.setIconImage(new ImageIcon(getClass().getResource("/IMG/album.png")).getImage());
        pnlGroupPack = new PnlGroupPack();
        pnlAlbum = new PnlAlbum();
        pnlRepeated =new PnlRepeated();
        dlgInit = new DlgInit(listener);
        btnStart = new JButton("comenzar");
        pnlChangedSticker = new PnlChangedSticker();
        jPanel = new JPanel();
        tittle = new JPanel();
        jLabel = new JLabel("simulador de album");
        pnlsim = new JPanel();
        btnStart.addActionListener(listener);
        btnStart.setActionCommand("START");
        init();
    }

    private void init() {
        tittle.setLayout(new FlowLayout());
        tittle.add(jLabel);
        tittle.add(btnStart);
        this.setLayout(new BorderLayout());
        pnlsim.setLayout(new GridLayout(1, 3));
        this.jPanel.setLayout(new BoxLayout(this.jPanel, BoxLayout.Y_AXIS));
        this.jPanel.add(pnlChangedSticker);
        this.jPanel.add(pnlRepeated);
        this.pnlsim.add(pnlGroupPack);
        this.pnlsim.add(pnlAlbum);
        this.pnlsim.add(jPanel);
        this.add(tittle,BorderLayout.NORTH);
        this.add(pnlsim, BorderLayout.CENTER);
        this.setVisible(true);

    }
    
    
    
}
