package org.example.test;

import org.example.model.*;

public class Test_Methodes{
    public static void main(String[] args) {

        Pays france = new Pays(1, "France");
        Sport volley = new Sport(1, "Volley");

        EpreuveCollective epreuveCo = new EpreuveCollective(1, volley, "Volley à 3", 60, 3);

        epreuveCo.getLesParticipations().add(new ParticipationPaysEpreuveCo(france, epreuveCo));
        System.out.println("Nb pays : " + epreuveCo.getNbPays()); // resultat attendu = 1

        france.getLesAthletes().add(new Athlete(1, "Athlete 1"));
        france.getLesAthletes().add(new Athlete(2, "Athlete 2"));
        france.getLesAthletes().add(new Athlete(3, "Athlete 3"));
        System.out.println("Nb athlètes : " + france.getNbAthletes()); // resultat attendu = 3

        Medaille or = new Medaille(1, "Or", 5);
        Medaille argent = new Medaille(1, "Argent", 3);
        Medaille argent1 = new Medaille(1, "Argent", 3);
        Medaille argent2 = new Medaille(1, "Argent", 3);

        france.getLesMedailles().add(new PaysMedaille(france, or));
        france.getLesMedailles().add(new PaysMedaille(france, argent));
        france.getLesMedailles().add(new PaysMedaille(france, argent1));
        france.getLesMedailles().add(new PaysMedaille(france, argent2));

        System.out.println("Nb médailles d'or : " + france.getNbMedaillesOr()); // resultat attendu = 1
        System.out.println("Nb médailles d'argent : " + france.getNbMedaillesArgent()); // resultat attendu = 3
        System.out.println("Total points : " + france.getNbPoints()); // resultat attendu = 14
    }
}