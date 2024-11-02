package tp5;

public interface Produit {
	double calculerValeurStock();
}
class ProduitAlimentaire implements Produit {
    private String nom;
    private double prixUnitaire;
    private int quantite;
    private String dateExpiration;

    public ProduitAlimentaire(String nom, double prixUnitaire, int quantite, String dateExpiration) {
        this.nom = nom;
        this.prixUnitaire = prixUnitaire;
        this.quantite = quantite;
        this.dateExpiration = dateExpiration;
    }

    public double  calculerValeurStock() {
        return prixUnitaire * quantite;
    }
 
    public void afficherInfo() {
        System.out.println("Produit Alimentaire: " + nom);
        System.out.println("Prix Unitaire: " + prixUnitaire);
        System.out.println("Quantité en Stock: " + quantite);
        System.out.println("Date d'Expiration: " + dateExpiration);
        System.out.println("Valeur du Stock: " + calculerValeurStock());
    }
}


class ProduitElectronique implements Produit {
    private String nom;
    private double prixUnitaire;
    private int quantite;
    private int garantie; 

    public ProduitElectronique(String nom, double prixUnitaire, int quantite, int garantie) {
        this.nom = nom;
        this.prixUnitaire = prixUnitaire;
        this.quantite = quantite;
        this.garantie = garantie;
    }

    public double calculerValeurStock() {
        return prixUnitaire * quantite;
    }
    
    
    public void afficherInfo() {
        System.out.println("Produit Electronique: " + nom);
        System.out.println("Prix Unitaire: " + prixUnitaire);
        System.out.println("Quantité en Stock: " + quantite);
        System.out.println("Garantie: " + garantie + " an(s)");
        System.out.println("Valeur du Stock: " + calculerValeurStock());
    }
}