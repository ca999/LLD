package PizzaStore;

public class DominosStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        PizzaIngredientsFactory pizzaIngredientsFactory = new DominosIngredients();
        if(type.equals("cheese")){
            return new CheesePizza(pizzaIngredientsFactory);
        }
        return  new TandooriPizza(pizzaIngredientsFactory);

    }
}
