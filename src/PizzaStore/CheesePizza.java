package PizzaStore;

public class CheesePizza extends Pizza {
    PizzaIngredientsFactory ingredientsFactory;

    public CheesePizza(PizzaIngredientsFactory ingredientsFactory) {
        name = "Cheese Pizza";
        dough = "Cheese Dough";
        sauce = "Cheese Sauce";
        this.ingredientsFactory = ingredientsFactory;
    }

    @Override
    void prepare() {
        ingredientsFactory.createCheese();
        ingredientsFactory.createSauce();
        ingredientsFactory.createDough();
    }
}
