package com.michaeller.tp18bis;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TP18bis {

	/**Poker français
	 * @param args
	 */
	public static void main(String[] args) {
		Deck pokerDeck = new Deck();

		pokerDeck.print();
		
		//position aléatoire des cartes dans le deck (le paquet de départ contient 32 cartes)
		Random rand = new Random();
		
		int tableauPosition[] = new int[32];
		
		//Card cards = new Card(CardValue, Family);
		
		for (int i = 32; i > 1; i--) {
		
		tableauPosition[i] = rand.nextInt(i);
		}
	//liste de joueurs
	List<Player>players = Arrays.asList(
			 new Player("humain"),
			 new Player("ai"));
	//attribution des cartes à chaque joueur
			 	pokerDeck.getDeck().add(tableauPosition[1], new Card(new CardValue(7), new Coeur()));
				pokerDeck.getDeck().add(tableauPosition[3], new Card(new CardValue(14), new Carreau()));
				pokerDeck.getDeck().add(tableauPosition[5], new Card(new CardValue(11), new Pique()));
				pokerDeck.getDeck().add(tableauPosition[7], new Card(new CardValue(10), new Coeur()));
				pokerDeck.getDeck().add(tableauPosition[9],new Card(new CardValue(8), new Coeur()));
				players.get(0).setDeck(pokerDeck.getDeck());
				pokerDeck = new Deck();
				//pour remettre à 0, on déclare Deck vide pour qu'on ne reprenne plus les mêmes cartes
				pokerDeck.getDeck().add(tableauPosition[2], new Card(new CardValue(12), new Coeur()));
				pokerDeck.getDeck().add(tableauPosition[4], new Card(new CardValue(14), new Pique()) );
				pokerDeck.getDeck().add(tableauPosition[6], new Card(new CardValue(11), new Carreau()));
				pokerDeck.getDeck().add(tableauPosition[8], new Card(new CardValue(7), new Trefle()));
				pokerDeck.getDeck().add(tableauPosition[10], new Card(new CardValue(10), new Trefle()));
				players.get(1).setDeck(pokerDeck.getDeck());
				pokerDeck = new Deck();
				
		//sélection de 0 à 3 cartes à jeter par joueur
				pokerDeck.getDeck().remove(tableauPosition[3]);
				pokerDeck.getDeck().remove(tableauPosition[5]);
				pokerDeck.getDeck().remove(tableauPosition[8]);
				
		//remplacement par de nouvelles cartes
				pokerDeck.getDeck().add(tableauPosition[11], new Card(new CardValue(14), new Coeur()));
				pokerDeck.getDeck().add(tableauPosition[13], new Card(new CardValue(11), new Coeur()));
				players.get(0).setDeck(pokerDeck.getDeck());
				pokerDeck = new Deck();
				pokerDeck.getDeck().add(tableauPosition[14], new Card(new CardValue(12), new Trefle()));
				players.get(1).setDeck(pokerDeck.getDeck());
				pokerDeck = new Deck();
				
		//jeu
				
	}
}
