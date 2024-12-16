package it.epicode.praticaS5L1.configuration;

import it.epicode.praticaS5L1.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ToppingConfig {

    @Bean
    public Topping prosciutto() {
        return new Topping("Prosciutto", 3.40, 5);
    }

    @Bean
    public Topping ananas() {
        return new Topping("Ananas", 2.30, 2);
    }

    @Bean
    public Topping mushrooms() {
        return new Topping("Mushrooms", 4.10, 3);
    }
}
