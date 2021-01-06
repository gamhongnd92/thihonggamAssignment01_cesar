package part1;

public class ModifyCardDrive {

	public static void main(String[] args) {
		
				
		ModifyCard card1 = new ModifyCard();
		card1.setSuit();
		card1.setValue();
		
		ModifyCard card2;
		do {
			card2 = new ModifyCard();
			card2.setSuit();
			card2.setValue();
			
		} while(compareCards(card1, card2));
		
		
		System.out.println("my card is the "+card1.getValue()+" of "+card1.getSuit());
		System.out.println("your card is the "+card2.getValue()+" of "+card2.getSuit());
		Gem(card1, card2);
		
		
	}
	public static void Gem(ModifyCard c1, ModifyCard c2)
	{
	
		if(c1.getValue()>c2.getValue())
		{
			System.out.println("I win");
		}
		else if(c1.getValue()<c2.getValue())
		{
			System.out.println("You win");
		}
		else if(c1.getValue()==c2.getValue())
		{
			System.out.println("both win");
		}
	}
	
	public static boolean compareCards(ModifyCard c1, ModifyCard c2) {
		
		if(c1.getSuit()==c2.getSuit() && c1.getValue()==c2.getValue()) {
			return true;
		} else {
			return false;
		}
	}
	

}
