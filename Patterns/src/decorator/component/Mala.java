package src.decorator.component;

public abstract class Mala {

    int size = 1;
    String description = "마라 요리";

    public String getDescription() {
        return description;
    }

    public int getSize() {
        return size;
    }

    public abstract double cost();
}
