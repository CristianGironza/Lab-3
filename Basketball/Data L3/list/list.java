package list;

public class list<T> {
	
	private T first;

	public list(T first) {
		this.first = first;
	} 
	
	public void add (T nodeN) {
		
		T auxFirst = first; 
		
		if(first == null ) {
			first = nodeN; 
		}
		else {
			add(nodeN, auxFirst); 
		}
		
	}
	
	public void add( T nodeN , T predecessor ) {
		
		
		
		
		
	}
	
	
	
	
}
