package dataTrees;

public class ABBTree {
	
	private Node root; 
	private int size;
	
	public ABBTree(Node root, int size) {
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

	public void leftRotete(Node actual) {
		
		if (actual.getFather() != null) {

			Node x = actual.getFather(); 
				
			 if (actual.getLeft() != null) {
				 Node b = actual.getLeft();
				 x.setRight(b); 
			 }
			 actual.setFather(x.getFather());
			
			 if(x.getFather() == null) 
				 root = actual ; 
			 
			 else if (x.isLeftSon()) 
				 x.getFather().setLeft(actual); 
			 
			 else 
				 x.getFather().setRight(actual);
			 
			actual.setLeft(x);
			actual.setFather(x.getFather()); 
		
		}
		 
	}
	

	public void rigthRotete(Node actual) {
		
		if (actual.getFather() != null) {

			Node y = actual.getFather(); 
				
			 if (actual.getRight() != null) {
				 Node b = actual.getRight();
				 y.setLeft(b); 
			 }
			 actual.setFather(y.getFather());
			
			 if(y.getFather() == null) 
				 root = actual; 
			 
			 else if (y.isLeftSon()) 
				 y.getFather().setLeft(actual); 
			 
			 else 
				 y.getFather().setRight(actual);
			 
			actual.setRight(y);
			actual.setFather(y.getFather()); 
			
		}
		 
	}
	

	
	
	
	
	
}
	


