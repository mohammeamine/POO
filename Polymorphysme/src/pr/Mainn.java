package pr;

public class Mainn {

	public static void main(String[] args) {
		 Employe[] employes = new Employe[4];
		 
		 employes[0]= new Developpeur("JAVA","Amine",10000.00);
		 employes[1]= new Manager(5,"Ahmed",20000.00);
		 employes[2]= new Developpeur("JAVA","Amine",10000.00);
		 employes[3]= new Manager(10,"Med Amine",25000.00);
		 for(int i=0;i<4;i++){
			 employes[i].afficherinfo();
		 }
		 //		 Upcasting:
		 Employe employe = new Developpeur("Java","Amine3" , 10000);
		 employe.afficherinfo();
		 //		 Downcasting:
		 Employe employe5 = new Developpeur("Java","Amine4" , 15000);
		 if(employe5 instanceof Developpeur ){
			 employe5.afficherinfo();
		 }
		 
	}

}
