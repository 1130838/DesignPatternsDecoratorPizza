package myapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by bruno.devesa on 26-07-2015.
 */
@Entity
public class MargaritaPizza extends Pizza{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPerson;

    private String name;

    public MargaritaPizza() {
    // for ORM purposes
    }

    public MargaritaPizza(String name) {
        this.name = "Margarita";
    }

    @Override
    public double calculateCost() {
        return 12.50;
    }
}
