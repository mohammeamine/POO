package tp5;

public class Main {

	public static void main(String[] args) {
		
		Forme cercle = new Cercle(5);
        System.out.println("Surface du cercle: " + cercle.calculerSurface());
        System.out.println("Périmètre du cercle: " + cercle.calculerPerimetre());

        Forme rectangle = new Rectangle(4, 6);
        System.out.println("Surface du rectangle: " + rectangle.calculerSurface());
        System.out.println("Périmètre du rectangle: " + rectangle.calculerPerimetre());

        Forme triangle = new Triangle(3, 4, 5);
        System.out.println("Surface du triangle: " + triangle.calculerSurface());
        System.out.println("Périmètre du triangle: " + triangle.calculerPerimetre());
//   Produit
        Produit produitAlimentaire = new ProduitAlimentaire("Lait", 1.5, 200, "2024-12-31");
        produitAlimentaire.calculerValeurStock();
        ((ProduitAlimentaire) produitAlimentaire).afficherInfo();

       
        Produit produitElectronique = new ProduitElectronique("Télévision", 400, 30, 2);
        produitElectronique.calculerValeurStock();
        ((ProduitElectronique) produitElectronique).afficherInfo();
   //   Vehicule
        
        Vehicule[] vehicules = {
                new Voiture("Voiture de Sport", "Essence"),
                new Bateau("Yacht", "Diesel"),
                new Hydravion("Hydravion", "Kérosène")
            };

            for (Vehicule vehicule : vehicules) {
                vehicule.afficherInfos();
                vehicule.demarrer();
                vehicule.arreter();
                System.out.println();

               
                if (vehicule instanceof Roulant) {
                    ((Roulant) vehicule).rouler();
                }
                if (vehicule instanceof Flottant) {
                    ((Flottant) vehicule).flotter();
                }
                if (vehicule instanceof Volant) {
                    ((Volant) vehicule).voler();
                }
                System.out.println();
            }
        
	}

}
