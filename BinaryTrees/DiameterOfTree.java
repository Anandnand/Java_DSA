package com.kod.BinaryTrees;


public class DiameterOfTree {
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
	
	static class Info{
		int height;
		int diameter;
		
	   Info(int height,int diameter){
		   this.height=height;
		   this.diameter=diameter;
	   }
	}

	
	static class BinaryTree{
		static int idx=-1;
		public static Node treePreCode(int nodes[]) {
			idx++;
			if(nodes[idx]==-1) {
				return null ;
			}
			Node newNode=new Node(nodes[idx]);
			newNode.left=treePreCode(nodes);
			newNode.right=treePreCode(nodes);
			
			return newNode;
		}		
		
		public static int height(Node root) {
			if(root==null) {
				return 0;
			}
			int leftTree=height(root.left);
			int rightTree=height(root.right);
			return Math.max(leftTree,rightTree)+1;
		}
		
		

	public static int diameter(Node root) {
		if(root==null) {
			return 0;
		}
		int lt=diameter(root.left);
	    int leftheight=height(root.left);
		int rt=diameter(root.right);
		int rightheight=height(root.right);
		int selfdiameter=leftheight+rightheight+1;
		return Math.max(selfdiameter,Math.max(lt,rt));
	}
	
		
	
	public static Info diameterlength(Node root) {
	if(root==null) {
		return new Info(0,0);
	}
	
		Info ldInfo=diameterlength(root.left);
		Info rdInfo=diameterlength(root.right);
		
       int diameter=Math.max(Math.max(ldInfo.diameter,rdInfo.diameter),ldInfo.height+rdInfo.height+1);
		int height=Math.max(ldInfo.height, ldInfo.height)+1;
		
		return  new Info(height,diameter);	
	}
}
	
	
		
	public static void main(String[] args) {
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,7,-1,8,-1,-1};
		BinaryTree tree=new BinaryTree();
		Node root=tree.treePreCode(nodes);
		System.out.println("The height of a tree is "+tree.height(root));
		System.out.println("the diameter of a tree is = "+tree.diameter(root));   
		Info result=tree.diameterlength(root);
		System.out.println(result.diameter);
	}


}
