package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class ParticipationPaysEpreuveCo {
    private Pays pays;
    private EpreuveCollective EpreuveCo;

    public ParticipationPaysEpreuveCo(Pays pays, EpreuveCollective epreuveCo) {
        this.pays = pays;
        EpreuveCo = epreuveCo;
    }

    public Pays getPays() {
        return pays;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }

    public EpreuveCollective getEpreuveCo() {
        return EpreuveCo;
    }

    public void setEpreuveCo(EpreuveCollective epreuveCo) {
        EpreuveCo = epreuveCo;
    }
}
