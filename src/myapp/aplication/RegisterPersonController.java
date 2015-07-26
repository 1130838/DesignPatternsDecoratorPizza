package myapp.aplication;

import myapp.model.MargaritaPizza;
import myapp.persistence.PersonRepository;
import myapp.persistence.impl.PersonRepositoryImpl;

/**
 * Created by bruno.devesa on 26-07-2015.
 */
public class RegisterPersonController {

    public MargaritaPizza addPerson(String name){
        MargaritaPizza margaritaPizza = new MargaritaPizza(name);
        return registerPerson(margaritaPizza);
    }

    public MargaritaPizza registerPerson(MargaritaPizza margaritaPizza){
        PersonRepository repository = new PersonRepositoryImpl();
        return repository.add(margaritaPizza);
    }

}
