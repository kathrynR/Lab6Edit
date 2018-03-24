package Movement;

import player.Player;

/*
 * Author: Kate Hohenstein
 * Partners: Hannah Hollenback, Kathryn Reese
 * Lab 6
 * 3/10/18
 * Movement: set up methods allowing for movement of and collisions of characters
 */
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import enemy.Enemy;

public class Movement implements KeyListener{
	private Player myPlayer;
	private Enemy myEnemy;
	private JPanel myPanel;
	private Timer myTimer = new Timer();
	
	public Movement(Player myPlayer, Enemy myEnemy, JPanel myPanel) {
		this.myPlayer = myPlayer;
		this.myEnemy = myEnemy;
		this.myPanel = myPanel;
		
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getKeyCode() == KeyEvent.VK_LEFT)
		{
			myPlayer.setX(myPlayer.getX()-5);
		}
		
		else if(arg0.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			myPlayer.setX(myPlayer.getX()+5);
		}
		
		else if(arg0.getKeyCode() == KeyEvent.VK_UP)
		{
			myPlayer.setY(myPlayer.getY()-5);
		}
		
		else if(arg0.getKeyCode() == KeyEvent.VK_DOWN)
		{
			myPlayer.setY(myPlayer.getY()+5);
		}
	myPanel.repaint();
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	 * 
	 * TODO: Create a Timer that will move the enemy every so
	 * often. 
	 * How to make the enemy follow player and try to get them to 
	 * catch player.
	 * Increase the enemies speed when the enemy levels
	 * up.
	 * Enemy has to randomly appear??
	 * Created this- need to check it once everything is shown on
	 * the Panel.
	%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
	private class timerListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (myEnemy.getX() < myPlayer.getX()) {
				myEnemy.setX(myEnemy.getX() + 5);
			}
			else if (myEnemy.getX() > myPlayer.getY()) {
				myEnemy.setX(myEnemy.getX() - 5);
				
			}
			else if (myEnemy.getY() < myPlayer.getY()) {
				myEnemy.setY(myEnemy.getY() + 5);
			}
			else if (myEnemy.getY() > myPlayer.getY()) {
				myEnemy.setY(myEnemy.getY() - 5);
			}
			myPanel.repaint();
		}
		
	}
	
	/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	 * 
	 * TODO: Collisions: Enemy and player collision
	 * 	Player and Item Collision (Add score to item collision
	 * 		use the Score classes getters and setters
	 *  
	 *  Player and Edge of screen(not sure where to put this) Author: Kathryn
	 *  Instead of using walls this could be used to reset
	 *  the players location to the other side of the screen.
	 *  if (myPlayer.getX() >= myPanel.getwidth(){ // if the X value of the players position is greater than the right side of the screen, then the player will be reset to the left side of the screen
	 *  	myPlayer.setX(0);
	 *  }
	 *  else if (myPlayer.getX() <= 0{ // if the x value of the players position is less than or equal to 0, then the player will reset to the right side of the screen.
	 *  	myPlayer.setX(myPanel.getwidth();
	 *  }
	 *  else if (myPlayer.getY() <= 0{ // if the y value of the players position is less than or equal to 0, then the player will reset to the bottom of the screen.
	 *  	myPlayer.setY(myPanel.getwidth();
	 *  }
	 *  else if (myPlayer.getY() >= myPanel.getHeight(){ // if the y value of the players position is greater than or equal to the height of the panel, then the player will reset to the bottom of the screen.
	 *  	myPlayer.setY(0);
	%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

	
/*private class timerListener implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		myPlayer2.setX(myPlayer2.getX() + 5);
		repaint();
	}
}*/
}
