package it.epicode.praticaS5L1.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Drink extends Item{
    private String name;

    @ManyToOne
    private Menu menu;

    public Drink(String name, Double price, Integer calories) {

        super(price, calories);
        this.name = name;
    }

}
