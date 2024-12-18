package it.epicode.praticaS5L1.repositories;

import it.epicode.praticaS5L1.entities.Drink;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrinkRepo extends JpaRepository<Drink, Long> {
}
