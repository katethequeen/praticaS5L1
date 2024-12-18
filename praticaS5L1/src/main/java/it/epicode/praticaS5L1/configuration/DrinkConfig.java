package it.epicode.praticaS5L1.configuration;

import it.epicode.praticaS5L1.entities.Drink;
import it.epicode.praticaS5L1.repositories.DrinkRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DrinkConfig {

    @Autowired
    private DrinkRepo drinkRepo;

    @Bean
    public Drink cocaCola() {
        Drink cocaCola = new Drink("CocaCola", 2.50, 20);
        drinkRepo.save(cocaCola);
        return cocaCola;
    }

    @Bean
    public Drink water() {
        Drink water = new Drink("Water", 1.10, 3 );
        drinkRepo.save(water);
        return water;
    }

    @Bean
    public Drink soda() {
        Drink soda = new Drink("Soda", 3.00, 17);
        drinkRepo.save(soda);
        return soda;
    }
}
