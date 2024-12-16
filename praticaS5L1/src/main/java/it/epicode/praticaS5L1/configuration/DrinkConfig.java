package it.epicode.praticaS5L1.configuration;

import it.epicode.praticaS5L1.entities.Drink;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DrinkConfig {

    @Bean
    public Drink cocaCola() {
        return new Drink("CocaCola", 2.50, 20);
    }

    @Bean
    public Drink water() {
        return new Drink("Water", 1.10, 3 );
    }

    @Bean
    public Drink Soda() {
        return new Drink("Soda", 3.00, 17);
    }
}
