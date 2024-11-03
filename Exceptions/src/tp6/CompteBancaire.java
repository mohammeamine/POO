package tp6;

public class CompteBancaire {
    private double solde;

    public CompteBancaire(double soldeInitial) {
        this.solde = soldeInitial;
    }

    public void verser(double montant) throws MontantNegatifException {
        if (montant < 0) {
            throw new MontantNegatifException("Le montant à verser ne peut pas être négatif.");
        }
        solde += montant;
    }

    public void retirer(double montant) throws MontantNegatifException {
        if (montant < 0) {
            throw new MontantNegatifException("Le montant à retirer ne peut pas être négatif.");
        }
        solde -= montant;
    }

    public double getSolde() {
        return solde;
    }
}

