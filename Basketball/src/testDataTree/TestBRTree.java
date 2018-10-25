package testDataTree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dataTrees.NodeBR;
import dataTrees.RedBlackTree;

class TestBRTree {

	private RedBlackTree theTree; 
	
	private void setUpCase1() {
		theTree = new RedBlackTree(null, 0); 
	}
	
	
	@Test
	void testAdd() {
		setUpCase1();
		
		NodeBR theRoot = new NodeBR(null, "7", null, null, null, 1, null, null);
		NodeBR node1 = new NodeBR(null, "20", null, null, null, 1, null, null);
		NodeBR node2 = new NodeBR(null, "1", null, null, null, 1, null, null);
		NodeBR node3 = new NodeBR(null, "0", null, null, null, 1, null, null);
		NodeBR node4 = new NodeBR(null, "12", null, null, null, 1, null, null);
		NodeBR node5 = new NodeBR(null, "5", null, null, null, 1, null, null);
		NodeBR node6 = new NodeBR(null, "3", null, null, null, 1, null, null);
		NodeBR node7 = new NodeBR(null, "2", null, null, null, 1, null, null);
		NodeBR node8 = new NodeBR(null, "13", null, null, null, 1, null, null);
		NodeBR node9 = new NodeBR(null, "4", null, null, null, 1, null, null);
		NodeBR node10 = new NodeBR(null, "45", null, null, null, 1, null, null);
		
		theTree.add(theRoot);
		theTree.add(node1);
		theTree.add(node2);
		theTree.add(node3);
		theTree.add(node4);
		theTree.add(node5);
		theTree.add(node6);
		theTree.add(node7);
		theTree.add(node8);
		theTree.add(node9);
		theTree.add(node10);
		
		assertTrue( (theTree.getRoot().getKey() == theRoot.getKey()) && (theRoot.getColor() == NodeBR.BLACK));
		assertTrue( (theTree.getRoot().getLeft().getKey() == node2.getKey()) && (node2.getColor() == NodeBR.BLACK) );
		assertTrue( (theTree.getRoot().getLeft().getLeft().getKey() == node3.getKey()) && (node3.getColor() == NodeBR.BLACK) );
		assertTrue( (theTree.getRoot().getLeft().getRight().getKey() == node6.getKey()) && (node6.getColor() == NodeBR.BLACK) );
		assertTrue( (theTree.getRoot().getRight().getKey() == node8.getKey()) && (node8.getColor() == NodeBR.BLACK) );
		assertTrue( (theTree.getRoot().getRight().getRight().getKey() == node1.getKey()) && (node1.getColor() == NodeBR.RED) );
		assertTrue( (theTree.getRoot().getRight().getRight().getRight().getKey() == node10.getKey()) && (node10.getColor() == NodeBR.BLACK) );
		assertTrue( (theTree.getRoot().getRight().getLeft().getKey() == node4.getKey()) && (node4.getColor() == NodeBR.BLACK) );
		assertTrue( (theTree.getRoot().getLeft().getLeft().getRight().getKey() == node7.getKey()) && (node7.getColor() == NodeBR.RED) );
		assertTrue( (theTree.getRoot().getLeft().getLeft().getLeft().getRight().getKey() == node4.getKey()) && (node4.getColor() == NodeBR.RED) );
		
		
		
//		
//		
//		
//		
//		
//		assertTrue( (theTree.getRoot().getRight().getRight().getLeft().getKey() == node4.getKey()) && (node4.getColor() == NodeBR.BLACK) );
//		assertTrue( (theTree.getRoot().getRight().getRight().getLeft().getRight().getKey() == node8.getKey()) && (node8.getColor() == NodeBR.RED) );
//		
		
		
		
	}

}
