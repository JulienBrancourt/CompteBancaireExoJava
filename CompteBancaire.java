package org.example.compteBancaire;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public abstract class CompteBancaire {
    protected double solde = 20;
    protected String client;
    protected List<Operation> listeOperations ;

    public CompteBancaire(double solde, String client ) {
        this.solde = solde;
        this.client = client;
        this.listeOperations = new ArrayList<>();
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public List<Operation> getListeOperations() {
        return listeOperations;
    }

    public void setListeOperations(List<Operation> listeOperations) {
        this.listeOperations = listeOperations;

    }
    public void add(Operation operation) {
        applyOperation(operation);
        listeOperations.add(operation);
    }

    protected void applyOperation(Operation operation) {
        switch (operation.getStatut()){
            case DEPOT -> setDepot(operation);
            case RETRAIT -> setRetrait(operation);
        }
    }

    protected void setDepot(Operation operation) {
        solde = solde + operation.getMontant();
    }

    protected void setRetrait(Operation operation) {
        solde = solde - operation.getMontant();
    }


}


/*for (String operation : listeOperations) {
        this.listeOperations.add(operation);
        }*/
