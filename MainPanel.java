
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MainPanel extends JPanel implements KeyListener{

	Random myRand = new Random();
	int newItemX;
	int newItemY;
	int initialItemX = 0;
	int initialItemY = 0;
	Items [] myItems;
	ImageIcon [] itemIcon;
	JButton myButton;
	Player myPlayer = new Player("joe",100,100, "./src/images/Dog1.png",0);
	Enemy myEnemy = new Enemy(0,0, "./src/images/cat.png");
	ImageIcon myIcon = new ImageIcon(myPlayer.getImagePath());
	ImageIcon myIcon2 = new ImageIcon(myEnemy.getImagePath());
	Timer myTimer = new Timer(500, new timerListener());
	int r1TopLeftX;
	int r1BottomRightX;
	int r1TopLeftY;
	int r1BottomRightY;
	int r2TopLeftX;
	int r2BottomRightX;
	int r2TopLeftY;
	int r2BottomRightY;
	int level = 1;
		
	public MainPanel()
	{
		setPreferredSize(new Dimension(800,800));
		myButton = new JButton("Start");
		//myButton.addActionListener(new buttonListener());
		add(myButton);
		addKeyListener(this);
		setFocusable(true);
		myTimer.start();
		
		myItems = new Items[4];
		myItems[0] = new Items(initialItemX,initialItemY,"./src/images/Ball2.png");
		myItems[1] = new Items(initialItemX,initialItemY,"./src/images/Ball2.png");
		myItems[2] = new Items(initialItemX,initialItemY,"./src/images/Ball2.png");
		myItems[3] = new Items(initialItemX,initialItemY,"./src/images/Ball2.png");
		
		itemIcon = new ImageIcon[4];
		itemIcon[0] = new ImageIcon(myItems[0].getImagePath());
		itemIcon[1] = new ImageIcon(myItems[1].getImagePath());
		itemIcon[2] = new ImageIcon(myItems[2].getImagePath());
		itemIcon[3] = new ImageIcon(myItems[3].getImagePath());
		
	}
	
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		page.drawImage(myIcon.getImage(), myPlayer.getX(), myPlayer.getY(), null);
		page.drawImage(myIcon2.getImage(),myEnemy.getX(), myEnemy.getY(), null);
		
	
		for (int i = 0; i < myItems.length; i++)
		{
			newItemX = myRand.nextInt(801);
			newItemY = myRand.nextInt(801);
			myItems[i].setX(newItemX);
			myItems[i].setY(newItemY);
			page.drawImage(itemIcon[i].getImage(),myItems[i].getX(), myItems[i].getY(), null);
		}
		
		
		/*String itemPresent = areRectsColliding(myPlayer.getX(), (myPlayer.getX() + myIcon.getIconWidth()),myPlayer.getY(),(myPlayer.getY() + myIcon.getIconHeight()),
				myItem.getX(),(myItem.getX() + myIcon3.getIconWidth()),myItem.getY(),(myItem.getY() + myIcon3.getIconHeight()));
		
		if (itemPresent.equals("false"))
		{
			page.
		}*/
	}
		
		@Override
		public void keyPressed(KeyEvent arg0) {
			// TODO Auto-generated method stub
			if(arg0.getKeyCode() == KeyEvent.VK_LEFT)
			{
				myPlayer.setX(myPlayer.getX()-5);
			}
			
			else if(arg0.getKeyCode() == KeyEvent.VK_RIGHT)
			{
				myPlayer.setX(myPlayer.getX()+5);
			}
			
			else if(arg0.getKeyCode() == KeyEvent.VK_UP)
			{
				myPlayer.setY(myPlayer.getY()-5);
			}
			
			else if(arg0.getKeyCode() == KeyEvent.VK_DOWN)
			{
				myPlayer.setY(myPlayer.getY()+5);
			}
		repaint();
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub	
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub	
		}
	
	private class timerListener implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				myEnemy.setX(myEnemy.getX() + 5);
				repaint();
		}
			
	private class buttonListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		if(arg0.getSource() == myButton)
		{
			System.out.println("button 1 was pressed");
		}	
	}
	
	
	private boolean areRectsColliding(int r1TopLeftX, int r1BottomRightX,int r1TopLeftY, int r1BottomRightY, int r2TopLeftX,int r2BottomRightX, int r2TopLeftY, int r2BottomRightY)
	{
		
	if (r1TopLeftX < r2BottomRightX && r1BottomRightX > r2TopLeftX&& r1TopLeftY < r2BottomRightY && r1BottomRightY > r2TopLeftY)
	{
	return true;
	}
	else
	{
	return false;
	} 
	
	}
	
	}
	}
}
