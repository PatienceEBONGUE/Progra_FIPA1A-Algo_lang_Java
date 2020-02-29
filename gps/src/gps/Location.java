package gps;

public class Location {

	private double latitude;
	private double longitude; 
	
	Location(double latitude, double longitude){
		this.latitude = latitude;
		this.longitude = longitude; 
	}
	
	public String toString() {
		String lat = String.valueOf(latitude);
		String lon = String.valueOf(longitude);
		return ""+lat+","+lon+"";  
	}
}
