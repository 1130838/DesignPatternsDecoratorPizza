package myapp;

import myapp.bootstrapper.Bootstraper;
import myapp.model.Cheese;
import myapp.model.Jalapenos;
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

        System.out.println("\ncreating a margarita with extra cheese..");
        Pizza p2 = new Cheese(new MargaritaPizza());
        System.out.println("the cost of a margarita with extra cheese is " + p2.calculateCost());

        System.out.println("\ncreating a margarita with extra cheese and extra jalapenos..");

        // can be like this:
        //Pizza p3 = new Jalapenos(new Cheese(new MargaritaPizza()));

        // or like this: (better)
        Pizza p3 = new MargaritaPizza();
        p3 = new Cheese(p3);
        p3 = new Jalapenos(p3);

        System.out.println("the cost of a margarita with extra cheese and extra jalapenos is " + p3.calculateCost());

    }
}
