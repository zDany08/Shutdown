package net.zdany.shutdown.graphics;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.border.LineBorder;

import net.zdany.shutdown.events.ButtonHover;

public class Button extends JButton {
	private static final long serialVersionUID = 1L;
	private String text;
	
	public Button(String text) {
		ButtonHover bh = new ButtonHover();
		setText(text);
		setSize(265, 50);
		setFont(new Font("Arial",Font.BOLD, 16));
		setBorder(new LineBorder(new Color(255, 255, 255), 3));
		setBackground(new Color(34, 92, 102));
		setForeground(new Color(255, 255, 255));
		setFocusable(false);
		addMouseListener(bh);
	}
	
	public String getText() { return text; }
	
	public void setText(String text) { this.text = text; }
	
	public void setLoc(int x, int y) { setLocation(x, y); }
}
