
public class Player {

	private String name;
	private int x;
	private int y;
	private String imagePath;
	private int score;
	
	public Player(String name, int x, int y, String imagePath, int score)
	{
		this.name = name;
		this.x = x;
		this.y  = y;
		this.imagePath = imagePath;
		this.score = score;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
}