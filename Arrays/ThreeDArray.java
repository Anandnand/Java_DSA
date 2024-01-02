//package com.kodnest.practise;
//import java.util.Scanner;
//public class ThreeDArray {
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int [][][]arr=new int[2][3][4];
//		for(int i=0;i<=arr.length-1;i++) {
//			for(int j=0;j<=arr[i].length-1;j++) {
//				for(int k=0;k<=arr[i][j].length-1;k++) {
//					System.out.println("Enter the marks of school "+i+"class "+j+"student "+k);
//					arr[i][j][k]=sc.nextInt();
//					
//				}
//			}
//		}
//		System.out.println("Array contents are......");
//		for(int i=0;i<=arr.length-1;i++) {
//			for(int j=0;j<=arr[i].length-1;j++) {
//				for(int k=0;k<=arr[i][j].length-1;k++) {
//					System.out.print(arr[i][j][k]+" ");
//				}
//				System.out.println();
//			}
//			System.out.println("-------------------------------------------------------------- ");
//		}
//
//	}
 //
//}
//
//package com.kodnest.practise;
//import java.util.Scanner;
//public class ThreeDArray {
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int [][][]arr=new int[3][][];
//		arr[0]=new int[3][];
//		arr[1]=new int[2][];
//		arr[2]=new int[4][];
//		
//		arr[0][0]=new int[3];
//		arr[0][1]=new int[4];
//		arr[0][2]=new int[2];
//		
//		arr[1][0]=new int[4];
//		arr[1][1]=new int[3];
//		
//		arr[2][0]=new int[2];
//		arr[2][1]=new int[3];
//		arr[2][2]=new int[1];
//		arr[2][3]=new int[2];
//		
//		for(int i=0;i<=arr.length-1;i++) {
//			for(int j=0;j<=arr[i].length-1;j++) {
//				for(int k=0;k<=arr[i][j].length-1;k++) {
//					System.out.println("Enter the marks of school "+i+"class "+j+"student "+k);
//					arr[i][j][k]=sc.nextInt();
//					
//				}
//			}
//		}
//		System.out.println("Array contents are......");
//		for(int i=0;i<=arr.length-1;i++) {
//			for(int j=0;j<=arr[i].length-1;j++) {
//				for(int k=0;k<=arr[i][j].length-1;k++) {
//					System.out.print(arr[i][j][k]+" ");
//				}
//				System.out.println();
//			}
//			System.out.println("------------------------------------------- ");
//		}
//
//	}

//}
package com.kod.Arrays;


import java.util.Scanner;
public class ThreeDArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int [][][]arr=new int[scan.nextInt()][][];
		System.out.println("Enter 2D length for every 1D");

		for(int i=0;i<=arr.length-1;i++){
		System.out.println("Enter 2D length for 1D "+i);
		arr[i]=new int[scan.nextInt()][];
		}

		System.out.println("Enter 3D length for every 1D and 2D");
        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr[i].length-1;j++){
               System.out.println("Enter 3D length for 1D "+i+"2D "+j);
        arr[i][j]=new int[scan.nextInt()];
        }
    }
				
          for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				for(int k=0;k<=arr[i][j].length-1;k++) {
					System.out.println("Enter the marks of school "+i+"class "+j+"student "+k);
					arr[i][j][k]=scan.nextInt();
					
				}
			}
		}
		System.out.println("Array contents are......");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				for(int k=0;k<=arr[i][j].length-1;k++) {
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println("------------------------------------------- ");
		}

	}
}