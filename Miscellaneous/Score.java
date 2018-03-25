package Miscellaneous;

public class Score {
	private int playerScore;
	private Integer[] topThreeScores = {0, 0, 0};

	public int getPlayerScore() {
		return playerScore;
		
	}

	public void setPlayerScore(int playerScore) {
		this.playerScore = playerScore;
	}
	//calculate and store top 3 scores and accompanying player info
		// Kathryn: added calculate to the beginning of method name to distinguish it from the other method
		// Kathryn: Method will add the top three scores to an array.
		public void calculateTopThree()
		{	
			if(getPlayerScore() > topThreeScores[0]) {
				topThreeScores[0] = getPlayerScore();
			}
			else if(getPlayerScore() > topThreeScores[1]) {
				topThreeScores[1] = getPlayerScore();
			}
			else if(getPlayerScore() > topThreeScores[2]) {
				topThreeScores[2] = getPlayerScore();
			}
		}
	
		// display top 3 scores and accompanying player info
		// Kathryn: This method will display the top three scores in a JLabel.
		/*???????????????????????????????????????????????????????????????????????????
		 * 
		 * NOTE: We only have to display the top three high scores. Not scores from
		 * different players.
		 * 
		 ????????????????????????????????????????????????????????????????????????????*/
			public String showTopThree()
			{
				calculateTopThree();
				String scoresString = "<html><body>Top Score: " + topThreeScores[0] + "\n" +
									  "Second Top Score: " + topThreeScores[1] + "\n" +
									  "Third Top Score: " + topThreeScores[2] + "\n</body></html>";
				return scoresString;
			}

}

