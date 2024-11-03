package tp6;
import java.util.Scanner;
public class DivisionParZero {
	 public static void main(String[] args) {
	        // Création du scanner pour la saisie utilisateur
	        Scanner scanner = new Scanner(System.in);
	        
	        try {
	            // Saisie des nombres
	            System.out.print("Entrez le numérateur : ");
	            int numerateur = scanner.nextInt();
	            
	            System.out.print("Entrez le dénominateur : ");
	            int denominateur = scanner.nextInt();
	            
	            // Tentative de division
	            int resultat = numerateur / denominateur;
	            System.out.println("Le résultat de " + numerateur + " / " + denominateur + " = " + resultat);
	            
	        } catch (ArithmeticException e) {
	            System.out.println("Erreur : La division par zéro n'est pas permise !");
	            System.out.println("Veuillez utiliser un dénominateur différent de zéro.");
	            
	        } catch (Exception e) {
	            // Capture les autres types d'exceptions possibles (par exemple, saisie non numérique)
	            System.out.println("Erreur : Veuillez entrer des nombres valides !");
	            
	        } finally {
	            // Fermeture du scanner et message de fin
	            scanner.close();
	            System.out.println("\nLe programme s'est terminé correctement.");
	        }
	    }
}
