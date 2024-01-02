package com.kod.BinarySearchTrees;

public class delete {
	public static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	public static Node insert(Node root, int val) {
		if (root == null) {
			root = new Node(val);
			return root;
		}
		if (val < root.data) {
			root.left = insert(root.left, val);

		} else {
			root.right = insert(root.right, val);
		}
		return root;
	}

	public static void inOrder(Node root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);

	}

	public static Node delete(Node root,int key) {
		if(key<root.data) {
			root.left=delete(root.left,key);
		}else if(key>root.data){
			root.right=delete(root.right,key);
		}else{
			//1st case for leaf node
			if(root.left==null && root.right==null) {
				return null;
			}
			
			//2nd case for single child node
			if(root.left==null) {
				return root.right;
			}else if(root.right==null) {
				return root.left;
			}
			
			//3rd case for two child nodes
			Node IS=inOrderSuccessor(root.right);
				root.data=IS.data;
				root.right=delete(root.right,IS.data);
			}
		return root;
	}
	public static Node inOrderSuccessor(Node root) {
		while(root.left!=null) {
		root=root.left;
		}
		return root;	
	}
	public static void main(String[] args) {
		int val[] = { 9, 3, 5, 7, 2, 1, 8, 4, 10, 11 };
		Node root = null;
		for (int i = 0; i < val.length; i++) {
			root = insert(root, val[i]);
		}
		inOrder(root);
		System.out.println();
		System.out.println("enter the value to be deleted");
		delete(root,7);
		inOrder(root);

	}
}
