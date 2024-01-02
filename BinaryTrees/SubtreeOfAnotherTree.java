package com.kod.BinaryTrees;

public class SubtreeOfAnotherTree {
	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	
	public static void preOrder(Node root) {
		if(root==null) {
			return;
		}
		System.out.println(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public static void printSub(Node subtree) {
		if(subtree==null) {
			return;
		}
		System.out.println(subtree.data+" ");
		preOrder(subtree.left);
		preOrder(subtree.right);
	}

	
	public static boolean isIdentical(Node node, Node subtree) {
		if(node==null && subtree==null) {
			return true;	
		}else if(node==null || subtree==null || node.data!=subtree.data) {
			return false;
		}
		
		if (!isIdentical(node.left,subtree.left)) {
			return false;
		}
		if(!isIdentical(node.right,subtree.right)) {
			return false;
		}
		return true;
	}
	
	
	public static boolean isSubtree(Node root,Node subtree) {
		if(root==null) {
			return false;
		}
		if(root.data==subtree.data) {
			if(isIdentical(root,subtree)) {
			return true;	
			}
		}
		
		return isSubtree(root.left,subtree) || isSubtree(root.right,subtree); 
		
	}
	
	
	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.left.left=new Node(4);
	    root.left.right=new Node(5);
	    root.right=new Node(3);
	    root.right.right=new Node(6);
	    root.right.right.right=new Node(7);
	    System.out.println("the root is ");
	    preOrder(root);
	    
	  Node subtree=new Node(3);
	  subtree.right=new Node(6);
	  subtree.right.right=new Node(8);
	  System.out.println("the subtree is ");
	   printSub(subtree);
	  
	  System.out.println("the subtree is present in a another subtree is = "+isSubtree(root,subtree));

	  
}

}
