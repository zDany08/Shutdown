package net.zdany.shutdown.events;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ButtonHover extends MouseAdapter {
	
	@Override
	public void mouseEntered(MouseEvent e) {
		e.getComponent().setBackground(new Color(32, 110, 128));
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		e.getComponent().setBackground(new Color(34, 92, 102));
	}
}
