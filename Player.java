package week06CodingProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	//List of array 
	List<Card> hand = new ArrayList<Card>();
	private String name;
	private String suit;
	private String value;
	//---------also could really understand what i need to perform or write above 2.score (set to 0 in the constructor)---------------
	public Player(String name, String suit, int value) {
		this(name,suit, value, 0);
	}
    //-----------also could really understand what i need to perform or write above 2.score (set to 0 in the constructor)---------------
	private Player(String name, String suit, int value, Object score) {
	}
	
	//setter & getters for Hand
	
	public Player(String string) {
		// TODO Auto-generated constructor stub
	}
	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
    //At first describe method wasn't working Eclipse helped with set player in (unsure of what it did but the errors went away)
	public void describe() {
    	System.out.println(this.name + " of " + this.suit + " -- " + this.value);
    }
	//added suppress warning unsure of what i was doing and how i should perform the coding eclipse autogen 
	// eclipse made it error free by adding variable in 
	// 3.     draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
    //4.     incrementScore (adds 1 to the Player’s score field)

	@SuppressWarnings("null")
	//public Card draw() {
	//	List<Card> card = null;
	//	if (card.isEmpty()) {
	//		return null;
	//	}
	//	List<Card> cards = null;
	//	Card card1 = cards.remove(0);
	//	return card1;
	//}
	
	//@SuppressWarnings("null")
	//public void returnToDeck(Card card) {
	//	List<Card> cards = null;
	//	cards.add((Card) hand);
	//}
	public void addCardToHand(Card drawnCard) {
		// TODO Auto-generated method stub
		
	}
	public void flip() {
		// TODO Auto-generated method stub
		
	}
	
	//problem area i did not understand how to write the code unsure of what this does eclipse autogen 

}
