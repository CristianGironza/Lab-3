package dataTrees;

public class NodeAVL extends NodeABB{

	private int balanceFactor;

	public NodeAVL(Object key, Object value, NodeABB father, NodeABB left, NodeABB right, int balanceFactor) {
		super(key, value, father, left, right);
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
