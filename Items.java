
public class Items {
	private int x;
	private int y;
	private String imagePath;
	
	public Items(int x, int y, String imagePath)
	{
		this.x = x;
		this.y = y;
		this.imagePath = imagePath;
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
	
	public void setItems(int level) {
		
		if (level == 0)
		{
			
		}
	}
	
	
}