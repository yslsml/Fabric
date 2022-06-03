package entity;

import exception.BadClothesException;
import valid.ValidClothes;

import java.util.Objects;

public abstract class Сlothes implements IFabric {
    private int size;
    private Color color;

    public Сlothes(int size, Color color) throws BadClothesException {
        setSize(size);
        setColor(color);
    }

    public void setSize(int size) throws BadClothesException {
        if (ValidClothes.isValidSize(size)) {
            this.size = size;
        }
        else throw new BadClothesException("Bad size of clothes exception!");
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Сlothes сlothes = (Сlothes) o;
        return getSize() == сlothes.getSize() && getColor() == сlothes.getColor();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSize(), getColor());
    }

    @Override
    public String wash() {
        return "Сlothes should be washed in the washing machine.";
    }

    @Override
    public String iron() {
        return "Сlothes should be ironed with an iron.";
    }

    @Override
    public String dry() {
        return "Clothes should be dried on the dryer.";
    }

    @Override
    public String toString() {
        return "\n[" +
                "size = " + size +
                ", color = " + color +
                "]";
    }
}
