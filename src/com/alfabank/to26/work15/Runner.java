package com.alfabank.to26.work15;

import java.time.DayOfWeek;

public class Runner {
    public void run() {
        System.out.println("Вывод дней");
        outInfo();
        System.out.println("Вывод Java дней");
        outInfoWorkDay();
        System.out.println("Вывод следующего дня");
        theNextDay();
        System.out.println("Вывод всех карточек");
        Card[] cards = createCardMassive();
        outCard(cards);
    }

    public void outInfo() {
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println("Day: " + day);
        }
    }
    public void outInfoWorkDay() {
        for (DayOfWeek day : DayOfWeek.values()) {
            if (day.name().equals("MONDAY") || day.name().equals("FRIDAY") || day.name().equals("WEDNESDAY")) {
                System.out.println("Java day: " + day);
            }
        }
    }
    public void theNextDay() {
        for (DaysOfWeek daysOfWeek : DaysOfWeek.values()) {
            daysOfWeek.nextDay();
        }
    }
    public Card[] createCardMassive() {
        Card[] cards = {
                new Card(Suit.CLUB, Rank.ACE),
                new Card(Suit.CLUB, Rank.EIGHT),
                new Card(Suit.CLUB, Rank.FIVE),
                new Card(Suit.CLUB, Rank.FOUR),
                new Card(Suit.CLUB, Rank.JACK),
                new Card(Suit.CLUB, Rank.KING),
                new Card(Suit.CLUB, Rank.NINE),
                new Card(Suit.CLUB, Rank.QUEEN),
                new Card(Suit.CLUB, Rank.SEVEN),
                new Card(Suit.CLUB, Rank.SIX),
                new Card(Suit.CLUB, Rank.TEN),
                new Card(Suit.CLUB, Rank.THREE),
                new Card(Suit.CLUB, Rank.TWO),
                new Card(Suit.DIAMOND, Rank.ACE),
                new Card(Suit.DIAMOND, Rank.EIGHT),
                new Card(Suit.DIAMOND, Rank.FIVE),
                new Card(Suit.DIAMOND, Rank.FOUR),
                new Card(Suit.HEART, Rank.JACK),
                new Card(Suit.HEART, Rank.KING),
                new Card(Suit.HEART, Rank.NINE),
                new Card(Suit.HEART, Rank.QUEEN),
                new Card(Suit.SPADE, Rank.SEVEN),
                new Card(Suit.SPADE, Rank.SIX),
                new Card(Suit.SPADE, Rank.TEN),
                new Card(Suit.SPADE, Rank.THREE),
                new Card(Suit.SPADE, Rank.TWO)
        };
        return cards;
    }
    public void outCard(Card[] cards){
        for (Card card : cards){
            System.out.println(card);
        }
    }

}
