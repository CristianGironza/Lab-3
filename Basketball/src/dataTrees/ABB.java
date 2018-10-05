package dataTrees;

public class ABB {
	
	private Node root; 
	private int size;
	
	
	public ABB(Node root, int size) {
		this.root = root;
		this.size = size;
	}

	public Node getRoot() {
		return root;
	}


	public void setRoot(Node root) {
		this.root = root;
	}


	public int getSize() {
		return size;
	}

	public void add(Node n) {
		
		if (root == null)
			root = n;
		
		else 
			add( n, root);
	}
	
	
	public void add(Node n , Node auxRoot) {
		
		if (n.compareTo(auxRoot) < 0) {
			if(auxRoot.haveLeftSon())
				add(n, auxRoot.getLeft());
			else 
				auxRoot.setLeft(n); 
		}
	
		else {
			if(auxRoot.haveRightSon())
				add(n, auxRoot.getRight());
			else 
				auxRoot.setRight(n);
		}
		
		
		
	}
	
	
}
	


