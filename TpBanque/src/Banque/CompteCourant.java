package Banque;

public class CompteCourant extends CompteBancaire {
	
	   private double decouvertAutorise;

	
	    public CompteCourant(String numeroCompte, String nomTitulaire, double decouvertAutorise) {
	        super(numeroCompte, nomTitulaire);
	        this.decouvertAutorise = decouvertAutorise;
	    }

	   
	    @Override
	    public boolean retirer(double montant) {
	        if (montant > 0) {
	           
	            if (solde + decouvertAutorise >= montant) {
	                solde -= montant;
	                System.out.println(montant + " a été retiré du compte. Nouveau solde : " + solde);
	                return true;
	            } else {
	                System.out.println("Retrait refusé : dépassement du découvert autorisé.");
	            }
	        } else {
	            System.out.println("Le montant à retirer doit être supérieur à 0.");
	        }
	        return false;
	    }

	 
	    public double getDecouvertAutorise() {
	        return decouvertAutorise;
	    }

	    public void setDecouvertAutorise(double decouvertAutorise) {
	        this.decouvertAutorise = decouvertAutorise;
	    }
}
