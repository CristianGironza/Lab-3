package dataTrees;

public class Node <K,V> implements Comparable<V> {
	
	private K key; 
	private V value;

	//only for black and red trees 
	public final static int BLACK = 0; 
	public final static int RED = 1; 
	private int color; 
	
	private Node father;
	private Node left; 
	private Node right;
	
	// only for black and red trees
	private Node uncle; 
	private Node grandFather; 
	
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

	public boolean haveLeftSon() {
		return this.getLeft() != null; 
	}
	
	public boolean haveRightSon() {
		return this.getRight() != null; 
	}
	
	public boolean isLeftSon() {
		return this.getFather() != null && this.getFather().getLeft() == this; 
	}
	
	public boolean isRigthSon() {
		return this.getFather() != null && this.getFather().getRight() == this; 
	}
	
	public boolean isRoot() {
		return this.getFather() == null; 
	}
	
	public boolean isSon() {
		return this.getLeft() == null && this.getRight() == null; 
	}
	
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
