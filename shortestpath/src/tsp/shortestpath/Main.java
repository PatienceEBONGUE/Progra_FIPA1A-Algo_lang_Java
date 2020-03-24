package tsp.shortestpath;

public class Main {
	  public static void main(String[] args){
	// Création des villes et leurs coordonnées
	  Location evry = new Location("Evry", 48.629828, 2.4417819999999892);  
	  Location paris = new Location("Paris", 48.85661400000001, 2.3522219000000177); 
	  Location lemans = new Location("Le Mans", 48.00611000000001, 0.1995560000000296);
	  Location orleans = new Location("Orléans", 47.902964, 1.9092510000000402);
	  Location angers = new Location("Angers", 47.478419, -0.5631660000000238);
	  Location tours = new Location("Tours", 47.39414399999999, 0.6848400000000083);
	  Location bourges = new Location("Bourges", 47.081012, 2.398781999999983);
	  Location poitiers = new Location("Poitiers", 46.58022400000001, 0.34037499999999454);
	  Location limoges = new Location("Limoges", 45.83361900000001, 1.2611050000000432);
	  Location angouleme = new Location("Angouleme", 45.648377, 0.15623690000006718);
	  Location bordeaux = new Location("Bordeaux", 44.837789, -0.5791799999999512);
	  Location agen = new Location("Agen", 44.203142, 0.6163629999999785);
	  Location toulouse = new Location("Toulouse", 43.604652, 1.4442090000000007);
	  Location bayonne = new Location("Bayonne", 43.492949, -1.4748409999999694);
	  Location pau = new Location("Pau", 43.2951, -0.3707970000000387);
	  Location sansebestian = new Location("San Sebastian", 43.318334, -1.9812312999999904);
	  Location pampelune = new Location("Pampelune", 42.812526, -1.645774500000016);
	  Location bilbao = new Location("Bilbao", 43.2630126, -2.9349852000000283);
	  
//	  evry.display(); 
	  
	  // Création des routes entre les villes, assignation des voisins (neighbors) 
	  evry.setNeighbors(paris, bilbao);
//	  paris.setNeighbors(evry, lemans, orleans);
//	  lemans.setNeighbors(orleans, tours, angers);
//	  orleans.setNeighbors(lemans, paris, bourges, tours);
//	  angers.setNeighbors(lemans, tours, poitiers);
//	  tours.setNeighbors(angers, lemans, orleans, bourges, poitiers);
//	  bourges.setNeighbors(limoges, tours, orleans);
//	  poitiers.setNeighbors(limoges, angouleme);
//	  limoges.setNeighbors(agen, angouleme, poitiers);
//	  angouleme.setNeighbors(poitiers, limoges, agen, bordeaux);
//	  bordeaux.setNeighbors(angouleme, agen, bayonne);
//	  agen.setNeighbors(toulouse, pau, bordeaux, angouleme, limoges);
//	  toulouse.setNeighbors(agen, pau);
//	  bayonne.setNeighbors(bordeaux, pau, sansebestian);
//	  pau.setNeighbors(pampelune, bayonne, agen, toulouse);
//	  sansebestian.setNeighbors(bayonne, pampelune, bilbao);
//	  pampelune.setNeighbors(bilbao, sansebestian, pau);
//	  bilbao.setNeighbors(sansebestian, pampelune);
	  
	  // paris.distanceTo(evry); 
	  paris.getDistance(); 
		 }
	  
}

// Class Location pour l'instanciation d'une ville, 
class Location {
	String name; 
	double latitude; 
	double longitude; 
	Location [] neighbors; //création d'un champ référençant un tableau de locations villes 
	private double distance; 
	
	
	// Constructeur de la class Location, appelé pour créer un(e) objet/ville (this)
	Location (String name, double latitude, double longitude) {
		this.name = name; // le nom de la ville 
		// conversion des coordonnées de degé en radian
		this.latitude = (latitude * Math.PI)/180; // la latitude de la ville 
		this.longitude = (longitude * Math.PI )/180; // La longitude de la ville
		
		int Max = 100;
		int Min = 0;
		this.distance = Min + (int)(Math.random() * ((Max - Min) + 1));; 
	}

	// Affichage des coordonnées de la ville/objet
	void display () {
		System.out.println(name); 
		System.out.println(latitude);
		System.out.println(longitude);
		
	}
	
	// Calcul de la distance entre 2 villes 
	double distanceTo(Location to) {
		int R = 6378 ; // Rayon de la terre 
		// formule trigo pour le calcul de la distance entre 'to' et 'this'
		double distance = R * (Math.PI/2 - Math.asin(Math.sin(to.latitude) * Math.sin(this.latitude) + Math.cos(to.longitude - this.longitude) * Math.cos(to.latitude) * Math.cos(this.latitude)));
		System.out.println("The distance between "+this.name+" and "+to.name+" is "+distance+ " Km"); 
		return distance ; 
		
	}
		
	
	void setNeighbors (Location ...neighbors) {
		this.neighbors = neighbors;  // on assigne directement le tableau neighbors (paramètres) à l'attribut neighbors de l'objet
		
		// Boucle pour afficher le contenu du tableau de neighbors de la ville/objet
//		for (int i=0; i < neighbors.length; i++) {
//			System.out.println(this.neighbors[i].name);
//			this.distanceTo(neighbors[i]); 
//		}
		
		
	}
	
	
	double getDistance() {
		System.out.println(distance); 
		return distance; 
	}
}

// Class LocationSet pour trouver la ville avec le champ distance minimal
class LocationSet {
	private Location [] tab; 
	private int nbLocations ; 
	
	
	LocationSet() {
		tab = new Location[100];
		nbLocations = 0; 
	}
}