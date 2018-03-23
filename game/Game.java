package game;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import Miscellaneous.LevelUp;
import Miscellaneous.Score;
import Movement.Movement;
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
	
	/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	 * 
	 * TODO: Fix Player class, Enemy class, and Movement class
	 * parameters below when they are completed.
	 * 
	 %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
	private Enemy enemy;
	private Score score = new Score();
	private Items item;
	private JPanel gamePanel;
	private JPanel startPanel;
	
	// Gather from file to pass into player parameters
	private String name;
	private int x;
	private int y;
	private String imagePath;
	private Player player = new Player(name, x, y, imagePath);
	
	private Movement movement = new Movement(player, enemy);
	//private LevelUp levelUp = new LevelUp(enemy, player);
	
	// Used to determine top three scores
	private JLabel threeScoresDisplay = new JLabel();
	private Integer[] topThreeScores = {0, 0, 0};
	
	// file containing player attributes and array that will store each file
	private String filePath = "./src/playerTextDocs";
	
	private int itemNumber = 5;
	
	/*------------------------------------------------
	 * Constructor
	 -------------------------------------------------*/
	public Game(JPanel gamePanel) {
		this.gamePanel = gamePanel;
	}
	
	/*-----------------------------------------------
	 * Methods
	 * 
	 ------------------------------------------------*/
	
	
	// This method will randomly select a file to gather player attributes from.
	private String randomlySelectPlayer() {
		String fileName = "";
		Random myRand = new Random();
		int randomFileNumber = myRand.nextInt(3);
		if(randomFileNumber == 0) {
			fileName = "CatAttributes.txt";
		}
		else if(randomFileNumber == 1) {
			fileName = "Dog1Attributes.txt";
		}
		else if(randomFileNumber == 2) {
			fileName = "Sprite1Attributes.txt";
		}
		return filePath + fileName;
	}
	
	/*#####################################################
	 * 
	 * FIXME: Make sure it works!!!!!!!!!
	 * 
	 ######################################################*/
	// goes through the file, assigning each line to a variable
	public void gatherPlayerInformation() throws FileNotFoundException {
		String fileLocation = randomlySelectPlayer();
		File myFile = new File(fileLocation);
		Scanner myScanner = new Scanner(myFile);
		while(myScanner.hasNextLine()) {
			name = myScanner.nextLine();
			imagePath = myScanner.nextLine();
			x = myScanner.nextInt();
			y = myScanner.nextInt();
		}
	}
	
	/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	 * 
	 * TODO: Set item position on screen
	 * Create a loop to create the number of item instances.
	 * (Kathryn) I created a method in the Items class that
	 * will randomly set the location of each instance of item.
	 * 
	 %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
	
	
	//sets up screen
	// Kathryn: Will set up the characters and the items on screen
	public void setUp()
	{
	}
	

	//sets up next level, new screen, change number/placement of items, speed of enemy
	/*???????????????????????????????????????????????????????????????????????????????
	 * 
	 * NOTE: NextLevel() may need to be a private method that is only called int
	 * this Game class.
	 * Until enemy and player classes are finished this will not work.
	 ?????????????????????????????????????????????????????????????????????????????????*/
/*	public void nextLevel()
	{
		levelUp.increaseEnemySpeed();
		levelUp.increaseItemNumber();
	}*/
	
	//display current player score
	public int showScore()
	{
		return score.getPlayerScore();
	}
	
	//calculate and store top 3 scores and accompanying player info
	// Kathryn: added calculate to the beginning of method name to distinguish it from the other method
	// Kathryn: Method will add the top three scores to an array.
	private void calculateTopThree()
	{	
		if(score.getPlayerScore() > topThreeScores[0]) {
			topThreeScores[0] = score.getPlayerScore();
		}
		else if(score.getPlayerScore() > topThreeScores[1]) {
			topThreeScores[1] = score.getPlayerScore();
		}
		else if(score.getPlayerScore() > topThreeScores[2]) {
			topThreeScores[2] = score.getPlayerScore();
		}
	}
	
	// display top 3 scores and accompanying player info
	// Kathryn: This method will display the top three scores in a JLabel.
	/*???????????????????????????????????????????????????????????????????????????
	 * 
	 * NOTE: We only have to display the top three high scores. Not scores from
	 * different players.
	 * 
	 ????????????????????????????????????????????????????????????????????????????*/
	public void showTopThree()
	{
		calculateTopThree();
		String scoresString = "<html><body>Top Score: " + topThreeScores[0] + "\n" +
							  "Second Top Score: " + topThreeScores[1] + "\n" +
							  "Third Top Score: " + topThreeScores[2] + "\n</body></html>";
		threeScoresDisplay.setText(scoresString);
		gamePanel.add(threeScoresDisplay);
	}
	
}
