package org.example.model;

public class Athlete {
    private int id;
    private String nom;
    private Pays pays;

    public Athlete(int id, String nom) {
        this.id = id;
        this.nom = nom;
        this.pays = pays;
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

    public Pays getPays() {
        return pays;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }
}
