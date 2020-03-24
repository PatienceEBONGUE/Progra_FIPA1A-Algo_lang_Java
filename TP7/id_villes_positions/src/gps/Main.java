package gps;
import hashmap.ListMap;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
////		CityId evry1 = new CityId("Evry"); 
////		CityId evry2 = new CityId("Evry");
//		CityId start = new CityId("root"); 
//		CityId evry = new CityId("Evry"); 
//		CityId paris = new CityId("Paris");
//		CityId lemans = new CityId("Le Mans"); 
//		CityId toto = new CityId("toto"); 
//		Location toroot = new Location(0, 0);
//		Location tototo = new Location(0, 0);
//		Location toevry = new Location(48.629828, 2.4417819999999892);  
//		Location toparis = new Location(48.85661400000001, 2.3522219000000177); 
//		Location tolemans = new Location(48.00611000000001, 0.1995560000000296);
////		Location toevry1 = new Location(4.56, 5.86);
////		Location toevry2 = new Location(3.56, 4.86);
////		if (evry1 == evry2) System.out.println("True");
////		else System.out.println("False");
////		System.out.println(evry1.equals(evry2));
////		System.out.println(evry1.equals(new CityId("Paris")));
////		System.out.println(evry1.hasCode());
////		System.out.println(evry2.hasCode());
////	
////		ListMap<CityId, Location> noeud1 = new ListMap<CityId, Location>(evry1, toevry1);
//		ListMap<CityId, Location> root = new ListMap<CityId, Location>(start, toroot);
//		root.append(paris, toparis);
//		root.append(evry, toevry);
//		root.append(lemans, tolemans);
//		root.append(toto, tototo);
//		
//		//System.out.println(root.lookupNode(toto));
//		//System.out.println(root.get(toto));
//		System.out.println(root.remove(toto));
//		
//		root.display();
		ListMap<CityId, Location> map = new ListMap<CityId, Location>(null, null);

		map.put(new CityId("Evry"), new Location(48.629828, 2.4417819999999892));
		map.put(new CityId("Paris"), new Location(48.85661400000001, 2.3522219000000177));
		map.put(new CityId("Le Mans"), new Location(48.00611000000001, 0.1995560000000296));
		map.put(new CityId("Orléan"), new Location(47.902964, 1.9092510000000402));
		map.put(new CityId("Angers"), new Location(47.478419, -0.5631660000000238));
		map.put(new CityId("Tours"), new Location(47.39414399999999, 0.6848400000000083));
		map.put(new CityId("Bourges"), new Location(47.081012, 2.398781999999983));
		map.put(new CityId("Poitiers"), new Location(46.58022400000001, 0.34037499999999454));
		map.put(new CityId("Limoges"), new Location(45.83361900000001, 1.2611050000000432));
		map.put(new CityId("Angouleme"), new Location(45.648377, 0.15623690000006718));
		map.put(new CityId("Bordeaux"), new Location(44.837789, -0.5791799999999512));
		map.put(new CityId("Agen"), new Location(44.203142, 0.6163629999999785));
		map.put(new CityId("Toulouse"), new Location(43.604652, 1.4442090000000007));
		map.put(new CityId("Bayonne"), new Location(43.492949, -1.4748409999999694));
		map.put(new CityId("Pau"), new Location(43.2951, -0.3707970000000387));
		map.put(new CityId("San Sebastien"), new Location(43.318334, -1.9812312999999904));
		map.put(new CityId("Panpelune"), new Location(42.812526, -1.645774500000016));
		map.put(new CityId("Bilbao"), new Location(43.2630126, -2.9349852000000283));
					
		map.display();

		System.out.println(map.get(new CityId("Bilbao")));
		map.remove(new CityId("Bilbao"));
		System.out.println(map.get(new CityId("Bilbao")));
	}

}

