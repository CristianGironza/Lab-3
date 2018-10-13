package dataTrees;
/**
 * Represent a generic tree structure 
 * */
public class ABBTree {
	
	/**
	 * root : is the root of the tree ABB
	 * for more information of this object see the class Node 
	 * */
	private Node root; 
	/**
	 * size : is a int that represent of the size of the tree 
	 * */
	private int size;
	
	/**
	 * the constructor of the class ABBTree
	 * */
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

	/**
	 * add : this method, add nodes to the tree
	 * @param n : Node - the new element that has been to the tree 
	 * @return void 
	 * */
	public void add(Node n) {
		
		if (root == null) {
			root = n;
			size++; 
		}
		else 
			add( n, root);
	}
		
	/**
	 * add : this method, add nodes to the tree
	 * @param n       : Node - the new element that has been to the tree 
	 * 		  auxNode : Node - the before node to n 
	 * @return void 	
	 * */
	private void add(Node n , Node auxRoot) {
		
		if (n.compareTo(auxRoot) < 0) {
			if(auxRoot.haveLeftSon()) {
				add(n, auxRoot.getLeft());
				size++;
			}
				
			else { 
				auxRoot.setLeft(n);
				size++;
			}
		}
	
		else {
			if(auxRoot.haveRightSon()) {
				add(n, auxRoot.getRight());
				size++;	
			}
			else {
				auxRoot.setRight(n);
				size++;
			}
		}
	}

	/**
	 * leftRotete : -this method help to balance the trees AVL and Black and Red trees
	 * 				-this method change two Nodes to stabilize the tree in such a way
	 * 				 that the tree remain a ABB 
	 *  
	 * @param actual : Node - the Node that needs rotate 
	 * @return void 
	 * */
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
	
	/**
	 * rigthRotete : -this method help to balance the trees AVL and Black and Red trees
	 * 				-this method change two Nodes to stabilize the tree in such a way
	 * 				 that the tree remain a ABB 
	 *  
	 * @param actual : Node - the Node that needs rotate 
	 * @return void 
	 * */
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
	


