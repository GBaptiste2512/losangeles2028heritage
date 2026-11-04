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

    public int getNbAthletes() {
        return this.lesAthletes.size();
    }

    public int getNbPoints() {
        int total = 0;
        for (PaysMedaille pm : lesMedailles) {
            total += pm.getMedaille().getNbPoints();
        }
        return total;
    }

    public int getNbMedaillesParType(String type) {
        int count = 0;
        for (PaysMedaille pm : lesMedailles) {
            if (pm.getMedaille().getNom().equalsIgnoreCase(type)) {
                count++;
            }
        }
        return count;
    }

    public int getNbMedaillesOr() {
        return getNbMedaillesParType("Or");
    }

    public int getNbMedaillesArgent() {
        return getNbMedaillesParType("Argent");
    }

    public int getNbMedaillesBronze() {
        return getNbMedaillesParType("Bronze");
    }
}
