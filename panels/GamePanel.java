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

import javax.swing.JPanel;

import Movement.Movement;
import game.Game;
import game.StartGameButton;

public class GamePanel extends JPanel {
	private Game myGame;
	public GamePanel() throws FileNotFoundException {
		myGame = new Game(this);
		myGame.setUp();
		setPreferredSize(new Dimension(600, 600));

		
	}
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		page.drawImage(myGame.getPlayerIcon().getImage(), myGame.getPlayer().getX(), myGame.getPlayer().getY(), null);
		page.drawImage(myGame.getEnemyIcon().getImage(),myGame.getEnemy().getX(), myGame.getEnemy().getY(), null);
		for(int i = 0; i < myGame.getMyItemsList().size(); i++) {
			page.drawImage(myGame.getItemsIconArray().get(i).getImage(), myGame.getMyItemsList().get(i).getX(), myGame.getMyItemsList().get(i).getY(), null);
		}
		
	}
	public Game getMyGame() {
		return myGame;
	}
	public void setMyGame(Game myGame) {
		this.myGame = myGame;
	}

}
