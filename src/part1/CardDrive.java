package part1;

public class CardDrive {

	public static void main(String[] args) {
		Card my = new Card();
		my.setSuit('s');
		my.getValue();
		
		Card your = new Card();
		your.setSuit('h');
		your.getValue();
		System.out.println("My card is the "+my.getValue()+" of "+my.getSuit());
		System.out.println("Your card is the "+my.getValue()+" of "+your.getSuit());

	}

}
