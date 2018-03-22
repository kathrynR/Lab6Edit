/* Author: Kathryn Reese
 * Partners: Hannah Hollenback, Kate Hohenstein
 * Date Created: 03/19/18
 * Contains a method that will display the title on a panel. This panel will
 * then be added onto a panel that you pass into the parameters.
 */
package game;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartGameTitle {
	
	/*_______________________________________________________________________
	 * 
	 * displayTitle() will display the title on the panel provided in the 
	 * constructor parameters.
	 * 
	 ________________________________________________________________________*/
	public static void displayTitle(JPanel mainPanel, String gameTitle) {
		JLabel titleLabel = new JLabel(gameTitle);
		JPanel titlePanel = new JPanel();
		mainPanel.add(titlePanel);
		titlePanel.add(titleLabel);
		titleLabel.setFont(new Font("Baskerville Old Face", Font.BOLD, 50));
		titlePanel.setVisible(true);
		titleLabel.setVisible(true);
	}

}
