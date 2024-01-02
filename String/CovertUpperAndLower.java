package com.kod.String;

public class CovertUpperAndLower {
	public static String convertUpperLover(String str) {
		char[] ch = str.toCharArray();
		int mid = (ch.length) / 2;
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < ch.length; i++) {
			if (i < mid) {
				sb.append(Character.toLowerCase(ch[i]));
			} else {
				sb.append(Character.toUpperCase(ch[i]));
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String str = "pavan is a intelligent boy";
		System.out.println(convertUpperLover(str));

	}

}
