import java.io.FileNotFoundException;

import javax.swing.JFrame;

import panels.InstructionsPanel;
import panels.StartPanel;

public class Frame {

	public static void main(String[] args) throws FileNotFoundException {
		JFrame myFrame = new JFrame("Rover's Bone Retrieval");
		StartPanel myPanel = new StartPanel();
		myFrame.getContentPane().add(myPanel);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		myFrame.pack();

	}

}
