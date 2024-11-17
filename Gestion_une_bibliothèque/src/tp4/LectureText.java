package tp4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.io.*;

public class LectureText {
    public static void main(String[] args) {
        // Chemin du fichier source (livres.txt)
        String fichierSource = "livre.txt";
        // Chemin du fichier de sortie (sortie.txt)
        String fichierSortie = "sortie.txt";

        // Lecture du fichier source et �criture dans le fichier de sortie
        try (
            BufferedReader br = new BufferedReader(new FileReader(fichierSource));
            BufferedWriter bw = new BufferedWriter(new FileWriter(fichierSortie))
        ) {
            String ligne;

            System.out.println("Lecture du fichier source et �criture dans le fichier de sortie...");
            
            // Lecture et �criture ligne par ligne
            while ((ligne = br.readLine()) != null) {
                System.out.println(ligne); // Affiche la ligne lue
                bw.write(ligne);          // �crit la ligne dans le fichier de sortie
                bw.newLine();             // Ajoute une nouvelle ligne dans le fichier de sortie
            }

            System.out.println("�criture termin�e. Contenu copi� dans : " + fichierSortie);
        } catch (IOException e) {
            System.err.println("Erreur : " + e.getMessage());
        }
    }
}
