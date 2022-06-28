package net.zdany.shutdown.graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Display extends JFrame {
	private static final long serialVersionUID = 1L;
	private ImageIcon icon;
	private Panel panel;
	
	public Display() {
		icon = new ImageIcon("src/icon.png");;
		panel = new Panel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Windows Shutdown");
		setIconImage(icon.getImage());
		setSize(300, 170);
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(false);
		setEnabled(true);
		setVisible(true);
		add(panel);
	}
}
