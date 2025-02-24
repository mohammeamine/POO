package frames;

import java.awt.FlowLayout;
import javax.swing.*;

public class Swing{  
  public static void main(String[] args){
    JFrame jf = new JFrame("Fenetre Swing"); 
    JLabel jl=new JLabel("Nom:");
    JTextField jt=new JTextField(20);
    JButton jb=new JButton("Confirmer");
    jf.add(jl);
    jf.add(jt);
    jf.add(jb);
    jf.setLayout(new FlowLayout());  
    jf.setBounds(50,50,300,150);
    jf.setVisible(true);
    
  }
}
