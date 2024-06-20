package org.example.compteBancaire;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String nom;
    private String prenom;
    private int identifiant;
    private List<CompteBancaire> listeDesComptes;
    private String telephone;

    public Client(String nom, String prenom, int identifiant, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.identifiant = identifiant;
        this.listeDesComptes = new ArrayList<>();
        this.telephone = telephone;
    }

    public void add(CompteBancaire compte) {
        listeDesComptes.add(compte);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public List<CompteBancaire> getListeDesComptes() {
        return listeDesComptes;
    }

    public void setListeDesComptes(List<CompteBancaire> listeDesComptes) {
        this.listeDesComptes = listeDesComptes;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getNombreDeComptes() {
        return listeDesComptes.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Client{\n")
                .append("  nom='").append(nom).append("',\n")
                .append("  prenom='").append(prenom).append("',\n")
                .append("  identifiant=").append(identifiant).append(",\n")
                .append("  listeDesComptes=").append("[");

        for (int i = 0; i < listeDesComptes.size(); i++) {
            if (i > 0) sb.append(", ");
            sb.append(listeDesComptes.get(i).getClass().getSimpleName()).append("@").append(Integer.toHexString(System.identityHashCode(listeDesComptes.get(i))));
        }

        sb.append("],\n")
                .append("  telephone='").append(telephone).append("',\n")
                .append("  nombreDeComptes=").append(getNombreDeComptes()).append("\n")
                .append("}");

        return sb.toString();
    }
}
