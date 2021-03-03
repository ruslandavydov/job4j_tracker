package ru.job4j.map;

import java.util.Objects;

public class Card {
    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public Value getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this != o) {
            if (o != null && getClass() == o.getClass()) {
                Card card = (Card) o;
                return suit == card.suit && value == card.value;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, value);
    }
}
