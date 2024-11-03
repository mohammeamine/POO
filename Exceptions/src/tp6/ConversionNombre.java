package tp6;
import java.util.Scanner;
public class ConversionNombre {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez saisir un nombre : ");
        String saisie = scanner.nextLine();

        convertirEnEntier(saisie);
    }

    // Méthode pour convertir une chaîne en entier
    public static void convertirEnEntier(String nombre) {
        try {
            // Tentative de conversion de la chaîne en entier
            int resultat = Integer.parseInt(nombre);
            System.out.println("Le nombre converti est : " + resultat);
        } catch (NumberFormatException e) {
            // Gestion de l'exception et affichage d'un message d'erreur
            System.out.println("Erreur : La saisie n'est pas un nombre valide.");
        } finally {
            // Message indiquant que la tentative de conversion est terminée
            System.out.println("Tentative de conversion terminée.");
        }
    }
}
