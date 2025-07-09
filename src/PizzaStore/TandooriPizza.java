package PizzaStore;

public class TandooriPizza extends Pizza {
    PizzaIngredientsFactory ingredientsFactory;
    public TandooriPizza(PizzaIngredientsFactory ingredientsFactory) {
        name = "Tandoori";
        dough = "Dough";
        sauce = "Sauce";
        toppings.add("Cheese");
        this.ingredientsFactory = ingredientsFactory;
    }


    @Override
    void prepare() {

    }
}
