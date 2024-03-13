package ensa.ma.appintro.services;

import ensa.ma.appintro.Repository.ProjetRepository;
import ensa.ma.appintro.entities.Projet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetService {
    @Autowired
    private ProjetRepository projetRepository;

    public List<Projet> getAllProjets() {
        return projetRepository.findAll();
    }

    public Projet createProjet(Projet projet) {
        return projetRepository.save(projet);
    }

    // Autres méthodes pour mettre à jour, supprimer un projet, etc.
}
