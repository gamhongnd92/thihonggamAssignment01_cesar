package part1;

import java.util.Random;

public class ModifyCard {
	private char suit;
	private String suits ="shdc";
	private int value;
	
	public void setSuit()
	{
		Random  rnd = new Random();
		suit = suits.charAt(rnd.nextInt(suits.length()));
	
	}
	public void setValue() // modify setValue() method
	{
		 if(value<1 && value>13)
		 {
			value = 1; 
		 }
		 else
		 {
			value = (int)(Math.random()* 12+1);
		 }
	
	}
	
	
	public char getSuit() {
		return suit;
	}
	
	public int getValue() {
		return value;
	}
	
	
	
	
}
