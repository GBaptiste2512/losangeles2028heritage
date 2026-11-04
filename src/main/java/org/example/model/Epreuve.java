package org.example.model;

public abstract class Epreuve {

    private int id;
    private Sport sport;

    public Epreuve(int id, Sport sport) {
        this.id = id;
        this.sport = sport;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }
}
