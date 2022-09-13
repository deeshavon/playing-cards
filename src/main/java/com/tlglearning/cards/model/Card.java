package com.tlglearning.cards.model;
//import statements are always after the package code line (#1) above

public class Card {

  private final Rank rank;
  private final Suit suit;

  public Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public Rank rank() {
    return rank;
  }

  public Suit suit() {
    return suit;
  }

  @Override
  public String toString() {
    return rank.symbol() + suit.symbol();
  }

  // TODO: 9/13/22 Override equals method. 
  // TODO: 9/13/22 Override hashCode method. 
}
