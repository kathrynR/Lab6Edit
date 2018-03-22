/* Author: Kathryn Reese
 * Partners: Hannah Hollenback, Kate Hohenstein
 * Date Created: 03/19/18
 * This class grabs instructions for the game from a file. It then
 * displays it in a panel.
 */
package instructions;

import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Instructions {
	private JPanel instructionsPanel;
	private JLabel instructionsLabel = new JLabel();
	private File instructionsFile = new File("./src/instructions/instructions.txt");
	private String instructions = "<html><body>";
	
	/*_______________________________________________________________________
	 * 
	 * getInstructionsFromFile() method:
	 * Retrieves game instructions from a text document. Returns the text as
	 * a string.
	 * 
	 ________________________________________________________________________*/
	private String getInstructionsFromFile() throws FileNotFoundException {
		Scanner fileScanner = new Scanner(instructionsFile);
		instructions += fileScanner.nextLine() + "<br>";
		while(fileScanner.hasNextLine()) {
			instructions += fileScanner.nextLine();
			instructions += "<br>";
			
		}
		instructions += "</body></html>";
		fileScanner.close();
		return instructions;
	}
	/*________________________________________________________________________
	 * 
	 * displayInstructions() method:
	 * displays the instructions on a panel that is passed into the parameters.
	 * 
	 _________________________________________________________________________*/
	public void displayInstructions(JPanel instructionsPanel) throws FileNotFoundException {
		this.instructionsPanel = instructionsPanel;
		instructionsLabel.setText(getInstructionsFromFile());
		instructionsLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		instructionsPanel.add(instructionsLabel);
		
	}

}
