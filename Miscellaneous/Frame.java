package Miscellaneous;
import java.io.FileNotFoundException;

import javax.swing.JFrame;

import panels.InstructionsPanel;
import panels.MainPanel;
import panels.StartPanel;

public class Frame {

	public static void main(String[] args) throws FileNotFoundException {
		JFrame myFrame = new JFrame("Rover's Bone Retrieval");
		MainPanel myPanel = new MainPanel();
		myFrame.getContentPane().add(myPanel);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		myFrame.pack();

	}

}
