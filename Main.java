package org.example.compteBancaire;

public class Main {
    public static void main(String[] args) {

        Client client1 = new Client("client1", "prenom1", 1234,"0122222222");

        System.out.println(client1.toString());

        CompteBancaire compteEpargne1 = new CompteEpargne(50, "client1");
        //CompteBancaire comptePayant1 = new ComptePayant(750, "client1");

        client1.add(compteEpargne1);
        //client1.add(comptePayant1);


        System.out.println(client1.toString());

        Operation ope1 = new Operation(1, 500, Statut.RETRAIT);
        compteEpargne1.add(ope1);

        System.out.println(compteEpargne1.toString());




        //IHM.start();

    }
}
