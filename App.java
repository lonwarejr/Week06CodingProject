package week06CodingProject;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
	    
	    
	    Deck deck = new Deck();
	    deck.shuffle();	    
	    
	    }
		
		//Instantiate a Deck and 2 players, call the Shuffle method on the deck
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
        
        
        //A a traditional for loop, iterate 52 times calling the Draw method on the other player each 
        //iteration using the Deck you instantiated
       // for (int i = 0; i < 52; i++) {
        //	Card cardInHand = deck.draw();
		//	  if (cardInHand != null) {
        //		player1.addCardToHand(cardInHand);
        //	} else {
        //		System.out.println("Card Drawn");
        //		break;
        //	}
        //	cardInHand = deck.draw();
        //	if (cardInHand != null) {
        //		player2.addCardToHand(cardInHand);
        //	} else {
	     //    System.out.println("Card Drawn");
	    //     break;
        //  }
        //}
        //A traditional for loop, iterate 26 times and call the flip method for each player
       // for (int i = 0; i < 26; i++) {
       // player1.flip();
       // player2.flip();
      //  }
        
        deck.shuffle();
	}
	    
        
	}
	

}
