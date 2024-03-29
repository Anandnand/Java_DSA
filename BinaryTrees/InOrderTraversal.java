package com.kod.BinaryTrees;

public class InOrderTraversal {
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
	
	static class BinaryTree{
		static int idx=-1;
	public static Node code(int nodes[]) {
		idx++;
		if(nodes[idx]==-1) {
			return null;
		}
	Node newNode=new Node(nodes[idx]);
	newNode.left=code(nodes);
	newNode.right=code(nodes);
	return newNode;	
	}
	}
	
	public static void inOrderTraversal( Node root) {
		if(root==null) {
			return;
		}
		inOrderTraversal(root.left);
		System.out.println(root.data);
		inOrderTraversal(root.right);	
	}
		
		public static void main(String[] args) {
			int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
     BinaryTree tree=new BinaryTree();
       Node root=tree.code(nodes);
       System.out.println("root data is "+root.data);
       inOrderTraversal(root);
			
		}

}
