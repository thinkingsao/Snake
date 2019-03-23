package testBox;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;

public class Main {
	public Main() {
		
		JFrame frame = new JFrame();
		box box = new box();
		
		
		frame.add(box);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("SNAKECODING");
		
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
	}
	public static void main(String[] args) {
		
		new Main();
	}
	
}


