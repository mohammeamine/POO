package tp6;
import java.util.Scanner;
public class DivisionParZero {
	 public static void main(String[] args) {
	        // Cr�ation du scanner pour la saisie utilisateur
	        Scanner scanner = new Scanner(System.in);
	        
	        try {
	            // Saisie des nombres
	            System.out.print("Entrez le num�rateur : ");
	            int numerateur = scanner.nextInt();
	            
	            System.out.print("Entrez le d�nominateur : ");
	            int denominateur = scanner.nextInt();
	            
	            // Tentative de division
	            int resultat = numerateur / denominateur;
	            System.out.println("Le r�sultat de " + numerateur + " / " + denominateur + " = " + resultat);
	            
	        } catch (ArithmeticException e) {
	            System.out.println("Erreur : La division par z�ro n'est pas permise !");
	            System.out.println("Veuillez utiliser un d�nominateur diff�rent de z�ro.");
	            
	        } catch (Exception e) {
	            // Capture les autres types d'exceptions possibles (par exemple, saisie non num�rique)
	            System.out.println("Erreur : Veuillez entrer des nombres valides !");
	            
	        } finally {
	            // Fermeture du scanner et message de fin
	            scanner.close();
	            System.out.println("\nLe programme s'est termin� correctement.");
	        }
	    }
}
