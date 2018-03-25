package Miscellaneous;
import enemy.Enemy;
import items.Items;

public class LevelUp {
	private int itemNumber = 1;
	private int enemySpeed;
	private Items myItem;
	private int incrementItems = 0;
	
	// Constructor overloads
	public LevelUp(int enemySpeed) {
		this.enemySpeed = enemySpeed;
	}
	public LevelUp(Items myItem) {
		this.myItem = myItem;
	}
	
	// This method increases the item number plus 1.
	public void increaseItemNumber() {
		myItem.setNumberOfItems(itemNumber + myItem.getnumberOfItems());
	}
	public int getEnemySpeed() {
		return enemySpeed;
	}
	public void setEnemySpeed(int enemySpeed) {
		this.enemySpeed = enemySpeed;
	}
	// This method increases enemy speed by 1.
	public void increaseEnemySpeed(int enemySpeed) {
		setEnemySpeed(enemySpeed + 100);
	}
	
	public int incrementItemNumber() {
		return 1;
	}
}
