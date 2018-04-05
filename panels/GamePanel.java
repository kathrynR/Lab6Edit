/* Author: Kathryn Reese
 * Partners: Hannah Hollenback, Kate Hohenstein
 * Date Created: 03/19/18
 * This panel will call an instance of game. 
 * This panel will be displayed when the start button is pressed.
 * (The panel is instantiated in the StartGameButton Class)
 */
package panels;

import java.awt.Dimension;
import java.awt.Graphics;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import Miscellaneous.LevelUp;
import game.Game;
import items.Items;

public class GamePanel extends JPanel {
	private Game myGame;
	private ImageIcon playerIcon;
	private ImageIcon enemyIcon;
	private LevelUp levelUp;
	
	private ArrayList<Items> myItemsList;
	private ArrayList<ImageIcon> itemsIconArray;

	public GamePanel() throws FileNotFoundException {
		myGame = new Game(this);
		myGame.setUp();
		playerIcon = myGame.getPlayerIcon();
		enemyIcon = myGame.getEnemyIcon();
		myItemsList = myGame.getMyItemsList();
		itemsIconArray = myGame.getItemsIconArray();
		setPreferredSize(new Dimension(600, 600));

		
	}
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		page.drawImage(playerIcon.getImage(), myGame.getPlayer().getX(), myGame.getPlayer().getY(), null);
		page.drawImage(enemyIcon.getImage(),myGame.getEnemy().getX(), myGame.getEnemy().getY(), null);
		for(int i = 0; i < myGame.getMyItemsList().size(); i++) {
			page.drawImage(myGame.getItemsIconArray().get(i).getImage(), myGame.getMyItemsList().get(i).getX(), myGame.getMyItemsList().get(i).getY(), null);
		}
		
	}
	// Getters and Setters
	public ImageIcon getPlayerIcon() {
		return playerIcon;
	}
	public void setPlayerIcon(ImageIcon playerIcon) {
		this.playerIcon = playerIcon;
	}
	public ImageIcon getEnemyIcon() {
		return enemyIcon;
	}
	public void setEnemyIcon(ImageIcon enemyIcon) {
		this.enemyIcon = enemyIcon;
	}
	public Game getMyGame() {
		return myGame;
	}
	public void setMyGame(Game myGame) {
		this.myGame = myGame;
	}
	public ArrayList<Items> getMyItemsList() {
		return myItemsList;
	}
	public void setMyItemsList(ArrayList<Items> myItemsList) {
		this.myItemsList = myItemsList;
	}
	public ArrayList<ImageIcon> getItemsIconArray() {
		return itemsIconArray;
	}
	public void setItemsIconArray(ArrayList<ImageIcon> itemsArrayList) {
		this.itemsIconArray = itemsArrayList;
	}
	public LevelUp getLevelUp() {
		return levelUp;
	}
	public void setLevelUp(LevelUp levelUp) {
		this.levelUp = levelUp;
	}

}
