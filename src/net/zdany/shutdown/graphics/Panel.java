package net.zdany.shutdown.graphics;

import java.awt.Color;

import javax.swing.JPanel;

import net.zdany.shutdown.events.RestartButtonEvent;
import net.zdany.shutdown.events.ShutdownButtonEvent;

public class Panel extends JPanel {
	private static final long serialVersionUID = 1L;
	private ShutdownButtonEvent sbe;
	private RestartButtonEvent rbe;
	private Button shutdownButton;
	private Button restartButton;
	
	public Panel() {
		setLayout(null);
		setSize(300, 300);
		setLocation(0, 0);
		setBackground(new Color(50, 168, 194));
		setEnabled(true);
		setVisible(true);
		sbe = new ShutdownButtonEvent();
		rbe = new RestartButtonEvent();
		shutdownButton = new Button("Shutdown");
		shutdownButton.setLoc(10, 10);
		shutdownButton.addActionListener(sbe);
		restartButton = new Button("Restart");
		restartButton.setLoc(10, 70);
		restartButton.addActionListener(rbe);
		add(shutdownButton);
		add(restartButton);
	}
}
