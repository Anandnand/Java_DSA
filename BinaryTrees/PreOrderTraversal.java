package com.kod.BinaryTrees;

public class PreOrderTraversal {
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
		public  Node treePreCode(int nodes[]) {
			idx++;
			if(nodes[idx]==-1) {
				return null ;
			}
			Node newNode=new Node(nodes[idx]);
			newNode.left=treePreCode(nodes);
			newNode.right=treePreCode(nodes);
			
			return newNode;
		}		
		
		public void preOrderTraversal(Node root) {
			if(root==null) {
				return;
			}
			System.out.print(root.data+" ");
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);	
		}
		
	}
	
	
	public static void main(String[] args) {
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree tree=new BinaryTree();
		Node root=tree.treePreCode(nodes);
        
        tree.preOrderTraversal(root);
        
        
	}

}
