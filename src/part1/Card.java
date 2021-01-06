package part1;

public class Card {
	private char suit;
	public void setSuit(char suit)
	{		
		this.suit = suit;
	}
	
	
	public char getSuit()
	{
		switch(suit)
		{
		case 1:
			suit ='s';
			break;
		case 2:
			suit ='h';
			break;
		case 3:
			suit ='d';
			break;
		case 4:
			suit ='c';
			break;
		}
	 return suit;
	}
	public int getValue()
	{
		return (int)(Math.random() * 13+1);
	}
	
	
	

}
