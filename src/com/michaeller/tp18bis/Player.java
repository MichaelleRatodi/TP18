/**
 * 
 */
package com.michaeller.tp18bis;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Apprenant
 *
 */
public class Player {
	List<Card> deck = new ArrayList<Card>();

	public Player(String string) {
	
	}


	/**
	 * @return the deck
	 */
	public final List<Card> getDeck() {
		return deck;
	}

	/**
	 * @param deck the deck to set
	 */
	public final void setDeck(List<Card> deck) {
		this.deck = deck;
	}
	

	
	
}
