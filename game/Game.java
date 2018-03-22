package game;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

import enemy.Enemy;
import items.Items;
import player.Player;

/*
 * Author: Kate Hohenstein
 * Partners: Hannah Hollenback, Kathryn Reese
 * Lab 6
 * 3/10/18
 * Game: set up methods allowing for game execution
 * Kathryn: Will call instances of Player, Enemy, and Item Classes
 */
public class Game {
	/*-----------------------------------------------
	 * Attributes
	 * Kathryn: Added Attributes
	 * 
	 * (The Game class has an Enemy class, Player class, and Item class)
	 ------------------------------------------------*/
	private Player player = new Player;
	private Enemy enemy;
	private Items item;
	private JPanel gamePanel;
	private JPanel startPanel;
	private ArrayList<Integer> topThreeScores = new ArrayList<Integer>();
	private int itemNumber = 4;
	JButton myButton;
	JButton myButton2;

	
	
	/*------------------------------------------------
	 * Constructor
	 -------------------------------------------------*/
	public Game(JPanel gamePanel, Player player, Enemy enemy, Items item) {
		this.gamePanel = gamePanel;
		this.player = player;
		this.enemy = enemy;
		this.item = item;
	}
	
	/*-----------------------------------------------
	 * Methods
	 * Kathryn: Added return statements and set up a toString
	 ------------------------------------------------*/

	//sets up screen
	// Kathryn: Will set up the characters and the items on screen
	public void setUp()
	{
		Movement myMovement = new Movement(player)
	}
	
	//starts game, listening for user button click
	public void startGame()
	{
	}

	//sets up next level, new screen, change number/placement of items, speed of enemy
	public void nextLevel()
	{
		itemNumber ++;
		for(int i = 0; i < itemNumber; i++) {
			Item item = new Item();
		}
	}
	
	//ends game when player/enemy collide
	// Kathryn: Returns the String Game Over when the game ends
	public String gameOver()
	{
		return "Game Over";
	}
	
	//display current player score
	public int showScore()
	{
		return 0;
	}
	
	//calculate and store top 3 scores and accompanying player info
	// Kathryn: added calculate to the beginning of method name to distinguish it from the other method
	// Kathryn: Method will add the top three scores to an Arraylist
	public void calculateTopThree()
	{	
	}
	
	//display top 3 scores and accompanying player info
	// Kathryn: Made this method return and ArrayList of Integers
	public ArrayList<Integer> showTopThree()
	{
		return topThreeScores;
	}
	// Kathryn: Added a toString method, With temporary String
	public String toString() {
		return "FIXME: If the game is over output " + gameOver() + "\n" +
				"FIXME: Player Score: " + showScore() + "\n";
	}
	
}
