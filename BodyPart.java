package testBox;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;


public class BodyPart {

	private int xCoor, yCoor, width, height;
	
	public BodyPart(int xCoor, int yCoor, int tileSize) {
		{
	}
		
		this.xCoor = xCoor;
		this.yCoor = yCoor;
		width = tileSize;
		height = tileSize;
		
	}
	
	public void tick() {
		
	}
	public void draw(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(xCoor * width, yCoor * height, width, height);
	}

	public int getxCoor() {
		return xCoor;
	}

	public void setxCoor(int xCoor) {
		this.xCoor = xCoor;
	}

	public int getyCoor() {
		return yCoor;
	}

	public void setyCoor(int yCoor) {
		this.yCoor = yCoor;
	}
	
}
