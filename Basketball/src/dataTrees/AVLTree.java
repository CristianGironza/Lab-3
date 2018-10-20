package dataTrees;

public class AVLTree extends ABBTree {

	private NodeAVL root; 
	
	public AVLTree(NodeAVL root, int size) {
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
	public void leftRotete(NodeAVL actual) {
		
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
	public void rigthRotete(NodeAVL actual) {
		
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
	
	
	public void balancedTree(NodeAVL newAVL, NodeAVL fatherAVL) {
		
		do {
			 // balance_factor(P) has not yet been updated!
			 if (newAVL.isLeftSon()) { // the left subtree increases
			 if (fatherAVL.calculateBalanceFactor() == 1) { // The left column in the picture
				 // ==> the temporary balance_factor(P) == 2 ==> rebalancing is required.
				 if (newAVL.calculateBalanceFactor() == -1) { // Left Right Case
					 leftRotete(newAVL); // Reduce to Left Left Case
				 }
				 // Left Left Case
				 rigthRotete(fatherAVL);
				 break; // Leave the loop
			 }
			 else if (fatherAVL.calculateBalanceFactor() == -1) {
				 fatherAVL.setBalanceFactor(0);  // N’s height increase is absorbed at P.
				 break; // Leave the loop
			 }
			 fatherAVL.setBalanceFactor(1);  // Height increases at P
			 
			 } else { // N == right_child(P), the child whose height increases by 1.
				 if (fatherAVL.calculateBalanceFactor() == -1) { // The right column in the picture
				 // ==> the temporary balance_factor(P) == -2 ==> rebalancing is required.
				 if (newAVL.calculateBalanceFactor() == 1) { // Right Left Case
				 rigthRotete(newAVL); // Reduce to Right Right Case
				 }
				 // Right Right Case
				 leftRotete(fatherAVL);
				 break; // Leave the loop
				 }
				 if (fatherAVL.calculateBalanceFactor() == 1) {
					 fatherAVL.setBalanceFactor(0);  // N’s height increase is absorbed at P.
					 break; // Leave the loop
				 }
				 fatherAVL.setBalanceFactor(-1);  // Height increases at P
			 }
			 newAVL = fatherAVL;
			 fatherAVL.setFather(newAVL);
			} while (fatherAVL != null); // Possibly up to t
		
		
	}

	
	
	
	
	
}
