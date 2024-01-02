package com.kod.BinarySearchTrees;
import java.util.ArrayList;


public class PathRootToLeaf {
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
	public static void printPath(ArrayList<Integer> path) {
		for(int i=0;i<path.size();i++) {
			System.out.print(path.get(i)+"->");
		}
		System.out.println("null");
	}
	public static void pathFromRootToLeaf(Node root,ArrayList<Integer> path) {
		if(root==null) {
			return;
		}
		path.add(root.data);
		if(root.left==null && root.right==null) {
			printPath(path);
		}
		pathFromRootToLeaf(root.left,path);
		pathFromRootToLeaf(root.right,path);
		path.remove(path.size()-1);
		
	}
	public static Node mirror(Node root) {
		if(root==null) {
			return null;
		}
		Node leftMirror=mirror(root.left);
		Node rightMirror=mirror(root.right);
		
		root.left=rightMirror;
		root.right=leftMirror;
		
		return root;
		
	}
	public static void PreOrder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data+" ");
		inOrder(root.left);
		inOrder(root.right);
	}

	public static void main(String[] args) {
		int val[] = { 9, 3, 5, 7, 2, 1, 8, 4, 10, 11 };
		Node root = null;
		for (int i = 0; i < val.length; i++) {
			root = insert(root, val[i]);
		}
		inOrder(root);
		System.out.println();
		pathFromRootToLeaf(root,new ArrayList<>());
		System.out.println("the mirror image of BST tree is ");
		root=mirror(root);
		inOrder(root);
		System.out.println();
		PreOrder(root);
		

	}

}
