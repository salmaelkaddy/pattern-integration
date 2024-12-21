public class Decorator implements Drink{

    Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public double getCost() {
        return drink.getCost();
    }

    @Override
    public String getDescription() {
        return drink.getDescription();
    }
}
