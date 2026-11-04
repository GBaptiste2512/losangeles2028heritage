package org.example.model;

public abstract class Epreuve {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Epreuve(int id) {
        this.id = id;
    }
}
