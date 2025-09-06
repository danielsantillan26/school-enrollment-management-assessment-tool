package graphics;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Frame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Frame() {
		setTitle("Management Assessment Tool");
		Dimension x  = Toolkit.getDefaultToolkit().getScreenSize();
		int width = x.width;
		int height = x.height;
		setSize(width, height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(true);
		setFocusable(true);
		
		ImageIcon icon = new ImageIcon(getClass().getResource("/res/diocesancoa.png"));
		setIconImage(icon.getImage());
		
		CardLayout cl = new CardLayout();
		Container container = getContentPane();
		container.setLayout(cl);
		prepareCardLayout();
	}
	
	
	private void prepareCardLayout() {
		
	}
	
}
