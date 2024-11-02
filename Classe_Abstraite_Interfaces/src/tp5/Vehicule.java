package tp5;

public abstract class Vehicule {

	    protected String nom;
	    protected String typeCarburant;

	    public Vehicule(String nom, String typeCarburant) {
	        this.nom = nom;
	        this.typeCarburant = typeCarburant;
	    }

	    public void voler() {
			// TODO Auto-generated method stub
			
		}

		public void rouler() {
		
			
		}

		public void flotter() {
			
			
		}

		public abstract void demarrer();
	    public abstract void arreter();

	    public void afficherInfos() {
	        System.out.println("Nom du véhicule : " + nom);
	        System.out.println("Type de carburant : " + typeCarburant);
	    }
	}

	// Interface Roulant
	interface Roulant {
	    void rouler();
	}

	// Interface Flottant
	interface Flottant {
	    void flotter();
	}

	// Interface Volant
	interface Volant {
	    void voler();
	}

	// Classe Voiture qui hérite de Vehicule et implémente Roulant
	class Voiture extends Vehicule implements Roulant {

	    public Voiture(String nom, String typeCarburant) {
	        super(nom, typeCarburant);
	    }

	    @Override
	    public void demarrer() {
	        System.out.println("La voiture démarre.");
	    }

	    @Override
	    public void arreter() {
	        System.out.println("La voiture s'arrête.");
	    }

	    @Override
	    public void rouler() {
	        System.out.println("La voiture roule.");
	    }
	}

	// Classe Bateau qui hérite de Vehicule et implémente Flottant
	class Bateau extends Vehicule implements Flottant {

	    public Bateau(String nom, String typeCarburant) {
	        super(nom, typeCarburant);
	    }

	    @Override
	    public void demarrer() {
	        System.out.println("Le bateau démarre.");
	    }

	    @Override
	    public void arreter() {
	        System.out.println("Le bateau s'arrête.");
	    }

	    @Override
	    public void flotter() {
	        System.out.println("Le bateau flotte.");
	    }
	}

	// Classe Hydravion qui hérite de Vehicule et implémente Volant et Flottant
	class Hydravion extends Vehicule implements Volant, Flottant {

	    public Hydravion(String nom, String typeCarburant) {
	        super(nom, typeCarburant);
	    }

	    @Override
	    public void demarrer() {
	        System.out.println("L'hydravion démarre.");
	    }

	    @Override
	    public void arreter() {
	        System.out.println("L'hydravion s'arrête.");
	    }

	    @Override
	    public void voler() {
	        System.out.println("L'hydravion vole.");
	    }

	    @Override
	    public void flotter() {
	        System.out.println("L'hydravion flotte.");
	    }
	

}
