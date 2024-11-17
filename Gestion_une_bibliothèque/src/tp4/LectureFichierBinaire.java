package tp4;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class LectureFichierBinaire {
	public static void main(String[] args) {
        // Chemin du fichier source à copier
        String cheminSource = "chemin/vers/fichier/source";
        // Chemin du fichier de destination
        String cheminDestination = "chemin/vers/fichier/destination";

        File fichierSource = new File(cheminSource);
        File fichierDestination = new File(cheminDestination);

        // Vérifie si le fichier source existe
        if (!fichierSource.exists()) {
            System.out.println("Le fichier source n'existe pas : " + cheminSource);
            return;
        }

        // Copie du fichier
        try (
            FileInputStream fis = new FileInputStream(fichierSource);
            FileOutputStream fos = new FileOutputStream(fichierDestination)
        ) {
            byte[] buffer = new byte[1024]; // Buffer de 1 Ko
            int nombreOctetsLus;

            System.out.println("Début de la copie...");

            // Lecture et écriture en boucle
            while ((nombreOctetsLus = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, nombreOctetsLus);
            }

            System.out.println("Copie terminée. Fichier copié à : " + cheminDestination);
        } catch (IOException e) {
            System.err.println("Erreur lors de la copie du fichier : " + e.getMessage());
        }
    }
}
