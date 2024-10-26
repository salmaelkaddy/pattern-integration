public class AddingMilk extends Decorator{

    public AddingMilk(Drink drink) {
        super(drink);
    }


    @Override
    public double getCost() {
        return drink.getCost() + 20.0;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + "with milk";
    }
}
