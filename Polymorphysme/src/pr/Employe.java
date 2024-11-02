package pr;

public class Employe {
	String nom;
	double salaire;
	
	public Employe(String nom , double salaire){
		this.nom=nom;
		this.salaire=salaire;
	}
	
	public void afficherinfo(){
		System.out.println("Le nom de l'employe est:  "+nom);
		System.out.println("Le salaire de l'employe est:  "+salaire);
	}
	
}
	
	class Developpeur extends Employe{
		String langage;
		
		public Developpeur(String langage, String nom, double salaire){
			super(nom,salaire);
			this.langage=langage;
		}
		
		@Override
		public void afficherinfo(){
			super.afficherinfo();
			System.out.println("La langage de programmation de l'employe est:  "+langage);
		}
		public void afficherlangage(){
			System.out.println("La langage de programmation de l'employe est:  "+langage);
		}
		
	}
	
		class Manager extends Employe{
			int nombreDeSubordonnes;
			public Manager(int nombreDeSubordonnes, String nom, double salaire){
				super(nom,salaire);
				this.nombreDeSubordonnes=nombreDeSubordonnes;
			}
			@Override
			public void afficherinfo(){
				super.afficherinfo();
				System.out.println("Le nombre de subordonnées est:  "+nombreDeSubordonnes);
			}
			
			public void gererEquipe(){
				System.out.println(nom+ "gere l'équipe des développeurs");
			}
			
		}


