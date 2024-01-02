package com.kod.BinarySearchTrees;


public class SortingBST {
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
		System.out.print(root.data + " ");
		inorder(root.right);
	}

	public static Node sorting(int val[], int si, int ei) {
		if ( si>ei) {
			return null;
		}

		int mid = (si + ei) / 2;
		Node root = new Node(val[mid]);
		root.left = sorting(val, si, mid - 1);
		root.right = sorting(val, mid + 1, ei);
		return root;
	}
	public static void Preorder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		Preorder(root.left);
		Preorder(root.right);
	}


	public static void main(String[] args) {
		int val[] = { 1,2,4,5,6,7,8,9,10 };
		Node root = null;
		for (int i = 0; i < val.length; i++) {
			root = insert(root, val[i]);
		}
		inorder(root);
		System.out.println();
		root=sorting(val,0,val.length-1);
        Preorder(root);
	}

}
