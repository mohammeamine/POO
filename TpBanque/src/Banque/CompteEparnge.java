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
        System.out.println("Int�r�ts calcul�s et ajout�s au solde : " + interet + ". Nouveau solde : " + solde);
    }

    
    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }
}
