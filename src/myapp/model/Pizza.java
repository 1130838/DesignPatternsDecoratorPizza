package myapp.model;

/**
 * Created by bruno.devesa on 26-07-2015.
 */
public abstract class Pizza {


    public String description = "unknown description";
    public abstract double calculateCost();

    public String getDescription() {
        return description;
    }


}
