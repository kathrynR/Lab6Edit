/* Author: Kathryn Reese
 * Partners: Hannah Hollenback, Kate Hohenstein
 * Date Created: 03/19/18
 * This panel will call an instance of game. 
 * This panel will be displayed when the start button is pressed.
 * (The panel is instantiated in the StartGameButton Class)
 */
package panels;

import javax.swing.JPanel;

import game.Game;
import game.StartGameButton;

public class GamePanel extends JPanel {
	public GamePanel() {
		Game myGame = new Game(this);

		
	}
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		page.drawImage(myIcon.getImage(), myPlayer.getX(), myPlayer.getY(), null);
		page.drawImage(myIcon2.getImage(),myEnemy.getX(), myEnemy.getY(), null);
		page.drawImage(myIcon3.getImage(),myItem.getX(), myItem.getY(), null);
		
		/*String itemPresent = areRectsColliding(myPlayer.getX(), (myPlayer.getX() + myIcon.getIconWidth()),myPlayer.getY(),(myPlayer.getY() + myIcon.getIconHeight()),
				myItem.getX(),(myItem.getX() + myIcon3.getIconWidth()),myItem.getY(),(myItem.getY() + myIcon3.getIconHeight()));
		
		if (itemPresent.equals("false"))
		{
			page.
		}*/
	}

}
