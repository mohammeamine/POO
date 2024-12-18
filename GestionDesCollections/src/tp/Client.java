package tp;

import java.util.ArrayList;
import java.util.List;


public class Client {
	
	 private int codeClient;
	 private String nomClient;
	 private String adrClient;
	 private String telClient;
	 private List<Commande> listCommandes;
	 
	 public Client(int codeClient,String nomClient,String adrClient,String telClient, List listCommandes){
		 this.codeClient=codeClient;
		 this.adrClient=adrClient;
		 this.telClient=telClient;
		 this.adrClient=adrClient;
		 this.listCommandes = new ArrayList<Commande>();
	 }
	 public boolean  EnregistrerCommande(Commande nouvelleCommande){
		 for (Commande commande : listCommandes) {
	            if (commande.getNumCommande() == nouvelleCommande.getNumCommande()) {
	                System.out.println("La commande avec le numéro " + nouvelleCommande.getNumCommande() + " existe déjà.");
	            return false;    
	          
	            }
	        }
		 
		 listCommandes.add(nouvelleCommande);
	     System.out.println("La commande " + nouvelleCommande.getNumCommande() + " a été ajoutée avec succès.");
		return true; 
	 }
	 
	 public List<Commande> getListCommandes() {
		    return listCommandes;
		}
		public int getCodeClient(){
			return codeClient;
		}
		public String getNomClient(){
			return nomClient;
		}
	 public boolean SupprimerCommande(int numCommande){
		 for (Commande commande : listCommandes) {
	            if (commande.getNumCommande() == numCommande) {
	                listCommandes.remove(commande);
	                System.out.println("La commande avec le numéro " + numCommande + " a été supprimée.");
	                return true; 
	            }
	        }
	        System.out.println("Aucune commande avec le numéro " + numCommande + " n'a été trouvée.");
	        return false;
	 }
		 public String toString() {
		        return "Commande {" +
		        		"Code du client = " + codeClient +
		                "Telephone du client = " + telClient +
		                ", Nom du client = '" + nomClient + '\'' +
		                ", Adresse de client = " + adrClient +
		                '}';
		    }
		 
}
