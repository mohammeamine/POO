package tp6;

public class Mainn {

	public static void main(String[] args) {
		  CompteBancaire compte = new CompteBancaire(1000.0);

	        try {
	            compte.verser(-50.0);
	        } catch (MontantNegatifException e) {
	            System.out.println("Erreur : " + e.getMessage());
	        }

	        try {
	            compte.retirer(-30.0);
	        } catch (MontantNegatifException e) {
	            System.out.println("Erreur : " + e.getMessage());
	        }

	        System.out.println("Solde actuel : " + compte.getSolde());

	}

}
