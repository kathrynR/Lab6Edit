/* Author: Kathryn Reese
 * Partners: Hannah Hollenback, Kate Hohenstein
 * Date Created: 03/19/18
 * This panel holds the instructions for the game.
 * It will be displayed when the instructions button is pressed.
 */
package panels;

import java.awt.Dimension;
import java.io.FileNotFoundException;

import javax.swing.JPanel;

import instructions.Instructions;

public class InstructionsPanel extends JPanel {
	public InstructionsPanel() throws FileNotFoundException{
		Instructions myDirections = new Instructions();
		myDirections.displayInstructions(this);
		
	}

}
