package it.epicode.praticaS5L1.configuration;

import it.epicode.praticaS5L1.entities.Pizza;
import it.epicode.praticaS5L1.entities.Topping;
import it.epicode.praticaS5L1.repositories.PizzaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class PizzaConfig {

    @Autowired
    private PizzaRepo pizzaRepo;

    @Bean
    public Pizza margherita() {
        Pizza margherita = new Pizza("Margherita", 4.99, 30, new ArrayList<>());
        pizzaRepo.save(margherita);
        return margherita;
    }

    @Bean
    public Pizza hawaiian(@Autowired Topping prosciutto, @Autowired Topping ananas) {
        Pizza hawaiian = new Pizza("Hawaian", 99.0, 900, new ArrayList<>());
        hawaiian.addTopping(prosciutto);
        hawaiian.addTopping(ananas);
        pizzaRepo.save(hawaiian);
        return hawaiian;
    }

    @Bean
    public Pizza prosciuttoFunghi(@Autowired Topping prosciutto, @Autowired Topping mushrooms) {
        Pizza prosciuttoFunghi = new Pizza("Prosciutto and Funghi", 10.80, 44, new ArrayList<>());
        prosciuttoFunghi.addTopping(prosciutto);
        prosciuttoFunghi.addTopping(mushrooms);
        pizzaRepo.save(prosciuttoFunghi);
        return prosciuttoFunghi;
    }
}
