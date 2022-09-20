package com.tlglearning.cards;

import com.tlglearning.cards.model.Deck;
import java.security.SecureRandom;
import java.util.Random;

public class Main {

  public static void main(String[] args) {
    Deck deck = new Deck();
    System.out.println(deck);
    Random rng = new SecureRandom();
    deck.shuffle(rng);
    System.out.println(deck);
    // TODO: 9/19/22 Print the string representation of the deck after shuffling.
  }

}
