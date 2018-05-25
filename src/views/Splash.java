package views;

import javax.swing.*;

import java.awt.*;
/**
 * crea el splash del programa
 * @author Juan Camilo Rodriguez Torres
 *
 */
public class Splash extends JWindow{

	public static final int DURATION = 1000;
	
	JPanel panel;
	/**
	 * importa una imagen y crea un hilo para cerrar el splash
	 */
	public Splash(){
		panel = (JPanel) getContentPane();
		
		ImageIcon img = new ImageIcon(getClass().getResource("/IMG/Splash.jpg"));
		panel.add(new JLabel (img), BorderLayout.CENTER);
		setSize(img.getIconWidth(), img.getIconHeight());
		setLocationRelativeTo(null);
		setVisible(true);
		
		try {
			Thread.sleep(DURATION);
		} catch (Exception e) {
			e.printStackTrace();
		}
		setVisible(false);
	}
	
}
