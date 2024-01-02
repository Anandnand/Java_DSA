package com.kod.String;


import java.util.Scanner;

//IMMUTABLE STRINGS

//public class Strings {
//	public static void main(String[] args) {
//		String s1="Anand";
//		System.out.println(s1);
//		
//		
//		String s2=new String("Anand");
//	     System.out.println(s2);
//		
//		
//		char ch[]= {'A','n','a','n','d'};
//	     String s3=new String(ch);
//	     System.out.println(s3);
//	}
//
//


//COMPARING THE STRINGS   // INSIDE STRING POOL[NO DUPLICATES ARE ALLOWED]

//public class Strings {
//	public static void main(String[] args) {
//		String s1="Anand";
//		String s2="Anand";
//		if(s1==s2) {
//			System.out.println("Reference are equal");
//		}else {
//			System.out.println("references are not equal");
//		}
//		if(s1.equals(s2)) {
//			System.out.println("Strings are equal");
//		}else {
//			System.out.println("strings are not equal");
//		}	
//	}
//
//}

//INSIDE STRING POOL AND HEAP SEGMENTS

//public class Strings {
//	public static void main(String[] args) {
//		String s1="Anand";
//		String s2=new String("Anand");
//		if(s1==s2) {
//			System.out.println("Reference are equal");
//		}else {
//			System.out.println("References are not equal");
//		}
//		if(s1.equals(s2)) {
//			System.out.println("Strings are equal");
//		}else {
//			System.out.println("strings are not equal");
//		}	
//	}
//
//}

//INSIDE THE HEAP SEGMENTS [WHERE DUPLICATES ARE ALLOWED]

//public class Strings {
//	public static void main(String[] args) {
//		String s1=new String("Anand");
//		String s2=new String("Anand");
//		if(s1==s2) {
//			System.out.println("Reference are equal");
//		}else {
//			System.out.println("References are not equal");
//		}
//		if(s1.equals(s2)) {
//			System.out.println("Strings are equal");
//		}else {
//			System.out.println("strings are not equal");
//		}	
//	}
//
//}

//==

//public class Strings {
//	public static void main(String[] args) {
//		String s1="Rama";
//		String s2="Sita";
//		String s3="Rama"+"Sita";
//		String s4="Rama"+"Sita";
//		
//		if(s3==s4) {
//			System.out.println("Reference are equal");
//		}else {
//			System.out.println("References are not equal");
//		}
//		if(s3.equals(s4)) {
//			System.out.println("Strings are equal");
//		}else {
//			System.out.println("strings are not equal");
//		}	
//	}
//
//}

//EQUALS()

//public class Strings {
//	public static void main(String[] args) {
//		String s1="Rama";
//		String s2="Sita";
//		String s3=s1+s2;
//		String s4=s1+s2;
//		
//		if(s3==s4) {
//			System.out.println("Reference are equal");
//		}else {
//			System.out.println("References are not equal");
//		}
//		if(s3.equals(s4)) {
//			System.out.println("Strings are equal");
//		}else {
//			System.out.println("strings are not equal");
//		}	
//	}
//
//}


//equalsIgnoreCase()

//public class Strings{
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		String s1="Anand";
//		String s2="ANAND";
//		if(s1==s2) {
//			System.out.println("References are equal");
//		}else {
//			System.out.println("References are not equal");
//		}
//		
//		if(s1.equals(s2)){
//			System.out.println("Strings are equal");
//		}else {
//			System.out.println("Strings are not equal");
//		}
//		
//		if(s1.equalsIgnoreCase(s2)) {
//			System.out.println("Strings are equal");
//		}else {
//			System.out.println("Strings are not equal");
//		}
//		}
//		
////	}
//
//public class Strings{
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		StringBuffer s1=new StringBuffer("I hate u so much");
//	System.out.println(s1.capacity());
//	s1.append("I Love u so muchA");
//	System.out.println(s1.capacity());
//}
//}


//=====================================================================================================================================================================//

//MUTABLE STRINGS

//public class Strings{
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		StringBuffer sb=new StringBuffer("Rama");
//		System.out.println(sb);
//		sb.append("sita");
//		System.out.println(sb);
//		
//		StringBuilder sbl=new StringBuilder("kiccha");
//		System.out.println(sbl);
//		sbl.append("Sudeep");
//		System.out.println(sbl);
//		
//	}
//	
//}


//INBUILT METHOD IN A STRING CLASS

//public class Strings{
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		String s1=new String("pavan anand harsha");
//		String s2=s1.replace('a', 'h');
//		System.out.println(s2);
//		
//		String s3=new String("pavan anand harsha");
//		String s4=s3.replaceAll("pavan", "chandan");
//		System.out.println(s4);
//		
//		
//		System.out.println("====================================================================");
//	
//        String str1=new String("omkar");
//        String str2= str1.intern();
//        System.out.println(str2);
//        String str3="omkar";
//        if(str2==str3) {
//             System.out.println("References are equal");        
//        }else {
//        	System.out.println("References are not equal");
//        }
//        
//        System.out.println("==========================================================================");
//        
//        String st=("anandbhavan");
//       char arr[]=st.toCharArray();
//       System.out.println("the  character array is ");
//       int i=0;
//       do {
//    	   System.out.print(arr[i]+"|");
//    	   i++;
//	   }while(i<arr.length);
//	}
//	
//}
//
 
