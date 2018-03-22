package panels;
/*
 * Author: Kathryn Reese
 * Partners: Hannah Hollenback, Kate Hohenstein
 * Date: 03/10/18
 * Purpose: This panel will ultimately hold everything. 
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.io.FileNotFoundException;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import game.StartGameButton;
import game.StartGameTitle;

public class MainPanel extends JPanel {
	public MainPanel() throws FileNotFoundException {
		Game myGame = new Game(this)
		setBackground(new Color(40, 145, 56));
		setPreferredSize(new Dimension(600, 600));
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
	}
	public void paintComponent(Graphics image) {
		super.paintComponent(image);
	}

}
