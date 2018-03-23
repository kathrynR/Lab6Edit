package Miscellaneous;
import enemy.Enemy;
import items.Items;

public class LevelUp {
	private int itemNumber = 1;
	private int enemySpeed = 1;
	private Enemy myEnemy;
	private Items myItem;
	
	// Constructor overloads
	public LevelUp(Enemy myEnemy) {
		this.myEnemy = myEnemy;
	}
	public LevelUp(Items myItem) {
		this.myItem = myItem;
	}
	public LevelUp(Enemy myEnemy, Items myItem) {
		this.myEnemy = myEnemy;
		this.myItem = myItem;
	}
	
	// This method increases the item number plus 1.
	public void increaseItemNumber() {
		myItem.setNumberOfItems(itemNumber + myItem.getnumberOfItems());
	}
	
	// This method increases enemy speed by 1.
	public void increaseEnemySpeed() {
		myEnemy.setSpeed(enemySpeed + myEnemy.getSpeed());
	}
}
