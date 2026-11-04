package org.example.model;

public class PaysMedaille {

    private Pays pays;
    private Medaille medaille;

    public PaysMedaille(Pays pays, Medaille medaille) {
        this.pays = pays;
        this.medaille = medaille;
    }

    public Pays getPays() {
        return pays;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }

    public Medaille getMedaille() {
        return medaille;
    }

    public void setMedaille(Medaille medaille) {
        this.medaille = medaille;
    }
}
