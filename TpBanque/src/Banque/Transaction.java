package Banque;

import java.util.Date;

public class Transaction {
	  private String type;     
	    private double montant;    
	    private Date date;        

	    // Constructor
	    public Transaction(String type, double montant) {
	        this.type = type;
	        this.montant = montant;
	        this.date = new Date();
	    }

	    // Getters
	    public String getType() {
	        return type;
	    }

	    public double getMontant() {
	        return montant;
	    }

	    public Date getDate() {
	        return date;
	    }

	   
	    public void afficherTransaction() {
	        System.out.println("Type: " + type + ", Montant: " + montant + ", Date: " + date);
	    }
}
