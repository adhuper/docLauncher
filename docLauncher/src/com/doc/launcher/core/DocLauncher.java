package com.doc.launcher.core;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class DocLauncher {

	public static void main(String args[]) {
		if(Desktop.isDesktopSupported()) {
			try {
				Desktop.getDesktop().open(new File("c:\\MSDE\\Template.docx"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
