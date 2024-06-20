package org.example.compteBancaire;

import java.util.Scanner;

public class IHM {
    static Scanner scanner = new Scanner(System.in);

    public static void start() {
        System.out.println("=== Menu principal === \n");
        System.out.print("1. Lister les comptes bancaires\n");
        System.out.print("2. Créer un compte bancaire\n");
        System.out.print("3. Effectuer un dépôt\n");
        System.out.print("4. Effectuer un retrait\n");
        System.out.print("5. Afficher les opérations et le solde\n");
        System.out.print("0. Quitter le programme\n");

        System.out.print("Votre choix : ");
        int choix = scanner.nextInt();
    }
    
}
