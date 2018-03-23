package enemy;
/*
 * Author: Kate Hohenstein
 * Partners: Hannah Hollenback, Kathryn Reese
 * Lab 6
 * 3/10/18
 * Enemy: set up enemy attributes and methods
 */
public class Enemy {
	private int x;
	private int y;
	private int speed;
	private String imagePath;

	
	public Enemy(int x, int y, String imagePath, int speed)
	{
		this.x = x;
		this.y  = y;
		this.imagePath = imagePath;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
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
	
	
}
