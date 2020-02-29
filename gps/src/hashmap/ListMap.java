package hashmap;

public class ListMap<K, V> {

	private ListMap<K, V> next; 
	private ListMap<K, V> prev;
	private K key;
	private V value; 

	public ListMap (K key, V value) {
		this.key = key; 
		this.value = value;
		this.next = this;
		this.prev = this;
	}
	
	public String toString() {
		String k = key.toString();
		String v = value.toString();
		return "("+k+","+v+")";
	}
	
	public void append (K key, V value) {
		ListMap<K, V> noeud = new ListMap<K, V>(key, value);
		noeud.next = this.next; 
		noeud.prev = this; 
		this.next.prev = noeud;
		this.next = noeud;  
	}
	
	public void display() {
		while (this.next != this )  {
			System.out.println(this.next.toString());
		this.next = this.next.next;
		}
	}
	public ListMap<K, V> lookupNode(K key){
		while (this.next != this )  {
			if (this.next.key.equals(key)) {
				ListMap<K, V> val = this.next;
				return val;
			}
		this.next = this.next.next;
		}
		ListMap<K, V> val = null ;
		
		return val;
	}
	
	public V get(K key) {
		
		if (this.lookupNode(key) == null) {
			return	null; 
		}
		return this.lookupNode(key).value; 
	}
	
	public boolean remove(K key) {
		if (this.lookupNode(key) != null) {
		this.lookupNode(key).next.prev = this.lookupNode(key).prev;
		this.lookupNode(key).prev.next = this.lookupNode(key).next; 
			return true;
		}
		return false; 
		
	}
	
	public boolean put (K key, V value) {
		if (this.lookupNode(key) == null) {
			this.next.append(key, value);
			return true;
		}
		else if ((this.lookupNode(key) != null) && (this.get(key) != value) ) {
			this.next.lookupNode(key).value = value;
			return false;
		}
		
		return false;

	}
}
