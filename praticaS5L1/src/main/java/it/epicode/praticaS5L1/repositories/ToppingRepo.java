package it.epicode.praticaS5L1.repositories;

import it.epicode.praticaS5L1.entities.Topping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToppingRepo extends JpaRepository<Topping, Long> {
}
