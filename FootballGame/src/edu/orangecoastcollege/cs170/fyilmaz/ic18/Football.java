package edu.orangecoastcollege.cs170.fyilmaz.ic18;

public class Football 
{
	// Fields
	private String mHomeTeam;
	private String mVisitorTeam;
	private int mHomeScore;
	private int mVisitorScore;
	
	// Constructor
	
	public Football(String homeTeam, String visitorTeam) 
	{
		
		mHomeTeam = homeTeam;
		mVisitorTeam = visitorTeam;
		mHomeScore = 0;
		mVisitorScore = 0;
	}

	public String getHomeTeam() {
		return mHomeTeam;
	}

	public void setHomeTeam(String homeTeam) {
		mHomeTeam = homeTeam;
	}

	public String getVisitorTeam() {
		return mVisitorTeam;
	}

	public void setVisitorTeam(String visitorTeam) {
		mVisitorTeam = visitorTeam;
	}

	public int getHomeScore() {
		return mHomeScore;
	}

	public void setHomeScore(int homeScore) {
		mHomeScore = homeScore;
	}

	public int getVisitorScore() {
		return mVisitorScore;
	}

	public void setVisitorScore(int visitorScore) {
		mVisitorScore = visitorScore;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + mHomeScore;
		result = prime * result + ((mHomeTeam == null) ? 0 : mHomeTeam.hashCode());
		result = prime * result + mVisitorScore;
		result = prime * result + ((mVisitorTeam == null) ? 0 : mVisitorTeam.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Football other = (Football) obj;
		if (mHomeScore != other.mHomeScore)
			return false;
		if (mHomeTeam == null) {
			if (other.mHomeTeam != null)
				return false;
		} else if (!mHomeTeam.equals(other.mHomeTeam))
			return false;
		if (mVisitorScore != other.mVisitorScore)
			return false;
		if (mVisitorTeam == null) {
			if (other.mVisitorTeam != null)
				return false;
		} else if (!mVisitorTeam.equals(other.mVisitorTeam))
			return false;
		return true;
	}

	@Override
	public String toString() 
	{
		String message;
		
		if (mHomeScore> mVisitorScore)
			message= "Home team is winning!";
		else if (mHomeScore == mVisitorScore)
			message= "It's a tie.";
		else
			message= "Visitor team is winning :(";
		
		return "\nFootball [" + mHomeTeam + "=" + mHomeScore +"," 
							+ mVisitorTeam +"=" + mVisitorScore + "~~" 
							+ message + "]";
				
	}
	
	// Miscellaneous Method
	public boolean scoreTouchdown(String teamName)
	{
		// Figure out the team to score 6 points
		if (teamName.equals(mHomeTeam))
		{
			mHomeScore+=6;
			return true;
		}
		else if (teamName.equals(mVisitorTeam))
		{
			mVisitorScore+=6;
			return true;
		}
		else 
			return false;
	}
	
	public boolean scoreExtraPoint(String teamName) 
	{
		if (teamName.equals(mHomeTeam))
		{
			mHomeScore+=1;
			return true;
		}
		else if (teamName.equals(mVisitorTeam))
		{
			mVisitorScore+=1;
			return true;
		}
		else 
			return false;
		
	}
	public boolean scoreConversion(String teamName) 
	{
		if (teamName.equals(mHomeTeam))
		{
			mHomeScore+=2;
			return true;
		}
		else if (teamName.equals(mVisitorTeam))
		{
			mVisitorScore+=2;
			return true;
		}
		else 
			return false;
		
	}
	public boolean scoreFieldGoal(String teamName) 
	{
		if (teamName.equals(mHomeTeam))
		{
			mHomeScore+=3;
			return true;
		}
		else if (teamName.equals(mVisitorTeam))
		{
			mVisitorScore+=3;
			return true;
		}
		else 
			return false;
		
	}
	public boolean scoreSafety(String teamName) 
	{
		if (teamName.equals(mHomeTeam))
		{
			mHomeScore+=2;
			return true;
		}
		else if (teamName.equals(mVisitorTeam))
		{
			mVisitorScore+=2;
			return true;
		}
		else 
			return false;
		
	}
	

}
