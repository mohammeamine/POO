package tp6;

public class Compte {
	 private double solde;

	    public Compte(double soldeInitial) {
	        this.solde = soldeInitial;
	    }

	    public double getSolde() {
	        return solde;
	    }

	    // Méthode pour déposer de l'argent dans le compte
	    public void deposer(double montant) throws MontantNegatifException {
	        if (montant < 0) {
	            throw new MontantNegatifException("Le montant à déposer ne peut pas être négatif.");
	        }
	        solde += montant;
	        System.out.println("Montant déposé : " + montant);
	    }

	    // Méthode pour retirer de l'argent, avec gestion du solde insuffisant et du montant négatif
	    
	    public void retirer(double montant) throws SoldeInsuffisant, MontantNegatifException {
	        if (montant < 0) {
	            throw new MontantNegatifException("Le montant à retirer ne peut pas être négatif.");
	        }
	        if (montant > solde) {
	            throw new SoldeInsuffisant("Solde insuffisant pour effectuer ce retrait.");
	        }
	        solde -= montant;
	        System.out.println("Montant retiré : " + montant);
	    }
}
