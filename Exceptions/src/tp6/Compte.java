package tp6;

public class Compte {
	 private double solde;

	    public Compte(double soldeInitial) {
	        this.solde = soldeInitial;
	    }

	    public double getSolde() {
	        return solde;
	    }

	    // M�thode pour d�poser de l'argent dans le compte
	    public void deposer(double montant) throws MontantNegatifException {
	        if (montant < 0) {
	            throw new MontantNegatifException("Le montant � d�poser ne peut pas �tre n�gatif.");
	        }
	        solde += montant;
	        System.out.println("Montant d�pos� : " + montant);
	    }

	    // M�thode pour retirer de l'argent, avec gestion du solde insuffisant et du montant n�gatif
	    
	    public void retirer(double montant) throws SoldeInsuffisant, MontantNegatifException {
	        if (montant < 0) {
	            throw new MontantNegatifException("Le montant � retirer ne peut pas �tre n�gatif.");
	        }
	        if (montant > solde) {
	            throw new SoldeInsuffisant("Solde insuffisant pour effectuer ce retrait.");
	        }
	        solde -= montant;
	        System.out.println("Montant retir� : " + montant);
	    }
}
