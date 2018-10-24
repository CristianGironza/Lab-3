package dataTrees;

public class NodeAVL extends NodeABB{

	private int balanceFactor;

	
	public NodeAVL(NodeABB next, String key, NodeABB father, NodeABB left, NodeABB right, int balanceFactor) {
		super(next, key, father, left, right);
		this.balanceFactor = balanceFactor;
	}

	public int getBalanceFactor() {
		return balanceFactor;
	}

	public void setBalanceFactor(int balanceFactor) {
		this.balanceFactor = balanceFactor;
	} 

	public int calculateBalanceFactor() {
		
		balanceFactor = this.getLeft().calculateHeight() - this.getRight().calculateHeight(); 
		return balanceFactor; 
	}
	
	
	
	
	
}