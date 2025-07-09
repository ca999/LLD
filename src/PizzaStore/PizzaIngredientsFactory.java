package PizzaStore;

public interface PizzaIngredientsFactory {
    public String createDough();
    public String createSauce();
    public String createCheese();
    public String[] createVeggies();
    public String[] createMeat();
}
