package frames;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class Awt_constructeur {
	private Frame f=new Frame("Fenetre Awt avec constructeur");
	private Label lb=new Label("Nom:"); 		
	private TextField tf=new TextField(10);  
	private Button b=new Button("Confirmer"); 
	
	public Awt_constructeur(){
		this.f.setLayout(new FlowLayout());  
		this.f.add(lb); 
		this.f.add(tf); 
		this.f.add(b); 
		this.f.setBounds(50,50,300,150); 
		this.f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Awt_constructeur();
	}
	
}