package net.zdany.shutdown.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class RestartButtonEvent implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			Runtime.getRuntime().exec("shutdown -r -t 1");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
