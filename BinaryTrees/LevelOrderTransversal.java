package com.kod.BinaryTrees;
import java.util.*;

public class LevelOrderTransversal {
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
		static int idx;
	public	static Node basicTree(int nodes[]) {
		idx++;
		if(nodes[idx]==-1) {
			return null;
		}
      	Node newNode=new Node(nodes[idx]);
      	newNode.left=basicTree(nodes);
      	newNode.right=basicTree(nodes);
			return newNode;
		}
	
	public static void levelOrdertraversal(Node root) {
		if(root==null) {
			return ;
		}
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty()) {
			Node currNode=q.poll();
			System.out.print(currNode.data + " ");
			
			    if(currNode.left !=null) {
				q.add(currNode.left);
			    }
 
			   if(currNode.right !=null){
			   q.add(currNode.right);
			   }
			
			   if(q.peek()==null){
				   System.out.println();
				   q.poll();
			   if(!q.isEmpty()) {
				   q.add(null);
			   }
			  }
			 }
	}

	}
	
	public static void main(String[] args) {
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree tree=new BinaryTree();
		Node root=tree.basicTree(nodes);
		tree.levelOrdertraversal(root);
		
		
	}

}
