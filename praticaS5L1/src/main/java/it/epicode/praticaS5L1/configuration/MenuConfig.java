package it.epicode.praticaS5L1.configuration;

import it.epicode.praticaS5L1.entities.Drink;
import it.epicode.praticaS5L1.entities.Menu;
import it.epicode.praticaS5L1.entities.Pizza;
import it.epicode.praticaS5L1.entities.Topping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class MenuConfig {

    // Call Pizzas
        @Autowired
                private Pizza margherita;

        @Autowired
                private Pizza hawaiian;

        @Autowired
                private Pizza prosciuttoFunghi;

    // Call Drinks
        @Autowired
        private Drink cocaCola;

        @Autowired
        private Drink water;

        @Autowired
        private Drink soda;

    // Call Toppings
    @Autowired
    private Topping prosciutto;

    @Autowired
    private Topping ananas;

    @Autowired
    private Topping mushrooms;

    @Bean
    public Menu menu(){
        List<Pizza> pizzas = List.of(margherita, hawaiian, prosciuttoFunghi);
        List<Drink> drinks = List.of(cocaCola, water, soda);
        List<Topping> toppings = List.of(prosciutto, ananas, mushrooms);

        return new Menu(pizzas, drinks, toppings);

    }
}
