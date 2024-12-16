package it.epicode.praticaS5L1.configuration;

import it.epicode.praticaS5L1.entities.Pizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class PizzaConfig {

    @Bean
    Pizza getPizza() {
        Pizza margherita = new Pizza();
        margherita.setName("margherita");
        margherita.setPrice(5.99);
        margherita.setCalories(1104);
        margherita.setIngredients(Arrays.asList("tomato", "mozzarella"));
        return margherita;
    }
}
