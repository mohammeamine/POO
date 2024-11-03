package tp6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        Compte compte = new Compte(500.0); 

	        try {
	            System.out.print("Veuillez entrer un montant à retirer : ");
	            double montant = scanner.nextDouble();

	            // Tentative de retrait avec gestion des exceptions
	            compte.retirer(montant);

	        } catch (InputMismatchException e) {
	            // Gérer l'erreur de saisie d'un montant non numérique
	            System.out.println("Erreur : La saisie n'est pas un nombre valide.");
	        } catch (MontantNegatifException e) {
	            // Gérer l'erreur de montant négatif
	            System.out.println("Erreur : " + e.getMessage());
	        } catch (SoldeInsuffisant e) {
	            // Gérer l'erreur de solde insuffisant
	            System.out.println("Erreur : " + e.getMessage());
	        } finally {
	            // Message final indiquant que l'opération est terminée
	            System.out.println("Opération de retrait terminée.");
	        }

	}

}
