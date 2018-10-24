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
	