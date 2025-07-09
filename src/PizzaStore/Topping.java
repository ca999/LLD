package PizzaStore;

public abstract class Topping {
    private String name;

    public abstract double cost();

    public String getName() {
        return name;
    }

}
