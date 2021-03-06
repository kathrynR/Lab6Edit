/* Author: Kathryn Reese
 * Partners: Hannah Hollenback, Kate Hohenstein
 * Date Created: 03/19/18
 * Sets up the instructions button and the start button.
 */
package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import Miscellaneous.Score;
import Movement.Movement;
import panels.GamePanel;
import panels.InstructionsPanel;

public class StartGameButton {
	/*_________________________________________________
	 * Attributes
	 __________________________________________________*/
	private JPanel mainPanel;
	private JPanel startMenu;
	private Score myScore = new Score();
	private GamePanel gamePanel = new GamePanel();
	private JPanel buttonPanel = new JPanel();
	private JButton startButton = new JButton("Start Game");
	private JButton instructionsButton = new JButton("Instructions");
	private JButton exitInstructionsButton = new JButton("Back");
	private InstructionsPanel instructionsPanel;
	
	/*_________________________________________________
	 * Constructor
	 __________________________________________________*/
	public StartGameButton(JPanel startMenu, JPanel mainPanel) throws FileNotFoundException {
		this.startMenu = startMenu;
		this.mainPanel = mainPanel;
		instructionsPanel = new InstructionsPanel();
		
	}

	/*_________________________________________________
	 * Methods
	 __________________________________________________*/
	/*---------------------------------------------------------------
	 * 
	 * displayStartButton() method displays the start button on the button 
	 * panel, in the designated location.
	 * 
	 ----------------------------------------------------------------*/
	private void displayStartButton() {
		buttonPanel.add(startButton);
		startButton.addActionListener(new buttonHandler());
	}
	
	/*---------------------------------------------------------------
	 * 
	 * displayInstructonsButton() method displays the instructions 
	 * button on the button panel, in the designated location.
	 * 
	 ----------------------------------------------------------------*/
	private void displayInstructionsButton() {
		buttonPanel.add(instructionsButton);
		instructionsButton.addActionListener(new buttonHandler());
	}
	
	/*---------------------------------------------------------------
	 * 
	 * displayButtonPanel() method:
	 * Displays the button Panel on the designated panel
	 * 
	 ----------------------------------------------------------------*/
	public void displayButtonPanel() {
		displayStartButton();
		displayInstructionsButton();
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
		startMenu.add(buttonPanel);
	}
	
	/*___________________________________________________
	 * Action Listener
	 ____________________________________________________*/
	private class buttonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			/*---------------------------------------------------------------------------
			 * 
			 * if the start button is pressed the startMenu panel will become invisible, 
			 * and the gamePanel will become visible. The movement class will also be 
			 * instantiated and enemy timer started.
			 * 
			 ----------------------------------------------------------------------------*/ 
			if (arg0.getSource() == startButton) {
				startMenu.setVisible(false);
				mainPanel.add(gamePanel);
				gamePanel.setVisible(true);
				
				Movement myMovement = new Movement(gamePanel.getMyGame().getPlayer(), gamePanel.getMyGame().getEnemy(), gamePanel, gamePanel.getMyItemsList(), gamePanel.getItemsIconArray(), gamePanel.getPlayerIcon(), gamePanel.getEnemyIcon(), myScore);
				myMovement.startTheTimer();
				
			}
			/*--------------------------------------------------------------------------------------------------------
			 * 
			 * if the instructions button is pressed the instructions panel will be added to the start menu panel
			 * the back button will become visible on the instructions panel
			 * the button panel with the start and instructions button will become invisible
			 * 
			 ---------------------------------------------------------------------------------------------------------*/
			else if(arg0.getSource() == instructionsButton) {
				startMenu.add(instructionsPanel);
				instructionsPanel.setVisible(true);
				exitInstructionsButton.addActionListener(new buttonHandler());
				instructionsPanel.add(exitInstructionsButton);
				buttonPanel.setVisible(false);
				
			}
			/*-----------------------------------------------------------------------------
			 * 
			 * If the exit instructions button is pressed it will set the instructions 
			 * panel to invisible, and the buttons panel to visible
			 * 
			 ------------------------------------------------------------------------------*/
			else if(arg0.getSource() == exitInstructionsButton) {
				instructionsPanel.setVisible(false);
				buttonPanel.setVisible(true);
			}
			
		}
		
		
	}
	

}
