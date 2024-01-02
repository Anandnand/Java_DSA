package com.kod.BinarySearchTrees;

public class BuildBST {
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

	public static void inorder(Node root) {
		if (root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	
	public static boolean search(Node root,int key) {
		if(root==null) {
			return false;
		}
		
		if(root.data==key) {
			return true;
		}
		
		if(key<root.data) {
			return search(root.left,key);
		}else {
			return search(root.right,key);
		}
		
	}

	public static void main(String[] args) {
		int val[] = { 8, 2, 3, 4, 5, 1, 9, 7, 6 };
		Node root = null;
		for (int i = 0; i < val.length; i++) {
			root = insert(root, val[i]);
		}
		
		inorder(root);
		System.out.println();
		if(search(root,10)) {
			System.out.println("is found");
		}else {
			System.out.println("not found");
		}
	}

}
