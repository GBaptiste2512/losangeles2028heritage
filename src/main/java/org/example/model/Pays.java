package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Pays {
    private int id;
    private String nom ;
    private List<Athlete> lesAthletes = new ArrayList<>();
    private List<PaysMedaille> lesMedailles = new ArrayList<>();

    public Pays(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Athlete> getLesAthletes() {
        return lesAthletes;
    }

    public void setLesAthletes(List<Athlete> lesAthletes) {
        this.lesAthletes = lesAthletes;
    }

    public List<PaysMedaille> getLesMedailles() {
        return lesMedailles;
    }

    public void setLesMedailles(List<PaysMedaille> lesMedailles) {
        this.lesMedailles = lesMedailles;
    }


}
