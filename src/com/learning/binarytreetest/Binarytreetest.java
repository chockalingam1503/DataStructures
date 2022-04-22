package com.learning.binarytreetest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.learning.binarytree.BinaryTree;

public class Binarytreetest {

	@Test
	public void test() {
		
		 BinaryTree bt = new BinaryTree();
				 
		bt= bt.createBinaryTree();
		 
		 	      //assertTrue(bt.containsNode(666));
		 	      assertTrue(bt.containsNode(4));
		 	   
		 	      assertFalse(bt.containsNode(1));
	}

}
