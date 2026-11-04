package org.example.model;

public class EpreuveCollective extends  Epreuve {

    private String nom;
    private float dureeMin;
    private int nbTours;

    public EpreuveCollective(int id,String nom ,float dureeMin, int nbTours) {
        super(id);
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
}
