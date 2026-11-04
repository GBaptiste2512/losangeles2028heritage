package org.example.model;

public class Medaille {
    private int id;
    private String nom;
    private int nbPoints;

    public Medaille(int id, String nom, int nbPoints) {
        this.id = id;
        this.nom = nom;
        this.nbPoints = nbPoints;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbPoints() {
        return nbPoints;
    }

    public void setNbPoints(int nbPoints) {
        this.nbPoints = nbPoints;
    }
}
