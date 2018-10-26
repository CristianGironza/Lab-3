package model;

import dataTrees.AVLTree;
import dataTrees.NodeAVL;
import dataTrees.RedBlackTree;

public class FIBA {

	private AVLTree  theFibaForPer; 
	
	private AVLTree theFibaForTs;
	
	private RedBlackTree theFibaForOrb; 
	
	private RedBlackTree theFibaForDerb;
	
	public < K, V> FIBA() {
		
		theFibaForPer.addNode( new NodeAVL<K, V>(null, null, null, null, null, 0) );
		theFibaForTs.addNode(new NodeAVL<K,V>(null, null, null, null, null, 0) );
	}
	
}
