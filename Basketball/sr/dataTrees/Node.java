package dataTrees;

public class Node <K,V> implements Comparable<V> {
	
	private K key; 
	private V value;
	
	private Node father;
	private Node left; 
	private Node right;
	
	public Node(K key , V value, Node left , Node right, Node father) {
		this.key = key;
		this.value = value; 
		this.left = left; 
		this.right = right;
		this.father = father; 
		
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
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public int compareTo(V o) {
		 
		
		
		return 0;
	}
	
	
	
	
	
	
}
