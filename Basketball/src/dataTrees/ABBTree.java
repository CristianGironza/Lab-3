package dataTrees;
/**
 * Represent a generic tree structure 
 * */
public class ABBTree {
	
	/**
	 * root : is the root of the tree ABB
	 * for more information of this object see the class Node 
	 * */
	private NodeABB root; 
	/**
	 * size : is a int that represent of the size of the tree 
	 * */
	private int size;
	
	/**
	 * the constructor of the class ABBTree
	 * */
	public ABBTree(NodeABB root, int size) {
		this.root = root;
		this.size = size;
	}

	public NodeABB getRoot() {
		return root;
	}

	public void setRoot(NodeABB root) {
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
	public void add(NodeABB n) {
		
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
	private void add(NodeABB n , NodeABB auxRoot) {
		
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

	public NodeABB buscar ( K key ) {
		if ( root == null )
		return null ;
		else
		root.buscar ( key ) ;
		}
	

	
	
	
	
	
}
	


