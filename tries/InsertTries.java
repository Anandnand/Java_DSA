package com.kod.tries;

public class InsertTries {
	public static class Node {
		Node children[] = new Node[26];
		boolean eow = false;

		Node() {
			for (int i = 0; i < 26; i++) {
				children[i] = null;
			}
		}
	}
	public static Node root=new Node();
	
	public static void insert(String word) {
		Node curr= root;
		for(int i=0;i<word.length();i++) {
			int idx=word.charAt(i)-'a';
			if(curr.children[idx]==null) {
				curr.children[idx]=new Node();
			}
			curr=curr.children[idx];
		}
		curr.eow=true;		
	}
	
	public static boolean search(String key) {
		Node curr= root;
		for(int i=0;i<key.length();i++) {
			int idx=key.charAt(i)-'a';
			if(curr.children[idx]==null) {
				return false;
			}
			curr=curr.children[idx];
		}
		return curr.eow=true;		
	}
	public static String remove(String key) {
        Node curr = root;
        StringBuilder foundWord = new StringBuilder();
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return null; // Word not found
            }
            foundWord.append(key.charAt(i));
            curr = curr.children[idx];
        }
        return curr.eow ? foundWord.toString() : null;
    }


	public static void main(String[] args) {
		String word[]= {"the","their","there","a","thief"};
		
		for(int i=0;i<word.length;i++) {
			insert(word[i]);
			
		}
		System.out.println(search("thief"));
		
        String result = remove("any");
        if (result != null) {
            System.out.println("Found word: " + result);
        } else {
            System.out.println("Word not found");
        }


	}

	
}
