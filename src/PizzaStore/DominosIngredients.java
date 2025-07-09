package PizzaStore;

public class DominosIngredients implements PizzaIngredientsFactory{

    @Override
    public String createDough() {
        return "domnios dough";
    }

    @Override
    public String createSauce() {
        return "domnios sauce";
    }

    @Override
    public String createCheese() {
        return "domnios cheese";
    }

    @Override
    public String[] createVeggies() {
        return new String[0];
    }

    @Override
    public String[] createMeat() {
        return new String[0];
    }
}
