package myapp;

import myapp.bootstrapper.Bootstraper;
import myapp.model.Cheese;
import myapp.model.MargaritaPizza;
import myapp.model.Pizza;

/**
 * Created by bruno.devesa on 26-07-2015.
 */
public class MainUI {

    public void run() {
       // Bootstraper bootstraper = new Bootstraper();
       // bootstraper.execute();

        System.out.println("creating a margarita..");
        Pizza p1 = new MargaritaPizza("Margarita");
        System.out.println("the cost of a margarita is " + p1.calculateCost());

        System.out.println("creating a margarita with extra cheese..");
        Pizza p2 = new Cheese(new MargaritaPizza());
        System.out.println("the cost of a margarita with extra cheese is " + p2.calculateCost());

    }
}
