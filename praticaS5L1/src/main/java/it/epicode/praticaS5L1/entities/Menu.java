package it.epicode.praticaS5L1.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Entity
@Data
@NoArgsConstructor
public class Menu {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

@OneToMany(mappedBy = "menu")
    private List<Pizza> pizzas;

@OneToMany(mappedBy = "menu")
    private List<Drink> drinks;

@ManyToMany
@JoinTable(
        name = "menu_toppings",
        joinColumns = @JoinColumn(name = "menu_id"),
        inverseJoinColumns = @JoinColumn(name = "topping-id")
)
    private List<Topping> toppings;

    public Menu(List<Pizza> pizzas, List<Drink> drinks, List<Topping> toppings) {
        this.pizzas = pizzas;
        this.drinks = drinks;
        this.toppings = toppings;
    }

    public void printMenu() {
        System.out.println("Menu: ");
        System.out.println("Pizzas: ");
        for(Pizza pizza: pizzas) {
            String ingredientsName = pizza.getIngredients().stream()
                            .map(Topping::getName)
                                    .collect(Collectors.joining(", "));
            System.out.println(pizza.getName() + " - " + pizza.getCalories() + " - " + ingredientsName + " - " + pizza.getPrice());
        }

        System.out.println("Drinks: ");
        for(Drink drink : drinks) {
        }

        System.out.println("Toppings: ");
        for (Topping topping : toppings) {
            System.out.println(topping.getName() + " - " + topping.getCalories() + " - " + topping.getPrice());

        }
    }
}
