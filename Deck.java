package week06CodingProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	//List of array cards
	List<Card> cards = new ArrayList<Card>();

	Deck() {
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		
		for (String suit : suits) {
			int count = 2;
			for (String number : numbers) {
				Card card = new Card(number, suit, count);
				this.cards.add(card);
				count++;
			}
		}
	}
    //getters & setters
	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	//shuffle method
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	//draw method removing card 
	public Card draw() {
		Card card = this.cards.remove(0);
		return card;
	}
	
	
}
