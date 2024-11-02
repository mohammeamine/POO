package pr;


class Vehicule {
 public void seDeplacer() {
     System.out.println("Le véhicule se déplace.");
 }
}

class Voiture extends Vehicule {
 @Override
 public void seDeplacer() {
     System.out.println("La voiture roule sur la route.");
 }
}

class Velo extends Vehicule {
 @Override
 public void seDeplacer() {
     System.out.println("Le vélo est pédalé sur la piste cyclable.");
 }
}

