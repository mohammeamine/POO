package tp6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        Compte compte = new Compte(500.0); 

	        try {
	            System.out.print("Veuillez entrer un montant � retirer : ");
	            double montant = scanner.nextDouble();

	            // Tentative de retrait avec gestion des exceptions
	            compte.retirer(montant);

	        } catch (InputMismatchException e) {
	            // G�rer l'erreur de saisie d'un montant non num�rique
	            System.out.println("Erreur : La saisie n'est pas un nombre valide.");
	        } catch (MontantNegatifException e) {
	            // G�rer l'erreur de montant n�gatif
	            System.out.println("Erreur : " + e.getMessage());
	        } catch (SoldeInsuffisant e) {
	            // G�rer l'erreur de solde insuffisant
	            System.out.println("Erreur : " + e.getMessage());
	        } finally {
	            // Message final indiquant que l'op�ration est termin�e
	            System.out.println("Op�ration de retrait termin�e.");
	        }

	}

}
