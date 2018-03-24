package enemy;
/*
 * Author: Hannah Hollenback
 * Partners: Kate Hohenstein, Kathryn Reese
 * Lab 6
 * 3/20/18
 * Enemy: set up enemy attributes and methods
 */
public class Enemy {

	private String image;
	private int positionX;
	private int positionY;
	private int speed;
	
	public Enemy(String image, int positionX, int positionY, int speed)
	{

		this.image = image;
		this.positionX = positionX;
		this.positionY = positionY;
		this.speed = speed;
	}
	
	//method to add enemy image icon to screen in position (X,Y)
	public void showEnemyImage()
	{
	}
	
	//method to get enemy position (X)
	public int getEnemyPosX()
	{ 
		return positionX;
	}
	
	//method to get enemy position (Y)
	public int getEnemyPosY()
	{ 
		return positionY;
	}
	
	//method to set player position (X)
	public void setX(int positionX)
	{
		this.positionX = positionX;
	}
	
	//method to set player position (y)
	public void setY(int positionY)
	{
		this.positionY = positionY;
	}
	
	public String getEnemyBottomX()
	{
		getBottomX = image.getWidth()+Enemy.getX();
		return getBottomX;
	}
	public String getEnemyBottomY()
	{
		getBottomY = image.getWidth()+Enemy.getY();
		return getBottomY;
	}
	
	//method to get enemy speed
	public int getSpeed()
	{ 
		return speed;
	}
	
	//method to set enemy speed
	/*// Hannah made a comment that we will need to cap the enemies speed 
	public void setSpeed(int enemySpeed)
	{
		speed = enemySpeed;
	}
	*/

}

