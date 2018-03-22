package player;
import javax.swing.JPanel;
import javax.swing.Timer;

/*
 * Author: Kate Hohenstein
 * Partners: Hannah Hollenback, Kathryn Reese
 * Lab 6
 * 3/10/18
 * Player: set up player attributes and methods
 */
public class Player {
	
	/*----------------------------
	 * Attributes
	 -----------------------------*/
	private String name;
	private String image;
	private int positionX;
	private int positionY;
	//private int score;
	
	/*----------------------------
	 * Constructor
	 -----------------------------*/
	public Player(String name, String image, int positionX, int positionY, int score)
	{
		this.name = name;
		this.image = image;
		this.positionX = positionX;
		this.positionY = positionY;
		//this.score = score;
		
	}
	
	/*----------------------------
	 * Methods
	 -----------------------------*/
	//method to add player image icon to screen in position (X,Y)
	// wouldn't this be a part of paint component??
	public void showImage()
	{
	}
	
	//method to get player position (X)
	public int getPlayerPosX()
	{ 
		return positionX;
	}
	
	//method to get player position (Y)
	public int getPlayerPosY()
	{ 
		return positionY;
	}
	
	// method to get image location
	public String getImagePath()
	{
		return image;
	}
	
	//method to set player position (X,Y)
	public void setPlayerPos(int X,int Y)
	{
		positionX = X;
		positionY = Y;
	}
	
	//method to get player score
	/*public int getScore()
	{ 
		return score;
	}
	
	//method to set player score
	public void setScore(int playerScore)
	{
		score = playerScore;
	}*/
	
}

