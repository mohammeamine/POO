package Banque;

public class Banque {
	   private CompteBancaire[] comptes;
	    private static int nombreComptes = 0;
	    
	    public Banque(int capacite) {
	        comptes = new CompteBancaire[capacite];
	    }
	    
	    public void ajouterCompte(CompteBancaire compte) {
	        if (nombreComptes < comptes.length) {
	            comptes[nombreComptes] = compte;
	            nombreComptes++;
	            System.out.println("Compte ajout� avec succ�s : " + compte.getNumeroCompte());
	        } else {
	            System.out.println("Capacit� maximale de la banque atteinte.");
	        }
	    }

	    public CompteBancaire chercherCompte(String numeroCompte) {
	        for (int i = 0; i < nombreComptes; i++) {
	            if (comptes[i].getNumeroCompte().equals(numeroCompte)) {
	                return comptes[i];
	            }
	        }
	        System.out.println("Compte non trouv� avec le num�ro : " + numeroCompte);
	        return null;  
	    }

	    
	    public void transfert(String numeroSource, String numeroDest, double montant) {
	        CompteBancaire compteSource = chercherCompte(numeroSource);
	        CompteBancaire compteDest = chercherCompte(numeroDest);

	        if (compteSource != null && compteDest != null) {
	            if (compteSource.retirer(montant)) {
	                compteDest.deposer(montant);
	                System.out.println("Transfert de " + montant + " effectu� de " + numeroSource + " � " + numeroDest);
	            } else {
	                System.out.println("�chec du transfert : solde insuffisant sur le compte source.");
	            }
	        } else {
	            System.out.println("�chec du transfert : un ou plusieurs comptes sont introuvables.");
	        }
	    }
	    public static void afficherNombreComptes() {
	        System.out.println("Nombre total de comptes bancaires : " + nombreComptes);
	    }

}
