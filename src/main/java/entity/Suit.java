package entity;

import exception.BadClothesException;

import java.util.Objects;

public class Suit extends Сlothes {
    private boolean isMale;

    public Suit(int size, Color color, boolean isMale) throws BadClothesException {
        super(size, color);
        setIsMale(isMale);
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    public boolean getIsMale() {
        return isMale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Suit suit = (Suit) o;
        return isMale == suit.isMale;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isMale);
    }

    @Override
    public String wash() {
        return "Suit should be dry-cleaned.";
    }

    @Override
    public String iron() {
        return "Suit should be ironed with a steam iron.";
    }

    @Override
    public String dry() {
        return "Suit should dry on a hanger.";
    }

    @Override
    public String toString() {
        return "\nSuit {" +
                "\nisMale = " + isMale +
                super.toString() +
                "\n}";
    }
}
