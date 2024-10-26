package Banque;

public class BanqueTest {
    public static void main(String[] args) {
        // Step 1: Create a bank instance
        Banque banque = new Banque(10);
        
        // Step 2: Create three different bank accounts
        CompteBancaire compte1 = new CompteBancaire("123456", "Alice");
        CompteBancaire compte2 = new CompteBancaire("654321", "Bob");
        CompteBancaire compte3 = new CompteBancaire("789012", "Charlie");
        
        banque.ajouterCompte(compte1);
        banque.ajouterCompte(compte2);
        banque.ajouterCompte(compte3);

        // Step 3: Perform transactions and display their history
        System.out.println("\n---- Opérations de dépôt ----");
        compte1.deposer(500);
        compte2.deposer(300);
        compte3.deposer(1000);

        System.out.println("\n---- Historique après les dépôts ----");
        System.out.println("Compte d'Alice:");
        compte1.afficherHistoriqueTransactions();
        System.out.println("\nCompte de Bob:");
        compte2.afficherHistoriqueTransactions();
        System.out.println("\nCompte de Charlie:");
        compte3.afficherHistoriqueTransactions();

        System.out.println("\n---- Opérations de retrait ----");
        compte1.retirer(200);
        compte2.retirer(150);

        System.out.println("\n---- Historique après les retraits ----");
        System.out.println("Compte d'Alice:");
        compte1.afficherHistoriqueTransactions();
        System.out.println("\nCompte de Bob:");
        compte2.afficherHistoriqueTransactions();

        System.out.println("\n---- Opérations de transfert ----");
        banque.transfert("123456", "654321", 100);
        banque.transfert("789012", "123456", 300);

        System.out.println("\n---- Historique final de tous les comptes ----");
        System.out.println("Compte d'Alice (123456):");
        compte1.afficherHistoriqueTransactions();
        System.out.println("\nCompte de Bob (654321):");
        compte2.afficherHistoriqueTransactions();
        System.out.println("\nCompte de Charlie (789012):");
        compte3.afficherHistoriqueTransactions();

        // Step 4: Display final balances
        System.out.println("\n---- Soldes finaux ----");
        System.out.print("Solde du compte 1 (Alice): ");
        compte1.affichersolde();
        System.out.print("Solde du compte 2 (Bob): ");
        compte2.affichersolde();
        System.out.print("Solde du compte 3 (Charlie): ");
        compte3.affichersolde();

        // Step 5: Display total number of accounts
        Banque.afficherNombreComptes();

        // Testing ComptesCourant and ComptesEpargne
        System.out.println("\n---- Test des comptes spécialisés ----");
        CompteCourant compteCourant1 = new CompteCourant("CC001", "Alice", 500.0);
        CompteEparnge compteEpargne1 = new CompteEparnge("CE001", "Bob", 0.03);

        System.out.println("\n---- Opérations sur les comptes spécialisés ----");
        compteCourant1.deposer(1000.0);
        compteEpargne1.deposer(1500.0);
        compteCourant1.retirer(300.0);
        compteCourant1.retirer(1300.0);
        compteEpargne1.retirer(200.0);

        System.out.println("\n---- Historique des comptes spécialisés ----");
        System.out.println("Historique du compte courant d'Alice:");
        compteCourant1.afficherHistoriqueTransactions();
        System.out.println("\nHistorique du compte épargne de Bob:");
        compteEpargne1.afficherHistoriqueTransactions();

        System.out.println("\n---- Application des intérêts et soldes finaux ----");
        compteEpargne1.calculerInteret();
        System.out.print("Solde final compte courant: ");
        compteCourant1.affichersolde();
        System.out.print("Solde final compte épargne: ");
        compteEpargne1.affichersolde();
    }
}