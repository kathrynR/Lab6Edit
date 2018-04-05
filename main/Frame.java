/* Author: Kathryn Reese
 * Partners: Hannah Hollenback, Kate Hohenstein
 * Date Created: 03/20/18
 * Contains the main method.
 */
package main;
import java.io.FileNotFoundException;
import javax.swing.JFrame;
import panels.MainPanel;

public class Frame {
	private static JFrame myFrame;
	public static void main(String[] args) throws FileNotFoundException {
		newGame();

	}
	// used to start a new game after the enemy catches the player.
	public static void newGame() throws FileNotFoundException {
		myFrame = new JFrame("Rover's Bone Retrieval");
		MainPanel myPanel = new MainPanel();
		myFrame.getContentPane().add(myPanel);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		myFrame.pack();
	}
	// Used to remove the frame when the enemy collides with the player
	public static void removeFrame() {
		myFrame.dispose();
	}

}
