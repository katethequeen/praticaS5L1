package it.epicode.praticaS5L1.runners;

import it.epicode.praticaS5L1.entities.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class PizzaRunner implements ApplicationRunner {

    @Autowired
    Pizza margherita;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Hello from PizzaRunner");
        System.out.println(margherita);
    }
}
