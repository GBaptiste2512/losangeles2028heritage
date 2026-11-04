package org.example.test;

import org.example.model.*;

public class Test_EpreuveCo_Pays {
    public static void main(String[] args) {
        Pays france = new Pays(1, "France");
        Pays espagne = new Pays(2, "Espagne");

        Sport volley = new Sport(1, "Volley");

        EpreuveCollective epreuveCo = new EpreuveCollective(1, volley, "Volley à 3", 90, 4);

        epreuveCo.getLesParticipations().add(new ParticipationPaysEpreuveCo(france, epreuveCo));
        epreuveCo.getLesParticipations().add(new ParticipationPaysEpreuveCo(espagne, epreuveCo));

        System.out.println("Épreuve : " + epreuveCo.getNom() + " (Sport : " + epreuveCo.getSport().getNom() + ")");
        System.out.println("Durée min : " + epreuveCo.getDureeMin() + " min | Nombre de tours : " + epreuveCo.getNbTours());
        System.out.println("Nombre total de pays participants : " + epreuveCo.getNbPays());

        System.out.println("Liste des participants :");
        for (ParticipationPaysEpreuveCo p : epreuveCo.getLesParticipations()) {
            System.out.println("- " + p.getPays().getNom());
        }
    }
}