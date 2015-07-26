package myapp.model;

/**
 * Created by bruno.devesa on 26-07-2015.
 */
public class Jalapenos extends CondimentDecorator {
    Pizza pizza;

    public Jalapenos(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double calculateCost() {
        return pizza.calculateCost() + 1.20;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", extra jalapenos";
    }
}
