package org.iut.mastermind.domain.partie;

import java.util.Objects;

public class Joueur {

    private final String nom;

    // constructeur
    public Joueur(String nom) {
        this.nom = nom;
    }

    // getter nom joueur
    public String getNom() {
        return nom;
    }

    // equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Joueur joueur)) return false;
        return nom.equals(joueur.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nom);
    }

}
