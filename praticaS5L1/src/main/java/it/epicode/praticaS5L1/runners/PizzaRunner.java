package it.epicode.praticaS5L1.runners;

import it.epicode.praticaS5L1.entities.Pizza;
import it.epicode.praticaS5L1.entities.Topping;
import it.epicode.praticaS5L1.repositories.PizzaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class PizzaRunner implements ApplicationRunner {

    @Autowired
    private PizzaRepo pizzaRepo;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Pizzas in system: ");
        pizzaRepo.findAll().forEach(pizza -> {
            String ingredientsName = pizza.getIngredients().stream()
                            .map(Topping::getName)
                                    .collect(Collectors.joining(", "));
        System.out.println(pizza.getName() + " - " + pizza.getPrice() + "$ - " + pizza.getCalories() + " cal - \nIngredienti: " + ingredientsName);
                }


                );
    }
}
