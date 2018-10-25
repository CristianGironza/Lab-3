package dataTrees;

/**
 * this class contain:
 * - key   : which is the criterion of search. 
 * - value : which is the number in which contain the object or objects 
 * 			 whit the same value   
 * */
public class NodeABB <T> implements Comparable<NodeABB> {
	
	protected final static String[] CRITERIOS = {"name", "age","height", "baskets", "passes" };
	
	/**
	 * represent the next node in the case of the nodes have the same key 
	 * */
	private NodeABB next; 
	
	/**
	 * represent the criterion of ordering of the tree 
	 * */
	private String key; 
	
	/**
	 * represent the father of Node 
	 * */
	private NodeABB father;
	
	/**
	 * represent the left son of the Node
	 * */
	private NodeABB left; 
	
	/**
	 * represent the right of the Node 
	 * */
	private NodeABB right;
	
	/**
	 * initialize a generic Node 
	 * */
	public NodeABB(NodeABB next,String key ,NodeABB father, NodeABB left, NodeABB right) {
		this.next = next;
		this.key = key ; 
		this.father = father;
		this.left = left;
		this.right = right;
	}

	public NodeABB getNext() {
		return next;
	}

	public void setNext(NodeABB next) {
//		if(this.getNext() == null ) {
			this.next = next;
//			return; 
//		} 
//		else {
//			setNext(this.getNext());	 
//		}
	}

	public NodeABB getLast(NodeABB actual) {
		if (actual.getNext() != null)
			return getLast(actual.getNext());
		else
			return actual; 
	}
	
	public NodeABB getFather() {
		return father;
	}

	public void setFather(NodeABB father) {
		this.father = father;
	}

	public NodeABB getLeft() {
		return left;
	}

	public void setLeft(NodeABB left) {
		this.left = left;
	}

	public NodeABB getRight() {
		return right;
	}

	public void setRight(NodeABB right) {
		this.right = right;
	}
	
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * haveLeftSon() : evaluate if the actual Node have a left son 
	 * @return true  : if the Node have a left son 
	 * 		   false : if the Node don't have a left son
	 * */
	public boolean haveLeftSon() {
		return this.getLeft() != null; 
	}
	
	/**
	 * haveRighSon() : evaluate if the actual Node have a right son 
	 * @return true  : if the Node have a right son 
	 * 		   false : if the Node don't have a right son
	 * */
	public boolean haveRightSon() {
		return this.getRight() != null; 
	}
	
	/**
	 * isRighSon()   : evaluate if the actual Node is a right son 
	 * @return true  : if the Node is a right son 
	 * 		   false : if the Node is not a right son
	 * */
	public boolean isLeftSon() {
		return this.getFather() != null && this.getFather().getLeft() == this; 
	}
	
	/**
	 * isLeftSon()   : evaluate if the actual Node is a left son 
	 * @return true  : if the Node is a left son 
	 * 		   false : if the Node is not a left son
	 * */
	public boolean isRigthSon() {
		return this.getFather() != null && this.getFather().getRight() == this; 
	}
	
	/**
	 * isRoot()      : evaluate if the actual Node is a root of the tree
	 * @return true  : if the Node is the root 
	 * 		   false : if the Node is not the root
	 * */
	public boolean isRoot() {
		return this.getFather() == null; 
	}
	
	/**
	 * isSon()       : evaluate if the actual Node is a son 
	 * @return true  : if the Node is a son 
	 * 		   false : if the Node is not a son
	 * */
	public boolean isSon() {
		return this.getLeft() == null && this.getRight() == null; 
	}

	public int calculateHeight() {
	   int height = 0; 
		if (this.isSon())
	    	return height; 
		
	    else if (this != null) {
	    	height++; 
	        return this.left.calculateHeight() +  this.right.calculateHeight();        
	    }
	    return height; 
	 }
	
	/**
	 * search : search the node or nodes with the same key  
	 * @param key : String represent the criterion of ordering 
	 * @return the NodeABB that has been search 
	 * */
	public NodeABB search ( String key ) {
		if ( key == this.key )
		return this ;
		else if ( key.compareTo(this.key) < 0 ) {
			if ( left == null )
				return null ;
			else
				return left.search(key);
		}
		else {
			if ( right == null )
				return null ;
			else
				return right.search(key) ;
		}
	}
	

	private NodeABB getMax ( ) {
		if (right == null) 
			return this;
		else
			return right.getMax();
	}

	private NodeABB getMin() {
		if(left == null) 
			return this;
		else 
			return left.getMin(); 
	}
	
	
	public NodeABB getSuccessor() {
		return this.getMax().getMin(); 
	}
	
	
	/**
	 * compare to NodeABB whit other NoteABB depending of criterion 
	 * */
	@Override
	public int compareTo(NodeABB o) {
		
		int result = this.getKey().compareTo(o.getKey()); 
		
		return result;
	}
	
	
	
	
	
	
}