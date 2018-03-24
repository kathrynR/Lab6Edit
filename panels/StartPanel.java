/* Author: Kathryn Reese
 * Partners: Hannah Hollenback, Kate Hohenstein
 * Date Created: 03/19/18
 * This panel holds the buttons panels and the title of the game. 
 */
package panels;

import java.awt.Color;
import java.awt.Dimension;
import java.io.FileNotFoundException;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import game.StartGameButton;
import game.StartGameTitle;

public class StartPanel extends JPanel {
	JPanel mainPanel;
	public StartPanel(JPanel mainPanel) throws FileNotFoundException {
		setBackground(Color.GREEN);
		setPreferredSize(new Dimension(600,600));
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.mainPanel = mainPanel;
		
		// Displays the title and buttonPanel on this panel
		StartGameTitle.displayTitle(this, "Rover's Bone Retrieval");
		StartGameButton myButtonsPanel = new StartGameButton(this, mainPanel);
		myButtonsPanel.displayButtonPanel();
	}

}
