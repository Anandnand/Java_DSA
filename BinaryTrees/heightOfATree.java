package com.kod.BinaryTrees;


public class heightOfATree {
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

	static class BinarySearchTree{
		static int idx=-1;
		public static Node rootCode(int nodes[]){
			idx++;
			if(nodes[idx]==-1) {
				return null;
			}
			Node newNode=new Node(nodes[idx]);
			newNode.left=rootCode(nodes);
			newNode.right=rootCode(nodes);
			return newNode;
		}
		public static void preOrderTraversal( Node root) {
			if(root==null) {
				return;
			}
			System.out.print(root.data+" ");	
			postOrderTraversal(root.left);	
	        postOrderTraversal(root.right);
		}

		public static void inOrderTraversal( Node root) {
			if(root==null) {
				return;
			}
			postOrderTraversal(root.left);	
			System.out.print(root.data+" ");	
	        postOrderTraversal(root.right);	
		}

	
	public static void postOrderTraversal( Node root) {
		if(root==null) {
			return;
		}
		postOrderTraversal(root.left);	
        postOrderTraversal(root.right);
		System.out.print(root.data+" ");	
	}
	
	
	public static int height(Node root) {
		if(root==null) {
			return 0;
		}
		int leftTree=height(root.left);
		int rightTree=height(root.right);
		return Math.max(leftTree,rightTree)+1;
	}
	
	public static int sum(Node root) {
		int leftTree=0;
		int rightTree=0;
		if(root==null) {
			return 0;
		}
		 leftTree +=sum(root.left);
		 rightTree +=sum(root.right);
		return leftTree+rightTree+root.data;
	}

	}
	
	
	public static void main(String[] args) {
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,7,-1,8,-1,-1};
		BinarySearchTree tree=new BinarySearchTree();
		Node root=tree.rootCode(nodes);
		System.out.println("the pre order binary tree is ");
        tree.preOrderTraversal(root);
        
        System.out.println();
        System.out.println("the in order binary tree is ");
		tree.inOrderTraversal(root);
		
		System.out.println();
		System.out.println("the post order binary tree is ");
		tree.postOrderTraversal(root);
		
		System.out.println();
		System.out.println("The height of a tree is "+tree.height(root));
		
	     System.out.println("the sum of a tree is = "+tree.sum(root));	
		
			}

}
