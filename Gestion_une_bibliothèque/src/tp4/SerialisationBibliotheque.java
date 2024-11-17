package tp4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerialisationBibliotheque {

    public static void main(String[] args) {
        // Cr�ation d'une liste de livres
        List<Livre> bibliotheque = new ArrayList<>();
        bibliotheque.add(new Livre("Les Mis�rables", "Victor Hugo", 1862));
        bibliotheque.add(new Livre("1984", "George Orwell", 1949));
        bibliotheque.add(new Livre("Le Petit Prince", "Antoine de Saint-Exup�ry", 1943));
        bibliotheque.add(new Livre("La Peste", "Albert Camus", 1947));

        // Fichier pour stocker la biblioth�que s�rialis�e
        String fichier = "bibliotheque.ser";

        // S�rialisation de la biblioth�que
        serialiserBibliotheque(bibliotheque, fichier);

        // D�s�rialisation de la biblioth�que
        List<Livre> bibliothequeDeserialisee = deserialiserBibliotheque(fichier);

        // Affichage des livres d�s�rialis�s
        if (bibliothequeDeserialisee != null) {
            System.out.println("\nBiblioth�que d�s�rialis�e :");
            for (Livre livre : bibliothequeDeserialisee) {
                System.out.println(livre);
            }
        }
    }

    /**
     * S�rialise une liste de livres dans un fichier.
     * 
     * @param bibliotheque Liste des livres � s�rialiser
     * @param fichier      Nom du fichier de destination
     */
    private static void serialiserBibliotheque(List<Livre> bibliotheque, String fichier) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichier))) {
            oos.writeObject(bibliotheque);
            System.out.println("La biblioth�que a �t� sauvegard�e dans " + fichier);
        } catch (IOException e) {
            System.err.println("Erreur lors de la s�rialisation : " + e.getMessage());
        }
    }

    /**
     * D�s�rialise une liste de livres � partir d'un fichier.
     * 
     * @param fichier Nom du fichier contenant la biblioth�que s�rialis�e
     * @return Liste d�s�rialis�e des livres ou null en cas d'erreur
     */
    private static List<Livre> deserialiserBibliotheque(String fichier) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichier))) {
            @SuppressWarnings("unchecked")
            List<Livre> bibliotheque = (List<Livre>) ois.readObject();
            return bibliotheque;
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erreur lors de la d�s�rialisation : " + e.getMessage());
        }
        return null;
    }
}
