package Banque;
import java.util.ArrayList;
import java.util.List;

public class CompteBancaire {
    private String numeroCompte;
    protected double solde;
    private String Titulaire;
    private List<Transaction> transactions;  // Nouvelle liste pour stocker les transactions
    
    public CompteBancaire(String numeroCompte, String Titulaire) {
        this.numeroCompte = numeroCompte;
        this.Titulaire = Titulaire;
        this.solde = 0.0;
        this.transactions = new ArrayList<>();  // Initialisation de la liste
    }
    
    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
            // Enregistrement de la transaction de type d�p�t
            transactions.add(new Transaction("DEPOT", montant));
            System.out.println(montant + " a �t� d�pos� sur le compte.");
        } else {
            System.out.println("Le montant � d�poser doit �tre sup�rieur � 0.");
        }
    }
    
    public boolean retirer(double montant) {
        if (montant > 0) {
            if (solde >= montant) {
                solde -= montant;
                // Enregistrement de la transaction de type retrait
                transactions.add(new Transaction("RETRAIT", montant));
                System.out.println(montant + " a �t� retir� du compte.");
                return true;
            } else {
                System.out.println("Solde insuffisant. Vous ne pouvez pas retirer ce montant.");
                return false;
            }
        } else {
            System.out.println("Le montant � retirer doit �tre sup�rieur � 0.");
            return false;
        }
    }
    
    // Nouvelle m�thode pour afficher l'historique des transactions
    public void afficherHistoriqueTransactions() {
        System.out.println("Historique des transactions pour le compte " + numeroCompte + ":");
        for (Transaction transaction : transactions) {
            transaction.afficherTransaction();
        }
    }

    // Les autres m�thodes restent inchang�es
    public void affichersolde() {
        System.out.println(solde);
    }
    
    public String getNumeroCompte() {
        return numeroCompte;
    }
    
    public double getSolde() {
        return solde;
    }
    
    public void setTitulaire(String Titulaire) {
        this.Titulaire = Titulaire;
    }
}