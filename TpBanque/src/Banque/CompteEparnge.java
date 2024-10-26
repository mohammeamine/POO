package Banque;

public class CompteEparnge extends CompteBancaire {
	
    private double tauxInteret; 
    
   
    public CompteEparnge(String numeroCompte, String nomTitulaire, double tauxInteret) {
        super(numeroCompte, nomTitulaire);
        this.tauxInteret = tauxInteret;
    }

    public void calculerInteret() {
        double interet = solde * tauxInteret;
        solde += interet;
        System.out.println("Intérêts calculés et ajoutés au solde : " + interet + ". Nouveau solde : " + solde);
    }

    
    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }
}
