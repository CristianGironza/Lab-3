package testDataTree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dataTrees.ABBTree;
import dataTrees.NodeABB;

class TestABBTree {

	private ABBTree theTree; 
	
	private void setUpCase1() {
		theTree = new ABBTree(null, 0); 
	}
	
	@Test
	void testAdd1() {
		setUpCase1();
		NodeABB theRoot = new NodeABB(null,"1", null, null, null);
		theTree.addNode(theRoot);
		
		assertTrue(theTree.getRoot().getKey() == theRoot.getKey());
		
	}
	
	@Test
	void testAdd2() {
		setUpCase1();
		NodeABB theRoot 	 = new NodeABB(null,"5", null, null, null);
		NodeABB thelefson 	 = new NodeABB(null,"3", null, null, null);
		NodeABB theRighson 	 = new NodeABB(null,"7", null, null, null);
		NodeABB otherLeftson = new NodeABB(null,"2", null, null, null);
		NodeABB theSusesor 	 = new NodeABB(null,"4", null, null, null);
		
		theTree.addNode(theRoot      );
		theTree.addNode(thelefson    );
		theTree.addNode(theRighson   );
		theTree.addNode(otherLeftson );
		theTree.addNode(theSusesor   );
		
		System.out.println(theTree.getRoot().getLeft().getKey());
		System.out.println(thelefson.getKey());
		
		assertTrue(theTree.getRoot().getKey() == theRoot.getKey());
		assertTrue(theTree.getRoot().getLeft().getKey() == thelefson.getKey());
		assertTrue(theTree.getRoot().getRight().getKey() == theRighson.getKey());
		assertTrue(theTree.getRoot().getLeft().getLeft().getKey() == otherLeftson.getKey());
		assertTrue(theTree.getRoot().getSuccessor().getKey() == theSusesor.getKey());
		
	}
	
	
	
	
	
}