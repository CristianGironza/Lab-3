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
		int p1 , p2 ;
		if ( this.getLeft() == null )
			p1 = 0 ;
		else
			p1 = ((NodeAVL) this.getLeft()).calculateBalanceFactor() ;
		if ( this.getRight() == null )
			p2 = 0 ;
		else
			p2 = ((NodeAVL) this.getRight()).calculateBalanceFactor() ;
		return p1 - p2 ;
			
		 
	}
	
	
	
	
	
}