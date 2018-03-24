package Movement;
import Player;
import Enemy;

import java.awt.event.KeyEvent;

/*
 * Author: Hannah Hollenback
 * Partners: Kate Hohenstein, Kathryn Reese
 * Lab 6
 * 3/20/18
 * Movement: set up methods allowing for movement of and collisions of characters
 */
public class Movement {
	
	//get player position X,Y, listen to input from user re: direction
	//change player coordinates accordingly and re-set them, show image in new position
	public void movePlayer(myPlayer)
	{	
		public void keyPressed(KeyEvent arg0) {
			
		if (arg0.getKeyCode()== KeyEvent.VK_LEFT)
		{
			Player(myPlayer).setX(myPlayer.getX()-5);	
		}
		else if (arg0.getKeyCode()==KeyEvent.VK_RIGHT)
		{
			Player(myPlayer).setX(myPlayer.getX()+5);
		}
		else if (arg0.getKeyCode()==KeyEvent.VK_DOWN)
		{
			Player(myPlayer.setY(myPlayer.getY()+5));
		}
		else if (arg0.getKeyCode()==KeyEvent.VK_UP)
		{
			Player(myPlayer.setY(myPlayer.getY()-5));
		}
		
	}
	}//end of movement

	//get enemy position X,Y, change coordinates based on player movement (somehow), re-set X,Y
	//and show image in new position
	public void moveEnemy(myEnemy)
	{	
		if myPlayer.getX()<myEnemy.getX()
		{
			Enemy(myEnemy.setX(myEnemy.getX()-5));
		}
		else if myPlayer.getX()>myEnemy.get(x)
		{
			Enemy(myEnemy.setX(myEnemy.getX()+5));
		}
		else if myPlayer.getY()<myEnemy.getY()
		{
			Enemy(myEnemy.setY(myEnemy.getY()-5));
		}
		else if myPlayer.getY()>myEnemy.getY()
		{
			Enemy(myEnemy.setY(myEnemy.getY()+5))
		}
	}
	
	//boolean "watching" to see if player and enemy X,Y are the same
	//this is comparing the top left corner and bottom right corner of the picture to determine the collision.
	
	public boolean playerEnemyCollision(int getPlayerX, int getPlayerY, int getPlayerBottomX, int getPlayerBottomY
					   int getEnemyPosX, int getEnemyPosY, int getEnemyBottomX, int getEnemyBottomY)
	{	
		if (getPlayerX < getEnemyBottomX && getPlayerBottomX > getEnemyPosX && getPlayerY < getEnemyBottomY
			&& getPlayerBottomY > getEnemyPosY)
		{
			return true;
		}
		else
		{
			return false;
		}
	
	}//end of playerEnemyCOllision
	
	//boolean "watching" to see if player and any item X,Y are the same
	//this is basically the same as the enemycollision detector, but with the items
	public boolean playerItemCollision(int getPlayerX, int getPlayerY, int getPlayerBottomX, int getPlayerBottomY
					   int getItemPosX, int getItemPosY, int getItemBottomX, int getItemBottomY)
	{	
		if (getPlayerX < getItemBottomX && getPlayerBottomX > getItemPosX && getPlayerY < getItemBottomY
				&& getPlayerBottomY > getItemPosY)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}//end of playerItemCollision
	public void wallCollision()
	{
		
	}
	
}

