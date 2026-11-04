package org.example.model;

public class EpreuveIndividuelle extends  Epreuve{

    private String recordOlympique ;

    public EpreuveIndividuelle(int id, String recordOlympique) {
        super(id);
        this.recordOlympique = recordOlympique;
    }

    public String getRecordOlympique() {
        return recordOlympique;
    }

    public void setRecordOlympique(String recordOlympique) {
        this.recordOlympique = recordOlympique;
    }
}
