package it.epicode.praticaS5L1.repositories;

import it.epicode.praticaS5L1.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepo extends JpaRepository<Pizza, Long> {
}
