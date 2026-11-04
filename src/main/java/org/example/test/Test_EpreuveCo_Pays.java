package org.example.test;

import org.example.model.*;

public class Test_EpreuveCo_Pays {
    public static void main(String[] args) {

        Pays pays = new Pays(1, "France");

        Sport sport = new Sport(1,"Volley");

        EpreuveCollective epreuveCollective = new EpreuveCollective(1, sport,"Volley à 3",60, 4);

        ParticipationPaysEpreuveCo participation = new ParticipationPaysEpreuveCo(pays, epreuveCollective);

        System.out.println("Le pays " + participation.getPays().getNom() +" (ID: " + participation.getPays().getId() + ")," +
                " participe à l'épreuve collective "+ participation.getEpreuveCo().getNom() +" (ID: " + participation.getEpreuveCo().getId() + ").");
    }



}