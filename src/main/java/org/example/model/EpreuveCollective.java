package org.example.model;

public class EpreuveCollective extends  Epreuve {

    private float dureeMin;
    private int nbTours;

    public EpreuveCollective(int id, float dureeMin, int nbTours) {
        super(id);
        this.dureeMin = dureeMin;
        this.nbTours = nbTours;
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
