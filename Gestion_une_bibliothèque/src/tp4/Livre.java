package tp4;
import java.io.Serializable;
public class Livre implements Serializable {
    private static final long serialVersionUID = 1L; // Version de la classe pour la sérialisation

    private String titre;
    private String auteur;
    private int anneePublication;

    // Constructeur
    public Livre(String titre, String auteur, int anneePublication) {
        this.titre = titre;
        this.auteur = auteur;
        this.anneePublication = anneePublication;
    }

	// Getters
    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getAnneePublication() {
        return anneePublication;
    }

    // Setters
    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setAnneePublication(int anneePublication) {
        this.anneePublication = anneePublication;
    }

    // toString pour afficher les informations d'un Livre
    @Override
    public String toString() {
        return "Livre{" +
               "titre='" + titre + '\'' +
               ", auteur='" + auteur + '\'' +
               ", anneePublication=" + anneePublication +
               '}';
    }

}
