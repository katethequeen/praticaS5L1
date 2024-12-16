package it.epicode.praticaS5L1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "menu")
public class Menu {
    private List<Pizza> pizzas;
    private List<Drink> drinks;

    public void printMenu() {
        System.out.println("Menu: ");
        System.out.println("Pizzas: ");
        for(Pizza pizza: pizzas) {
            System.out.println(pizza.getName() + " - " + pizza.getCalories() + " - " + String.join(", ",pizza.getIngredients()) + " - " + pizza.getPrice());
        }

        System.out.println("Drinks: ");
        for(Drink drink : drinks) {
            System.out.println(drink.getName() + " - " + drink.getCalories() + " - " + drink.getPrice());
        }
    }
}
