package net.max.jupitor;

import javax.swing.JFrame;

public class Jupitor {
	
	//GameWindow variable
	public static JFrame window = new JFrame();
	
	//Main method
	public static void main(String[] args)
	{
		//Generate the window.
		window.setVisible(true);
		window.setSize(1080, 720);
		window.setTitle("Jupitor Engine");
		window.setLocationRelativeTo(null);
	}
	
}
