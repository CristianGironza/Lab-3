package dataTrees;

/**
 * represent a Black and Red tree 
 * */
public class RedBlackTree extends ABBTree{

	private NodeBR root; 
	
	/**
	 * 
	 * */
	public RedBlackTree(NodeBR root, int size) {
		super(root, size);
		
	}

	/**
	 * leftRotete : -this method help to balance the trees AVL and Black and Red trees
	 * 				-this method change two Nodes to stabilize the tree in such a way
	 * 				 that the tree remain a ABB 
	 *  
	 * @param actual : Node - the Node that needs rotate 
	 * @return void 
	 * */
	public void leftRotete(NodeBR actual) {
		
		if (actual.getFather() != null) {

			NodeABB x = actual.getFather(); 
				
			 if (actual.getLeft() != null) {
				 NodeABB b = actual.getLeft();
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
	public void rigthRotete(NodeBR actual) {
		
		if (actual.getFather() != null) {

			NodeABB y = actual.getFather(); 
				
			 if (actual.getRight() != null) {
				 NodeABB b = actual.getRight();
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
	
	public void add(NodeBR newBR) {
		addCase1(newBR);
	}
	
	private void addCase1(NodeBR newBR) {
		addNode(newBR);
		
		if (newBR.getFather() == null) { 
			newBR.setColor(NodeBR.BLACK);
		}
		else {
			addCase2(newBR);
		}
		
	}
	
	private void addCase2(NodeBR newBR) {
		
		if ( ( ((NodeBR) newBR.getFather()).getColor() == NodeBR.RED ) && 
				( newBR.getUncle().getColor() == NodeBR.RED ) ) {
			
			((NodeBR) newBR.getFather()).repaint();
			newBR.getUncle().repaint();
			newBR.getGrandFather().repaint();
			addCase1(newBR);
		}
		else {
			addCase3(newBR);
		}
	}
	
	private void addCase3(NodeBR newBR) {
		
		if ( newBR.isRigthSon() && newBR.getFather().isLeftSon() ) {
			leftRotete((NodeBR)newBR.getFather());
			
		}
		else if (newBR.isLeftSon() && newBR.getFather().isRigthSon()) {
			rigthRotete((NodeBR)newBR.getFather());
			
		}
		else {
			addCase4(newBR);
		}
	}

	private void addCase4(NodeBR newBR) {
		((NodeBR)newBR.getFather()).setColor(NodeBR.BLACK);
		newBR.getGrandFather().setColor(NodeBR.RED);
		
		if(newBR.isLeftSon() && newBR.getFather().isLeftSon()) {
			rigthRotete(newBR.getGrandFather());
		}else {
			leftRotete(newBR.getGrandFather());
		}
		
	}
	
	
	
	
}
	
