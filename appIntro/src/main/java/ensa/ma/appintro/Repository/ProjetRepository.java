package ensa.ma.appintro.Repository;

import ensa.ma.appintro.entities.Projet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetRepository extends JpaRepository<Projet, Long> {
}
