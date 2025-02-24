package frames;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class AWT  {	
	public static void main(String[] args) {
		Frame f=new Frame("Fenetre Awt");
		Label lb=new Label("Nom:"); 		
		TextField tf=new TextField(10);  		
		Button b=new Button("Confirmer");  

		f.setLayout(new FlowLayout());  
		f.add(lb); 
		f.add(tf); 
		f.add(b); 
		f.setBounds(50,50,300,150); 
		f.setVisible(true);
		
	}
}
