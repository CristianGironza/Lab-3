package testDataTree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dataTrees.AVLTree;
import dataTrees.NodeAVL;

class TestAVLTree {

	private AVLTree theTree; 
	
	private void setUpCase() {
		theTree = new AVLTree(null, 0); 
	}
	
	
	@Test
	void testBalancedFactor() {
		setUpCase();
		
		NodeAVL theRoot = new NodeAVL(null, "5", null, null, null, 0);
		NodeAVL node1 = new NodeAVL(null, "7", null, null, null, 0);
		NodeAVL node2 = new NodeAVL(null, "3", null, null, null, 0);
		NodeAVL node3 = new NodeAVL(null, "8", null, null, null, 0);
		NodeAVL node4 = new NodeAVL(null, "4", null, null, null, 0);
		NodeAVL node5 = new NodeAVL(null, "10", null, null, null, 0);
		NodeAVL node6 = new NodeAVL(null, "12", null, null, null, 0);
		NodeAVL node7 = new NodeAVL(null, "2", null, null, null, 0);
		NodeAVL node8= new NodeAVL(null, "29", null, null, null, 0);
		NodeAVL node9 = new NodeAVL(null, "1", null, null, null, 0);
		NodeAVL node10 = new NodeAVL(null, "0", null, null, null, 0);
		
		theTree.addNode(theRoot);
		theTree.addNode(node1);
		theTree.balancedTree(node1, theRoot);
		theTree.addNode(node2);
		theTree.balancedTree(node2, (NodeAVL) node2.getFather());
		theTree.addNode(node3);
		theTree.balancedTree(node3, (NodeAVL) node3.getFather());
		theTree.addNode(node4);
		theTree.balancedTree(node4, (NodeAVL) node4.getFather());
		theTree.addNode(node5);
		theTree.balancedTree(node5, (NodeAVL) node5.getFather());
		theTree.addNode(node6);
		theTree.balancedTree(node6, (NodeAVL) node6.getFather());
		theTree.addNode(node7);
		theTree.balancedTree(node7, (NodeAVL) node7.getFather());
		theTree.addNode(node8);
		theTree.balancedTree(node8, (NodeAVL) node8.getFather());
		theTree.addNode(node9);
		theTree.balancedTree(node9, (NodeAVL) node9.getFather());
		theTree.addNode(node10);
		theTree.balancedTree(node10, (NodeAVL) node10.getFather());
		
		assertTrue(theRoot.getKey() == theTree.getRoot().getKey());
		assertTrue(node2.getKey() == theTree.getRoot().getLeft().getKey());
		assertTrue(node3.getKey() == theTree.getRoot().getRight().getKey());
		assertTrue(node9.getKey() == theTree.getRoot().getLeft().getLeft().getKey());
		assertTrue(node6.getKey() == theTree.getRoot().getRight().getRight().getKey());
		assertTrue(node8.getKey() == theTree.getRoot().getRight().getRight().getRight().getKey());
		assertTrue(node10.getKey() == theTree.getRoot().getLeft().getLeft().getLeft().getKey());
		assertTrue(node4.getKey() == theTree.getRoot().getLeft().getRight().getKey());
		assertTrue(node1.getKey() == theTree.getRoot().getRight().getLeft().getKey());
		assertTrue(node5.getKey() == theTree.getRoot().getRight().getRight().getLeft().getKey());
		assertTrue(node9.getKey() == theTree.getRoot().getLeft().getLeft().getRight().getKey());
	}

}
