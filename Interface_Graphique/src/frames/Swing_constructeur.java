package frames;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Swing_constructeur {
	private JFrame jf = new JFrame("Fenetre Swing"); 
	private JLabel jl=new JLabel("Nom:");
	private JTextField jt=new JTextField(20);
	private JButton jb=new JButton("Confirmer");
	
	public Swing_constructeur(){
		this.jf.setLayout(new FlowLayout());  
		this.jf.add(jl);
		this.jf.add(jt);
		this.jf.add(jb);
	    this.jf.setBounds(50,50,300,150);
	    this.jf.setVisible(true);
	}
	public static void main(String[] args){
		new Swing_constructeur();
		
	}
}

