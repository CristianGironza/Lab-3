package dataTrees;

/**
 * this class contain:
 * - key   : which is the criterion of search. 
 * - value : which is the number in which contain the object or objects 
 * 			 whit the same value   
 * */
public class Node <K,V> implements Comparable<V> {
	
	private K key; 
	private V value;

  //----------------------------------------\\
 //      ONLY FOR BLACK AND RED TREES        \\
//--------------------------------------------\\
	
	/**
	 * this constant represent the color black 
	 * this is only black and red trees
	 * */
	public final static int BLACK = 0; 
	
	/**
	 * this constant represent the color black 
	 * this is only black and red trees
	 * */
	public final static int RED = 1; 
	
	/**
	 * represent the color of Node 
	 * this is only black and red trees
	 * */
	private int color; 
	
	/**
	 * represent the "uncle" of the Node
	 * this is only black and red trees 
	 * */
	private Node uncle; 
	
	/**
	 * represent the "grandFather" of the Node
	 * this is only black and red trees 
	 * */
	private Node grandFather; 
	
//--------------------------------------------------\\	
	
	/**
	 * represent the father of Node 
	 * */
	private Node father;
	
	/**
	 * represent the left son of the Node
	 * */
	private Node left; 
	
	/**
	 * represent the right of the Node 
	 * */
	private Node right;
	
	/**
	 * initialize a generic Node 
	 * */
	public Node(K key, V value, int color, Node father, Node left, Node right, Node uncle, Node grandFather) {
		super();
		this.key = key;
		this.value = value;
		this.color = color;
		this.father = father;
		this.left = left;
		this.right = right;
		this.uncle = uncle;
		this.grandFather = grandFather;
	}

	public Node getFather() {
		return father;
	}

	public void setFather(Node father) {
		this.father = father;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
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

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public Node getUncle() {
		return uncle;
	}

	public void setUncle(Node uncle) {
		this.uncle = uncle;
	}

	public Node getGrandFather() {
		return grandFather;
	}

	public void setGrandFather(Node grandFather) {
		this.grandFather = grandFather;
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
	
	/**
	 * repaint() : this method chance the color of the actual Node
	 * this is only black and red trees 
	 * */
	public void repaint() {
		if (this.getColor() == 0) 
			this.setColor(RED);
		
		else
			this.setColor(BLACK);
		
	}

	
	
	
	
	
	
	
	
	
	
	@Override
	public int compareTo(V o) {
		 
		
		
		return 0;
	}
	
	
	
	
	
	
}
