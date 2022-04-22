package com.learning.binarytree;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BinaryTree {
	
	  Node root;
	  
	  private Node addRecursive(Node current, int value) {
		    if (current == null) {
		        return new Node(value);
		    }

		    if (value < current.value) {
		        current.left = addRecursive(current.left, value);
		    } else if (value > current.value) {
		        current.right = addRecursive(current.right, value);
		    } else {
		        // value already exists
		        return current;
		    }

		    return current;
		}
	  
	  public void add(int value) {
		    root = addRecursive(root, value);
		}
	  
	  public boolean containsNode(int value) {
		    return containsNodeRecursive(root, value);
		}
	  
	  public boolean containsNodeRecursive(Node current, int value) {
		    if (current == null) {
		        return false;
		    } 
		    if (value == current.value) {
		        return true;
		    } 
		    return value < current.value
		      ? containsNodeRecursive(current.left, value)
		      : containsNodeRecursive(current.right, value);
		}
	  
	  

	  public BinaryTree createBinaryTree() {
		    BinaryTree bt = new BinaryTree();

		    bt.add(6);
		    bt.add(4);
		    bt.add(8);
		    bt.add(3);
		    bt.add(5);
		    bt.add(7);
		    bt.add(9);

		    return bt;
		}
	  
//	  @Test
//	  public void givenABinaryTree_WhenAddingElements_ThenTreeContainsThoseElements() {
//	      BinaryTree bt = createBinaryTree();
//
//	      assertTrue(bt.containsNode(6));
//	      assertTrue(bt.containsNode(4));
//	   
//	      assertFalse(bt.containsNode(1));
//	  }
}
