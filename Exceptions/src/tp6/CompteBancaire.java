package tp6;

public class CompteBancaire {
    private double solde;

    public CompteBancaire(double soldeInitial) {
        this.solde = soldeInitial;
    }

    public void verser(double montant) throws MontantNegatifException {
        if (montant < 0) {
            throw new MontantNegatifException("Le montant � verser ne peut pas �tre n�gatif.");
        }
        solde += montant;
    }

    public void retirer(double montant) throws MontantNegatifException {
        if (montant < 0) {
            throw new MontantNegatifException("Le montant � retirer ne peut pas �tre n�gatif.");
        }
        solde -= montant;
    }

    public double getSolde() {
        return solde;
    }
}

