package com.doc.launcher.core;

import java.awt.Desktop;
import java.io.File;

import javax.swing.JOptionPane;

public class DocLauncher {

	public static void main(String args[]) {
		if(Desktop.isDesktopSupported()) {
			try {
				Desktop.getDesktop().open(new File(args[0]));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Error in opening file", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
