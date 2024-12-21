import java.util.ArrayList;
import java.util.List;

public class CoffeeBuilder {
    private String type;
    private List<String> toppings = new ArrayList<>();


    public CoffeeBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public CoffeeBuilder addTopping(String topping) {
        toppings.add(topping);
        return this;
    }
    public Drink build() {
        if (type.equals("Espresso")) {
            return new Espresso();
        } else {
            System.out.println("No other types");
        }

        // Add toppings using decorators
        Drink drink = new Espresso();
        for (String topping : toppings) {
            if (topping.equals("Milk")) {
                drink = new AddingMilk(drink);
            }
        }

        return drink;
    }
}
