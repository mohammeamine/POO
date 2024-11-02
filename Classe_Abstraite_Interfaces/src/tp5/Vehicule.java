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
	        System.out.println("Nom du v�hicule : " + nom);
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

	// Classe Voiture qui h�rite de Vehicule et impl�mente Roulant
	class Voiture extends Vehicule implements Roulant {

	    public Voiture(String nom, String typeCarburant) {
	        super(nom, typeCarburant);
	    }

	    @Override
	    public void demarrer() {
	        System.out.println("La voiture d�marre.");
	    }

	    @Override
	    public void arreter() {
	        System.out.println("La voiture s'arr�te.");
	    }

	    @Override
	    public void rouler() {
	        System.out.println("La voiture roule.");
	    }
	}

	// Classe Bateau qui h�rite de Vehicule et impl�mente Flottant
	class Bateau extends Vehicule implements Flottant {

	    public Bateau(String nom, String typeCarburant) {
	        super(nom, typeCarburant);
	    }

	    @Override
	    public void demarrer() {
	        System.out.println("Le bateau d�marre.");
	    }

	    @Override
	    public void arreter() {
	        System.out.println("Le bateau s'arr�te.");
	    }

	    @Override
	    public void flotter() {
	        System.out.println("Le bateau flotte.");
	    }
	}

	// Classe Hydravion qui h�rite de Vehicule et impl�mente Volant et Flottant
	class Hydravion extends Vehicule implements Volant, Flottant {

	    public Hydravion(String nom, String typeCarburant) {
	        super(nom, typeCarburant);
	    }

	    @Override
	    public void demarrer() {
	        System.out.println("L'hydravion d�marre.");
	    }

	    @Override
	    public void arreter() {
	        System.out.println("L'hydravion s'arr�te.");
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
