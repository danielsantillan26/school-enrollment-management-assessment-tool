package graphics;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Frame extends JFrame {

	public Frame() {
		setTitle("Management Assessment Tool");
		setSize(1000, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		
		ImageIcon icon = new ImageIcon(getClass().getResource("/res/diocesancoa.png"));
		setIconImage(icon.getImage());
	}
	
}
