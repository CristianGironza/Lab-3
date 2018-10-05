package list;

public class NodeList<T> implements INodeList{
	
	private T next ;

	public NodeList(T next) {
		
		this.next = next;
	}

	public T getNext() {
		return next;
	}

	public void setNext(NodeList<T> newNext) {
		this.next = (T) newNext;
	} 
	
	@Override
	public void suspendNext() {
		NodeList<T> delt = (NodeList<T>) this.getNext(); 
		NodeList<T> newNext = (NodeList<T>) delt.getNext(); 
		this.setNext(newNext);
		
	}
	
	
	
	
	

}
