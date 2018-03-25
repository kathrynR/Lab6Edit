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
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import Miscellaneous.LevelUp;
import Miscellaneous.Score;
import enemy.Enemy;
import items.Items;

public class Movement implements KeyListener{
	private Score myScore;
	private Player myPlayer;
	private Enemy myEnemy;
	private JPanel myPanel;
	private ArrayList<Items> myItemsList;
	private ArrayList<ImageIcon> itemsIconArray;
	private ImageIcon playerIcon;
	private ImageIcon enemyIcon;
	private int enemySpeed = 500;
	private LevelUp levelUp = new LevelUp(500);
	
	private Timer myTimer = new Timer(levelUp.getEnemySpeed(), new timerListener());
	
	// Score label
	JLabel myScoreLabel = new JLabel();
	JLabel topThreeScores = new JLabel();
	
	// Size of player Image
	private int playerLeftX;
	private int playerRightX;
	private int playerTopY;
	private int playerBottomY;
	
	// Size of Enemy Image
	private int enemyLeftX;
	private int enemyRightX; 
	private int enemyTopY;
	private int enemyBottomY;
	
	// Size of Item Images
	private int itemLeftX;
	private int itemRightX;
	private int itemTopY;
	private int itemBottomY;
	
	// size of item images
	
	public Movement(Player myPlayer, Enemy myEnemy, JPanel myPanel, ArrayList<Items> myItemsList, ArrayList<ImageIcon> itemsIconArray, ImageIcon playerIcon, ImageIcon enemyIcon, Score myScore) {
		this.myItemsList = myItemsList;
		this.itemsIconArray = itemsIconArray;
		this.myPlayer = myPlayer;
		this.myEnemy = myEnemy;
		this.myPanel = myPanel;
		this.playerIcon = playerIcon;
		this.enemyIcon = enemyIcon;
		this.myScore = myScore;
		myPanel.addKeyListener(this);
		myPanel.requestFocus();
		myPanel.add(myScoreLabel);
		
	}
	
	private int getPlayerLeftX() {
		return myPlayer.getX();
	}
	private int getPlayerRightX() {
		return myPlayer.getX() + playerIcon.getIconWidth();
	}
	private int getPlayerTopY() {
		return myPlayer.getY();
	}
	private int getPlayerBottomY() {
		return myPlayer.getY() + playerIcon.getIconHeight();
	}
	private int getEnemyLeftX() {
		return myEnemy.getX();
	}
	private int getEnemyRightX() {
		return myEnemy.getX() + enemyIcon.getIconWidth();
	}
	private int getEnemyTopY() {
		return myEnemy.getY();
	}
	private int getEnemyBottomY() {
		return myEnemy.getY() + enemyIcon.getIconHeight();
		
	}
	
	public void startTheTimer() {
		myTimer.start();
	}
	public void stopTheTimer() {
		myTimer.stop();
	}
	
	// Cassens collision detector 
	private boolean areRectsColliding(int r1TopLeftX, int
			r1BottomRightX,int r1TopLeftY, int r1BottomRightY, int
			r2TopLeftX,int r2BottomRightX, int r2TopLeftY, int
			r2BottomRightY)
			{
			if (r1TopLeftX < r2BottomRightX && r1BottomRightX >
			r2TopLeftX&& r1TopLeftY < r2BottomRightY && r1BottomRightY >
			r2TopLeftY)
			{
			return true;
			}
			else
			{
			return false;
			}
			}
	
	// This method determines what will happen when the enemy collides with the player
	private void enemyPlayerCollision() {
		if(areRectsColliding(getPlayerLeftX(), getPlayerRightX(), getPlayerTopY(), getPlayerBottomY(), getEnemyLeftX(),getEnemyRightX(), getEnemyTopY(), getEnemyBottomY())) {
			myTimer.stop();
			//TODO: GameOver
			myScore.calculateTopThree();
			myPanel.add(topThreeScores);
			topThreeScores.setText("<html><body><br>" + myScore.showTopThree() + "</body></html>");
		}
	}
	// This method determines what will happen when the enemy collides with the player
	private void itemPlayerCollision() {
		for(int i = 0; i < itemsIconArray.size(); i++) {
			itemLeftX = myItemsList.get(i).getX();
			itemRightX = myItemsList.get(i).getX() + itemsIconArray.get(i).getIconWidth();
			itemTopY = myItemsList.get(i).getY();
			itemBottomY = myItemsList.get(i).getY() + itemsIconArray.get(i).getIconHeight();
			
			if(areRectsColliding(getPlayerLeftX(), getPlayerRightX(), getPlayerTopY(), getPlayerBottomY(), itemLeftX, itemRightX, itemTopY, itemBottomY)) {
				myScore.setPlayerScore(myScore.getPlayerScore() + 1);
				myScoreLabel.setText("Score: " + myScore.getPlayerScore());
				itemsIconArray.remove(i);
				myItemsList.remove(i);
			}
		}
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getKeyCode() == KeyEvent.VK_LEFT)
		{
			myPlayer.setX(myPlayer.getX()-5);
			
			if (myPlayer.getX() <= 0){ // (Kathryn) if the x value of the players position is less than or equal to 0, then the player will reset to the right side of the screen.
				myPlayer.setX(600);
				}
			// Player/Item collision detector
			//if(areRectsColliding())
			
			enemyPlayerCollision();
			itemPlayerCollision();
			
		}
		
		else if(arg0.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			myPlayer.setX(myPlayer.getX()+5);
			
			if (myPlayer.getX() >= 600){ // if the X value of the players position is greater than the right side of the screen, then the player will be reset to the left side of the screen
				myPlayer.setX(0);
			}
			
			enemyPlayerCollision();
			itemPlayerCollision();
		}
		
		else if(arg0.getKeyCode() == KeyEvent.VK_UP)
		{
			myPlayer.setY(myPlayer.getY()-5);
			if (myPlayer.getY() <= 0){ // if the y value of the players position is less than or equal to 0, then the player will reset to the bottom of the screen.
				 myPlayer.setY(600);
				 }
			
			enemyPlayerCollision();
			itemPlayerCollision();
		}
		
		else if(arg0.getKeyCode() == KeyEvent.VK_DOWN)
		{
			myPlayer.setY(myPlayer.getY()+5);
			if (myPlayer.getY() >= 600){ // if the y value of the players position is greater than or equal to the height of the panel, then the player will reset to the top of the screen.
				 myPlayer.setY(0);
			}
			
			enemyPlayerCollision();
			itemPlayerCollision();
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
	
	/*______________________________________________________
	 * 
	 * Enemies Timer Listener:
	 * Follows the player. When the Enemies x position or y
	 * position is less than or greater than the players,
	 * the enemy will move 5 units in the players direction.
	 * 
	 _______________________________________________________*/
	private class timerListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (myEnemy.getX() < myPlayer.getX()) {
				myEnemy.setX(myEnemy.getX() + 5);
			}
			if (myEnemy.getX() > myPlayer.getX()) {
				myEnemy.setX(myEnemy.getX() - 5);
				
			}
			if (myEnemy.getY() < myPlayer.getY()) {
				myEnemy.setY(myEnemy.getY() + 5);
			}
			if (myEnemy.getY() > myPlayer.getY()) {
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
	 *  
	%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

}
