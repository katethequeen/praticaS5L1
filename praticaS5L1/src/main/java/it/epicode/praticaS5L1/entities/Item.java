package it.epicode.praticaS5L1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "items")
public abstract class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    protected Long id;
    protected Double price;
    protected Integer calories;


    public Item( Double price, Integer calories) {

        this.price = price;
        this.calories = calories;
    }
}
