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
	private int numberOfItems;
	private JPanel gamePanel;
	
	// Instance of random to set the location of items
		private Random randInt = new Random();
	
	public Items(int x, int y, String imagePath, int numberOfItems, JPanel gamePanel)
	{
		this.x = x;
		this.y = y;
		this.imagePath = imagePath;
		this.numberOfItems = numberOfItems;
		this.gamePanel = gamePanel;
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
	
	private void setItemLocation() {
		int randomItemX = randInt.nextInt(gamePanel.getWidth() + 1);
		int randomItemY = randInt.nextInt(gamePanel.getHeight() + 1);
		setX(randomItemX);
		setY(randomItemY);
	}

	
}

