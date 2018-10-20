package dataTrees;

public class NodeBR extends NodeABB {

	/**
	 * this constant represent the color black 
	 * this is only black and red trees
	 * */
	public final static int BLACK = 0; 
	
	/**
	 * this constant represent the color black 
	 * this is only black and red trees
	 * */
	public final static int RED = 1; 
	
	/**
	 * represent the color of Node 
	 * this is only black and red trees
	 * */
	private int color; 
	
	/**
	 * represent the "uncle" of the Node
	 * this is only black and red trees 
	 * */
	private NodeBR uncle; 
	
	/**
	 * represent the "grandFather" of the Node
	 * this is only black and red trees 
	 * */
	private NodeBR grandFather;

	
	public NodeBR(Object key, Object value, NodeABB father, NodeABB left, NodeABB right, 
			int color, NodeBR uncle, NodeBR grandFather) {
		super(key, value, father, left, right);
		this.color = color;
		this.uncle = uncle;
		this.grandFather = grandFather;
	}

	
	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public NodeABB getUncle() {
		return uncle;
	}

	public void setUncle(NodeBR uncle) {
		this.uncle = uncle;
	}

	public NodeABB getGrandFather() {
		return grandFather;
	}

	public void setGrandFather(NodeBR grandFather) {
		this.grandFather = grandFather;
	}

	/**
	 * repaint() : this method chance the color of the actual Node 
	 * */
	public void repaint() {
		if (this.getColor() == 0) 
			this.setColor(RED);
		
		else
			this.setColor(BLACK);
		
	}

	
	
	
	
	
	
}
