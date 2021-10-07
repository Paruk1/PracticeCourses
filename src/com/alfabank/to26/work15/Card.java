package com.alfabank.to26.work15;

public class Card {
    Suit suit;
    Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Card: " + suit + " " + rank;
    }

    public Suit getSuit() {
        return suit;
    }
    public void setSuit(Suit suit) {
        this.suit = suit;
    }
    public Rank getRank() {
        return rank;
    }
    public void setRank(Rank rank) {
        this.rank = rank;
    }

}
