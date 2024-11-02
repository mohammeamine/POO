package tp5;

public abstract class Forme {
	abstract double calculerSurface();
	abstract double calculerPerimetre();
	
}
	
 class Cercle extends Forme {
	    private double rayon;

	    public Cercle(double rayon) {
	        this.rayon = rayon;
	    }

	    @Override
	    public double calculerSurface() {
	        return Math.PI * rayon * rayon;
	    }
	    @Override
	    public double calculerPerimetre() {
	        return 2 * Math.PI * rayon;
	    }
	 }
 
 class Rectangle extends Forme{
	 private double largeur;
	    private double longueur;

	    public Rectangle(double largeur, double longueur) {
	        this.largeur = largeur;
	        this.longueur = longueur;
	    }

	    @Override
	    public double calculerSurface() {
	        return largeur * longueur;
	    }

	    @Override
	    public double calculerPerimetre() {
	        return 2 * (largeur + longueur);
	    }
 }
 
 class Triangle extends Forme{
	  private double coteA;
	    private double coteB;
	    private double coteC;

	    public Triangle(double coteA, double coteB, double coteC) {
	        this.coteA = coteA;
	        this.coteB = coteB;
	        this.coteC = coteC;
	    }

	    @Override
	    public double calculerSurface() {
	        double s = (coteA + coteB + coteC) / 2;
	        return Math.sqrt(s * (s - coteA) * (s - coteB) * (s - coteC));
	    }

	    @Override
	    public double calculerPerimetre() {
	        return coteA + coteB + coteC;
	    }
 }
 
