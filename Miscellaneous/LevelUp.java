package Miscellaneous;
import enemy.Enemy;
import items.Items;
/*
 * Author: Kathryn Reese
 * Partners: Hannah Hollenback, Kate Hohenstein
 * Lab 6
 * 3/10/18
 * Level Up: Created to increase the speed when the next level comes about.
 * This will also increase item numbers every level.
 */
public class LevelUp {
	private int itemNumber = 1;
	private int enemySpeed;
	private Items myItem;
	private int incrementItems = 0;
	private Enemy myEnemy;
	
	// Constructor overloads
	public LevelUp(int enemySpeed) {
		this.enemySpeed = enemySpeed;
	}
	public LevelUp(Items myItem) {
		this.myItem = myItem;
	}
	public LevelUp(Items myItem, Enemy myEnemy) {
		this.myItem = myItem;
		this.myEnemy = myEnemy;
		
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
	// This method increases enemy speed by 100.
	public void increaseEnemySpeed(int enemySpeed) {
		setEnemySpeed(enemySpeed + 100);
	}
	
	public int incrementItemNumber() {
		return 1;
	}
	
	public void gotToNextLevel() {
		myEnemy.setSpeed(myEnemy.getSpeed() + 100);
		myItem.setNumberOfItems(itemNumber + myItem.getnumberOfItems());
		
	}
}
