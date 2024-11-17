package tp4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerialisationBibliotheque {

    public static void main(String[] args) {
        // Création d'une liste de livres
        List<Livre> bibliotheque = new ArrayList<>();
        bibliotheque.add(new Livre("Les Misérables", "Victor Hugo", 1862));
        bibliotheque.add(new Livre("1984", "George Orwell", 1949));
        bibliotheque.add(new Livre("Le Petit Prince", "Antoine de Saint-Exupéry", 1943));
        bibliotheque.add(new Livre("La Peste", "Albert Camus", 1947));

        // Fichier pour stocker la bibliothèque sérialisée
        String fichier = "bibliotheque.ser";

        // Sérialisation de la bibliothèque
        serialiserBibliotheque(bibliotheque, fichier);

        // Désérialisation de la bibliothèque
        List<Livre> bibliothequeDeserialisee = deserialiserBibliotheque(fichier);

        // Affichage des livres désérialisés
        if (bibliothequeDeserialisee != null) {
            System.out.println("\nBibliothèque désérialisée :");
            for (Livre livre : bibliothequeDeserialisee) {
                System.out.println(livre);
            }
        }
    }

    /**
     * Sérialise une liste de livres dans un fichier.
     * 
     * @param bibliotheque Liste des livres à sérialiser
     * @param fichier      Nom du fichier de destination
     */
    private static void serialiserBibliotheque(List<Livre> bibliotheque, String fichier) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichier))) {
            oos.writeObject(bibliotheque);
            System.out.println("La bibliothèque a été sauvegardée dans " + fichier);
        } catch (IOException e) {
            System.err.println("Erreur lors de la sérialisation : " + e.getMessage());
        }
    }

    /**
     * Désérialise une liste de livres à partir d'un fichier.
     * 
     * @param fichier Nom du fichier contenant la bibliothèque sérialisée
     * @return Liste désérialisée des livres ou null en cas d'erreur
     */
    private static List<Livre> deserialiserBibliotheque(String fichier) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichier))) {
            @SuppressWarnings("unchecked")
            List<Livre> bibliotheque = (List<Livre>) ois.readObject();
            return bibliotheque;
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erreur lors de la désérialisation : " + e.getMessage());
        }
        return null;
    }
}
