public class Espresso implements Drink{


    @Override
    public double getCost() {
        return 250.5;
    }

    @Override
    public String getDescription() {
        return "You're ordering a double Espresso";
    }
}
