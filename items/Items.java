package items;

import java.util.Random;

import javax.swing.JPanel;

/*
 * Author: Kate Hohenstein
 * Partners: Hannah Hollenback, Kathryn Reese
 * Lab 6
 * 3/10/18
 * Item: set up item attributes and methods
 */
public class Items {
	private int x;
	private int y;
	private String imagePath;
	private int numberOfItems = 5;
	private JPanel gamePanel;
	
	
	
	public Items(int x, int y, String imagePath, int numberOfItems)
	{
		this.x = x;
		this.y = y;
		this.imagePath = imagePath;
		this.numberOfItems = numberOfItems;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setNumberOfItems(int newItemNumber)
	{
		this.numberOfItems = numberOfItems;
	}
	
	public int getnumberOfItems() {
		return numberOfItems;
	}
	
	

	
}

