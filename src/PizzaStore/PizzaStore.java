package PizzaStore;

public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.pack();
        return pizza;
    }

    public abstract Pizza createPizza(String type);


}
