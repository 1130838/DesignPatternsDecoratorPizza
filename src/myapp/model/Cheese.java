package myapp.model;

/**
 * Created by bruno.devesa on 26-07-2015.
 */
public class Cheese  extends CondimentDecorator{
    Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double calculateCost() {
        return 0.80 + pizza.calculateCost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", extra cheese";
    }
}
