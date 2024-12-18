package it.epicode.praticaS5L1.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Pizza extends Item {

    private String name;

    @ManyToOne
    private Menu menu;

    //Relazione
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "pizza_toppings",
            joinColumns = @JoinColumn(name = "pizza_id"),
            inverseJoinColumns = @JoinColumn(name = "topping_id")
    )
    private List<Topping> ingredients;

    public Pizza(String name, Double price, Integer calories, List<Topping> ingredients) {
        super(price, calories);
        this.name = name;
        this.ingredients = ingredients;
    }

    public void addTopping(Topping topping) {
        this.price += topping.getPrice();
        this.calories += topping.getCalories();
        this.ingredients.add(topping);
    }
}
