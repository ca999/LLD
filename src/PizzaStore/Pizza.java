package PizzaStore;

import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings;

    abstract void prepare();
    void bake() {
        System.out.println("Baking " + name);
    }
    void cut() {
        System.out.println("Cutting " + name);
    }
    void pack() {
        System.out.println("Boxing " + name);
    }
}
