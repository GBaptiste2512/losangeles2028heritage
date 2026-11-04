package org.example.model;

public class Participation {
    private int id;
    private int place;
    private String temps;
    private boolean recordOlympique;
    private EpreuveIndividuelle epreuve;

    public Participation(int id, int place, String temps, boolean recordOlympique, EpreuveIndividuelle epreuve) {
        this.id = id;
        this.place = place;
        this.temps = temps;
        this.recordOlympique = recordOlympique;
        this.epreuve = epreuve;
    }

    public EpreuveIndividuelle getEpreuve() {
        return epreuve;
    }

    public void setEpreuve(EpreuveIndividuelle epreuve) {
        this.epreuve = epreuve;
    }

    public boolean isRecordOlympique() {
        return recordOlympique;
    }

    public void setRecordOlympique(boolean recordOlympique) {
        this.recordOlympique = recordOlympique;
    }

    public String getTemps() {
        return temps;
    }

    public void setTemps(String temps) {
        this.temps = temps;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
