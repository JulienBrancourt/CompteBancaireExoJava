package org.example.compteBancaire;

public class Operation {
    private int id;
    private double montant;
    private Statut ope;

    public Operation(int id, double montant, Statut ope) {
        this.id = id;
        this.montant = montant;
        this.ope = ope;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Statut getStatut() {
        return ope;
    }

    public void setStatut(Statut statut) {
        this.ope = ope;
    }



}
