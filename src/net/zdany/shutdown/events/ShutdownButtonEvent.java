package net.zdany.shutdown.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ShutdownButtonEvent implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			Runtime.getRuntime().exec("shutdown -s -t 1");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
