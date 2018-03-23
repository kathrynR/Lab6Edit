package Movement;

import player.Player;

/*
 * Author: Kate Hohenstein
 * Partners: Hannah Hollenback, Kathryn Reese
 * Lab 6
 * 3/10/18
 * Movement: set up methods allowing for movement of and collisions of characters
 */
public class Movement {
	private Player player;
	public Movement(Player player) {
		this.player = player;
	}
	
	//get player position X,Y, listen to input from user re: direction
	//change player coordinates accordingly and re-set them, show image in new position
	public void movePlayer()
	{	
		if (arg0.getKeyCode() == keyEvent.VK_LEFT)
		{
			player.setX(positionX()-5);
		}
		else if(arg0.getKeyCode() == keyEvent.VK_RIGHT)
		{
			player.setX(positionX()+5);
		}
		else if(arg0.getKeyCode() == keyEvent.VK_UP)
		{
			player.setY(positionY()-5);
		}
		else if(arg0.getKeyCode() == keyEvent.VK_DOWN)
		{
			player.setY(positionY()+5);
		}

	//get enemy position X,Y, change coordinates based on player movement (somehow), re-set X,Y
	//and show image in new position
	public void moveEnemy()
	{
		if(player.positionY()<enemy.positionY())
		{
			enemy.positionY()+5;
		}
		else if(player.positionY()>enemy.positionY())
		{
			enemy.positionY()-5;
		}
		else if(player.positionX()<enemy.positionX())
		{
			enemy.positionX()-5;
		}
		else if(player.positionX()>enemy.positionX())
		{
			enemy.positionX()+5;
		}
	}
	
	//boolean "watching" to see if player and enemy X,Y are the same
	public void playerEnemyCollision()
	{	
	}
	
	//boolean "watching" to see if player and any item X,Y are the same
	public void playerItemCollision()
	{	
	}
	public void wallCollision()
	{
		
	}
	
}
