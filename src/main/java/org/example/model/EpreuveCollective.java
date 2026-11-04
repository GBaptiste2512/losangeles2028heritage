package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class EpreuveCollective extends  Epreuve {

    private String nom;
    private float dureeMin;
    private int nbTours;
    private List<ParticipationPaysEpreuveCo> lesParticipations = new ArrayList<>();

    public EpreuveCollective(int id,Sport sport,String nom ,float dureeMin, int nbTours) {
        super(id ,sport);
        this.nom= nom;
        this.dureeMin = dureeMin;
        this.nbTours = nbTours;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getDureeMin() {
        return dureeMin;
    }

    public void setDureeMin(float dureeMin) {
        this.dureeMin = dureeMin;
    }

    public int getNbTours() {
        return nbTours;
    }

    public void setNbTours(int nbTours) {
        this.nbTours = nbTours;
    }

    public List<ParticipationPaysEpreuveCo> getLesParticipations() {
        return lesParticipations;
    }

    public void setLesParticipations(List<ParticipationPaysEpreuveCo> lesParticipations) {
        this.lesParticipations = lesParticipations;
    }

    public int getNbPays() {
        return this.lesParticipations.size();
    }
}
