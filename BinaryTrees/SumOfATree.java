package com.kod.BinaryTrees;


public class SumOfATree {
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
		
		public static int countOfNodes(Node root) {
			if(root==null) {
				return 0;
			}
			int lt=countOfNodes(root.left);
			int rt=countOfNodes(root.right);
			return (lt+rt)+1;
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
			//int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,7,-1,8,-1,-1};
			int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
			BinarySearchTree tree=new BinarySearchTree();
			Node root=tree.rootCode(nodes);
			System.out.println("the total  count of nodes is = "+tree.countOfNodes(root));

			 System.out.println("the sum of a tree is = "+tree.sum(root));
		}
}


