package com.kod.BinarySearchTrees;

public class Range {
	public static class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	public static Node insert(Node root,int val) {
		if(root==null) {
			 root=new Node(val);
			return root;
		}
		if(val>root.data) {
			root.right=insert(root.right,val);
		}else {
			root.left= insert (root.left,val);
		}
		return root;
	}
	
	public static void inorder(Node root) {
		if(root==null) {
			return ;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	
	public static void printrange(Node root,int k1,int k2) {
		if(root==null) {
			return;
		}
		if(root.data>k1 && root.data<k2) {
			printrange(root.left, k1, k2);
			System.out.print(root.data+" ");
			printrange(root.right,k1,k2);
		}else if(root.data<k1) {
			printrange(root.left,k1,k2);
		}else {
			printrange(root.right,k1,k2);
		}
	}
	
	public static void main(String[] args) {
		int val[]= {5,4,3,2,6,7,8,9};
		Node root=null;
		for(int i=0;i<val.length;i++) {
		root=insert(root,val[i]);
		}
		inorder(root);
		System.out.println();
		System.out.println("the range between k1 to k2 is ");
		printrange(root,3,8);
		
			
		
		
	}

}
