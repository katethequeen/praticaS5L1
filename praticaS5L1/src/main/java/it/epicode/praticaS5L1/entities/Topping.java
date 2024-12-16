package it.epicode.praticaS5L1.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "toppings")
public class Topping {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private Double price;
    private Integer calories;

    public Topping(String name, Double price, Integer calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }
}
