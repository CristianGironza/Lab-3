package list;

public class NodeList<T> implements INodeList{
	
	private T next ;

	public NodeList(T next) {
		
		this.next = next;
	}

	public T getNext() {
		return next;
	}

	public void setNext(T newNext) {
		this.next = newNext;
	} 
	
	@Override
	public void suspendNext() {
		T delt =  this.getNext(); 
//		T newNext =  delt.getNext(); 
//		this.setNext(newNext);
		
	}
	
	
	
	
	

}
