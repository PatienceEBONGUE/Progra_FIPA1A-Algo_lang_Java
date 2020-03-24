package gps;

class CityId {
	private String name; 
	
	public CityId (String name) {
		this.name = name; 
	}
	
	public String toString() {
		return name; 
	}
	
	public boolean equals(Object o) {
		if (o instanceof CityId) {
			CityId new_name = (CityId) o;
			return name.equals(new_name.name);
		}
		return false;
	}

	public  int hasCode() {
		return name.hashCode();
	}
	
}

// private E[] elements = new Objects[nb_elements];