package dataTrees;

/**
 * this class contain:
 * - key   : which is the criterion of search. 
 * - value : which is the number in which contain the object or objects 
 * 			 whit the same value   
 * */
public class NodeABB <K,V> implements Comparable<V> {
	
	private K key; 
	private V value;
	
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
	public NodeABB(K key, V value, NodeABB father, NodeABB left, NodeABB right) {
		super();
		this.key = key;
		this.value = value;
		
		this.father = father;
		this.left = left;
		this.right = right;
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
	
	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
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
	

	
	
	@Override
	public int compareTo(V o) {
		 
		
		
		return 0;
	}
	
	
	
	
	
	
}
