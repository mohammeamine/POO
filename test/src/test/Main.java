package test;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static int additionner(int a, int b) {
		return a + b;
	}
	public static int additionner(int a, int b, int c) {
		  return a + b + c;
		  }
	
    public static void main(String[] args) {
    	
    	 
   /*int nombre=42;
   System.out.println("Le nombre est:"+ nombre);
   
   double pi=3.14159;
   System.out.println("Le nombre est:"+ pi);
   
   String prenom="Amina";
   int age=19;
   System.out.println("Mon nom est " +prenom+	" et mon age est :"+age+"ans");
   
   int nmbr =-5;
    if (nmbr > 0) {
    System.out.println("Le nombre est positif.");
    } else {
    System.out.println("Le nombre est négatif.");
    }
         
    char grade = 'B';
     switch (grade) {
     case 'A':
     System.out.println("Excellent !");
     break;
     case 'B':
     System.out.println("Très bien !");
     break;
     case 'C':
     System.out.println("Bien.");
    break;
     case 'D':
     System.out.println("Passable.");
     break;
     case 'F':
     System.out.println("Échec.");
     break;
    default:
     System.out.println("Note inconnue.");
     break;
     }
     
     for (int i = 1; i <= 5; i++) {
    	  System.out.println(i);
    	  }
     int j=10;
     while(j>0){
    	 System.out.println(j); 
     }
     double temp=26;
     if(temp>25){
    	 System.out.println("Il fait chaud");
     }
     else{
    	 System.out.println("Il fait froid"); 
     }
    
     	boolean x = true;
     	 if(x=true ){
        	 System.out.println("La porte est ouverte");
         }
         else{
        	 System.out.println("La porte est fermée"); 
         }
     	 
     	 int n;
     	 
     	 System.out.println("Inserez la valeur de n:"); 
     	Scanner sc=new Scanner(System.in);
     	n=sc.nextInt();
     	if(n % 2 ==0){
     		System.out.println("Paire"); 
     	}
     	else{
     		System.out.println("Impaire"); 
     	}
     	
     	 char jour;
         System.out.println("Insérez le jour (L, M, W, J, V, S, D):");
         Scanner i = new Scanner(System.in);
         jour = i.next().charAt(0); 
         switch (jour) {
             case 'L':
                 System.out.println("Lundi");
                 break;
             case 'M':
                 System.out.println("Mardi");
                 break;
             case 'W':
                 System.out.println("Mercredi");
                 break;
             case 'J':
                 System.out.println("Jeudi");
                 break;
             case 'V':
                 System.out.println("Vendredi");
                 break;
             case 'S':
                 System.out.println("Samedi");
                 break;
             case 'D':
                 System.out.println("Dimanche");
                 break;
             default:
                 System.out.println("Jour invalide");
                 break;
         }
         i.close();
         
         int c;
         for(c=0;c<=10;c++){
        System.out.println(5*c);
        	} 
         */
    	
//    	int[] nombres ={1,2,3,4,5};
//    	
//    	for(int i=0;i<nombres.length;i++){
//    		System.out.println("nombres["+i+"]="+nombres[i]);
//    	}
//    	
//    	 String[] fruits = {"Pomme", "Banane", "Cerise"};
//    	  for (int i = 0; i < fruits.length; i++) {
//    	  System.out.println("fruits[" + i + "] = " + fruits
//    	 [i]);
//    	  }
    	  
//    	int[][] matrice ={
//    			{1, 2, 3},
//    			{4, 5, 6},
//    			{7, 8, 9}
//    	};
//    	for(int i=0;i<matrice.length;i++){
//    		for(int j=0;j<matrice[i].length;j++){
//    			System.out.println(matrice[i][j] + " ");
//    		}
//    		System.out.println();
//    	}
//    	
//    	 String salutations="Bonjour le monde ";
//    	 
//    	 String texte ="Programmation";
//    	 int longueur =texte.length();
//    	 char caractere=texte.charAt(5);
//    	 String sousChaine = texte.substring(0, 6);
//    	 String mot = "Programmation";
//    	  boolean estEgal = texte.equals(mot);
    	  
//    	String texte = "Bonjour";
//    	 String majuscules = texte.toUpperCase();
//    	 String minuscules = texte.toLowerCase();
 	
//				 int resultat = additionner(5, 7);
//				 System.out.println("Le résultat est : " + resultat);
    	
//    	 int somme2 = additionner(2, 3); 
//         int somme3 = additionner(1, 4, 5);
//         System.out.println("Le résultat est : " + somme2);
//         System.out.println("Le résultat est : " + somme3);
    	
//    	 double nombre = 16.0;
//    	 double racine = Math.sqrt(nombre); 
//    	 double puissance = Math.pow(2, 3); 
//    	   System.out.println("la racine est:"+ racine + " et la puissance est:" +  puissance);

    	
    	
    	
    	
    //  	TD 
    	
    	
//    	        int n;
//    	        double s = 0; 
//    	        Scanner scanner = new Scanner(System.in);
//    	        System.out.println("Veuillez insérer la valeur de n:");
//    	        n = scanner.nextInt(); 
//    	        for (int i = 1; i <= n; i++) {
//    	            s += 1.0 / i; 
//    	        }
//    	        System.out.println("La somme est: " + s);
//    	        scanner.close();
   
    	
    	
//    	        int so=0;
//    	        int i;
//    	        for (i=0;i<16;i++){
//    	        	if (i % 2!=0){
//    	        		so=so+i;	
//    	        	}
//    	        }
//    	        System.out.println("la somme des nombres impairs est:"+ so);
   
    	
    	
    	        
    	          
//    	        int max;
//    	        int min;
//    	        int somme=0;
//    	        int [] t=new int[10];
//    	        Scanner scan=new Scanner(System.in);
//    	        for(int j=0;j<10;j++){
//    	        	System.out.println("Inserez la valeur de t["+j+"]:");
//    	        	t[j]= scan.nextInt();
//    	        }
//    	        scan.close();
//    	        max=t[0];
//    	        for(int j=0;j<10;j++){
//    	        	if (max<t[j]){
//    	        		max=t[j];
//    	        	}
//    	        }
//    	        System.out.println("Le maximum est:"+max);
//    	        
//    	        min=t[0];
//    	        
//    	        for(int j=0;j<10;j++){
//    	        	if (min>t[j]){
//    	        		min=t[j];
//    	        	}
//    	        }
//    	        System.out.println("Le minimum est:"+min);
//    	        
//    	        for(int j=0;j<10;j++){
//    	        	somme=somme+t[j];
//    	        	}  	        
//    	        System.out.println("La somme est:"+somme);
    	        
    	
    	        
//    	     int note;
//    	     Scanner no=new Scanner(System.in);
//    	     System.out.println("Inserez une note:");
//    	     note = no.nextInt();
//    	     
//    	     if(note>=16 &&  note<=20){
//    	    	 System.out.println("Tres bien"); 
//    	     }
//    	     else if (note>=14 &&  note<=16){
//    	    	 System.out.println("bien");
//    	     }
//    	     else if (note>=12 &&  note<14){
//    	    	 System.out.println("Assez bien");
//    	     }
//    	     else {
//    	    	 
//    	    	 System.out.println("Passable"); 
//    	     }
//    	     
//   	     no.close();
    	
    	
//    	  int mo;
//	      Scanner mois =new Scanner(System.in);
//	     System.out.println("Inserez un nombre:");
//	     mo = mois.nextInt();         
//	         switch(mo){
//	         case 1:
//                 System.out.println("Janvier");
//                 break;
//             case 2:
//                 System.out.println("Fevrier");
//                 break;
//             case 3:
//                 System.out.println("Mars");
//                 break;
//             case 4:
//                 System.out.println("Avril");
//                 break;
//             case 5:
//                 System.out.println("Mai");
//                 break;
//             case 6:
//                 System.out.println("Juin");
//                 break;
//             case 7:
//                 System.out.println("Juillet");
//                 break;
//             case 8:
//                 System.out.println("Aout");
//                 break;
//             case 9:
//                 System.out.println("Septembre");
//                 break;
//             case 10:
//                 System.out.println("Octobre");
//                 break;
//             case 11:
//                 System.out.println("Novembre");
//                 break;
//             case 12:
//                 System.out.println("Decembre");
//                 break;
//             default:
//                 System.out.println("Mois invalide");
//                 break;
//	         }

    	
    	
//    	int e;
//    	int i = 0;  
//    	char star = '*';  
//    	Scanner etoile = new Scanner(System.in);
//    	System.out.println("Insérez la taille du triangle:");
//    	e = etoile.nextInt();  
//    	while (i < e) {
//    		for (int j = 0; j <= i; j++) {
//    			System.out.print(star); 
//    		}
//    		System.out.println();  
//    		i++;  
//    	}
//    	etoile.close(); 
    	
    	
//    	int i;
//    	int pr;
//    	 for (pr = 2; pr <= 100; pr++) {  
//             boolean isPrime = true;
//             for (i = 2; i <= pr-1; i++)  {
//            	 if(pr%i==0){
//            		 isPrime = false;
//            	 }
//             }
//             
//             if(isPrime){
//            	 System.out.println(pr + " est un nombre premier");
//             }
//    	  }
    	
//    	
//    	        int[][] notes = new int[5][4];  // 5 étudiants, 4 matières
//    	        Random rand = new Random();
//    	        for (int i = 0; i < 5; i++) {
//    	            for (int j = 0; j < 4; j++) {
//    	                notes[i][j] = rand.nextInt(21);  
//    	            }
//    	        }
//
//    	        String[] matieres = {"Math", "Physique", "Chimie", "Informatique"};
//    	        for (int i = 0; i < 5; i++) {
//    	            System.out.println("Étudiant " + (i + 1) + " :");
//    	            for (int j = 0; j < 4; j++) {
//    	                System.out.println("  " + matieres[j] + ": " + notes[i][j]);
//    	            }
//    	        }
    	
    	    
    
 
    	 
    	 
    	}
      }
