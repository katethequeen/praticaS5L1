package it.epicode.praticaS5L1.configuration;

import it.epicode.praticaS5L1.entities.Topping;
import it.epicode.praticaS5L1.repositories.ToppingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ToppingConfig {

    @Autowired
    private ToppingRepo toppingRepo;

    @Bean
    public Topping prosciutto() {

        Topping prosciutto = new Topping("Prosciutto", 3.40, 5);
        toppingRepo.save(prosciutto);
        return prosciutto;
    }

    @Bean
    public Topping ananas() {

        Topping ananas = new Topping("Ananas", 2.30, 2);
        toppingRepo.save(ananas);
        return ananas;
    }

    @Bean
    public Topping mushrooms() {

        Topping mushrooms = new Topping("Mushrooms", 4.10, 3);
        toppingRepo.save(mushrooms);
        return mushrooms;
    }
}
