package ensa.ma.appintro.Repository;

import ensa.ma.appintro.entities.Livrable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivrableRepository extends JpaRepository<Livrable, Long> {
}