package com.kod.Arrays;
import java.util.Scanner;
//public class Arrays {
//public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter the rows and columns");
//	float[][]arr=new float[sc.nextInt()][sc.nextInt()];
//     for(int i=0;i<=arr.length-1;i++) {
//	for(int j=0;j<=arr.length-1;j++) {
//		System.out.println("Enter the player name");
//	    String n=sc.next();
//		System.out.println("Enter the heights of game"+i+" "+ n +" "+j);
//		arr[i][j]=sc.nextFloat();
//	}
//}
//     
//     System.out.println("Array contents are....");
//     for(int i=0;i<=arr.length-1;i++) {
//    		for(int j=0;j<=arr.length-1;j++) {
//    			System.out.print(arr[i][j]+" ");
//     }
//    		System.out.println("");
//   }
// }
//}
//
//

import java.util.Scanner;
//public class Array {
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		String []arr=new String[10];
//      System.out.println("Enter the array elements");
//		for(int i=0;i<=arr.length-1;i++) {
//			System.out.println("enter the names of the employee"+i);
//			arr[i]=sc.next();
//		}
//		System.out.println("array contents are");
//		for(int i=0;i<=arr.length-1;i++) {
//			System.out.print(arr[i]+" ");
//		}	
//	}
//
//}

//import java.util.Scanner;
//public class Array {
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		float []arr=new float[7];
//		System.out.println("Enter the array elements");
//		for(int i=0;i<=arr.length-1;i++) {
//			System.out.println("Enter the height of each players"+i);
//			arr[i]=sc.nextFloat();
//		}
//		System.out.println("array contents are");
//		for(int i=0;i<=arr.length-1;i++) {
//			System.out.print(arr[i]+" "+" ");
//		}	
//	}
//
//}


//import java.util.Scanner;
//public class Array {
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter people count");
//		boolean[]arr =new boolean[sc.nextInt()];
//		System.out.println("Enter the array elements");
//		for(int i=0;i<=arr.length-1;i++) {
//			System.out.println("is a person"+i+"married?");
//			arr[i]=sc.nextBoolean();
//		}
//		System.out.println("array contents are");
//		for(int i=0;i<=arr.length-1;i++) {
//			System.out.println("Person "+i+" married "+arr[i]);
//		}	
//	}
//
//}

//public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter the rows and columns");
//	float[][]arr=new float[sc.nextInt()][sc.nextInt()];
//   for(int i=0;i<=arr.length-1;i++) {
//	for(int j=0;j<=arr.length-1;j++) {
//		System.out.println("Enter the player name");
//	    String n=sc.next();
//		System.out.println("Enter the heights of game"+i+" "+ n +" "+j);
//		arr[i][j]=sc.nextFloat();
//	}
//}
//   
//   System.out.println("Array contents are....");
//   for(int i=0;i<=arr.length-1;i++) {
//  		for(int j=0;j<=arr.length-1;j++) {
//  			System.out.print(arr[i][j]+" ");
//   }
//  		System.out.println("");
// }
//}

class Arrays{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the hotel rows and dishes in columns");
		String [][]arr=new String[sc.nextInt()][sc.nextInt()];
		
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr.length-1;j++) {
				System.out.println("enter the hotel name");
				  String n=sc.next();
				  System.out.println("Enter the dishes avalaible in "+n);
				  arr[i][j]=sc.next();
			}
			
		}
		
		System.out.println("Array contents are");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr.length-1;j++) {
				  System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		}

	}
}

