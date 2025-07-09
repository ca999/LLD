package PizzaStore;

public class PizzaDemo {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new DominosStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println(pizza);
    }
}
