package it.epicode.praticaS5L1.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Topping extends Item{
    private String name;

    //Relazione
    @ManyToMany(mappedBy = "ingredients")
    private List<Pizza> pizzas;

    public Topping(String name, Double price, Integer calories) {
        super(price, calories);
        this.name = name;
    }

}
