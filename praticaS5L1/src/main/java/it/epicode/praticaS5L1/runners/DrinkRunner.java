package it.epicode.praticaS5L1.runners;

import it.epicode.praticaS5L1.entities.Drink;
import it.epicode.praticaS5L1.repositories.DrinkRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DrinkRunner implements ApplicationRunner {
    @Autowired
    private DrinkRepo drinkRepo;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Drinks in system: ");
        drinkRepo.findAll().forEach(drink ->

        System.out.println(drink.getName() + " - " + drink.getPrice() + "$ - " + drink.getCalories() + "cal")
                );
    }
}
