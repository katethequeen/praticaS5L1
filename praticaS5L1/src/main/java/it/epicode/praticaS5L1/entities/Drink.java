package it.epicode.praticaS5L1.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "drinks")
public class Drink {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private Double price;
    private Integer calories;

    public Drink(String name, Double price, Integer calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }
}
