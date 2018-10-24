package dataTrees;

public class AVLTree extends ABBTree {

	private NodeAVL root; 
	
	public AVLTree(NodeAVL root, int size) {
		super(root, size);

	}
	
	public NodeAVL getRoot() {
		return root;
	}

	public void setRoot(NodeAVL root) {
		this.root = root;
	}

	/**
	 * balancedTree : this method balanced the tree 
	 * @param NodeAVL newAVL    : the node has been added to tree
	 * 		  NodeAVL fatherAVL : the node that is father of newAVL 
	 * */
	public void balancedTree(NodeAVL newAVL, NodeAVL fatherAVL) {
		boolean balanced = false; 
		
		do {
			 // balance_factor(P) has not yet been updated!
			 if (newAVL.isLeftSon()) { 
				 // the left subtree increases
				 if (fatherAVL.calculateBalanceFactor() == 1) { // The left column in the picture
					 // ==> the temporary balance_factor(P) == 2 ==> rebalancing is required.
					 if (newAVL.calculateBalanceFactor() == -1) { // Left Right Case
						 leftRotete(newAVL); // Reduce to Left Left Case
					 }
					 // Left Left Case
					 rigthRotete(fatherAVL);
					 balanced = true; // Leave the loop
				 }
				 else if (fatherAVL.calculateBalanceFactor() == -1) {
					 fatherAVL.setBalanceFactor(0);  // N’s height increase is absorbed at P.
					 balanced = true; // Leave the loop
			 }
			 fatherAVL.setBalanceFactor(1);  // Height increases at P
			 
			 } 
			 else { // N == right_child(P), the child whose height increases by 1.
				 if (fatherAVL.calculateBalanceFactor() == -1) { // The right column in the picture
					 // ==> the temporary balance_factor(P) == -2 ==> rebalancing is required.
					 if (newAVL.calculateBalanceFactor() == 1) { // Right Left Case
						 rigthRotete(newAVL); // Reduce to Right Right Case
					 }
					 // Right Right Case
					 leftRotete(fatherAVL);
					 balanced = true; // Leave the loop
				 }
				 if (fatherAVL.calculateBalanceFactor() == 1) {
					 fatherAVL.setBalanceFactor(0);  // N’s height increase is absorbed at P.
					 balanced = true; // Leave the loop
				 }
				 fatherAVL.setBalanceFactor(-1);  // Height increases at P
			 }
			 newAVL = fatherAVL;
			 fatherAVL.setFather(newAVL);
			} while (fatherAVL != null && !balanced); // Possibly up to t
	}

	
	
	
	
	
}