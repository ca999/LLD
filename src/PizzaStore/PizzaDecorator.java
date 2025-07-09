package PizzaStore;

public abstract class PizzaDecorator extends Topping{
    Topping topping;
    public abstract String description();
}
