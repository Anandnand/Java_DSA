package com.kod.hashmaps;

import java.util.LinkedList;

public class Implementation {
	public static  class Hashing<K, V> {
		private class Node {
			K keys;
			V values;

			Node(K keys, V values) {
				this.keys = keys;
				this.values = values;
			}
		}

		private int n;
		private int N;
		private LinkedList<Node> bucket[];

		public Hashing() {
			this.N = 4;
			this.bucket = new LinkedList[N];
			for (int i = 0; i < N; i++) {
				this.bucket[i] = new LinkedList<>();
			}

		}

		private int hashFunc(K keys) {
			int hc = keys.hashCode();
			return Math.abs(hc) % N;
		}

		private int searchIndex(K keys, int bi) {
			LinkedList<Node> ll = bucket[bi];
			int di = 0;
			for (int i = 0; i < ll.size(); i++) {
				Node node = ll.get(i);
				if (node.keys .equals(keys)) {
					return di;
				}
				di++;
			}
			return -1;

		}

		private void rehash() {
			LinkedList<Node> oldBuck[] = bucket;
			bucket = new LinkedList[2 * N];
			N = 2 * n;
			for (int i = 0; i < bucket.length; i++) {
				bucket[i] = new LinkedList<>();
			}
			for (int i = 0; i < oldBuck.length; i++) {
				LinkedList<Node> ll = oldBuck[i];
				for (int j = 0; j < ll.size(); j++) {
					Node node = ll.remove();
					put(node.keys, node.values);
				}
			}

		}

		public void put(K keys, V values) {
			int bi = hashFunc(keys);
			int di = searchIndex(keys, bi);
			if (di != -1) {
				Node node = bucket[bi].get(di);
				node.values = values;
			} else {
				bucket[bi].add(new Node(keys, values));
				n++;
			}

			double lambda = (double) n / N;
			if (lambda > 2.0) {
				rehash();
			}

		}

		public boolean containsKey(K keys) {
			int bi = hashFunc(keys);
			int di = searchIndex(keys, bi);
			if (di != -1) {
				return true;
			} else {
				return false;
			}

		}

		public V remove(K keys) {
			int bi = hashFunc(keys);
			int di = searchIndex(keys, bi);
			if (di != -1) {
				Node node = bucket[bi].remove(di);
				return node.values;
			} else {
				return null;

			}
		}

		public V get(K keys) {
			int bi = hashFunc(keys);
			int di = searchIndex(keys, bi);
			if (di != -1) {
				Node node = bucket[bi].get(di);
				return node.values;
			} else {
				return null;

			}
		}
		public boolean isEmpty() {
			return n==0;
		}
	}

	public static void main(String[] args) {
		Hashing<String,Integer> h = new Hashing<>();
		h.put("India", 130);
		h.put("china", 125);
		h.put("africa", 120);
		h.put("usa", 100);
		h.put("japan", 90);

		System.out.println(h.get("china"));
		System.out.println(h.containsKey("china"));
		System.out.println(h.remove("china"));
		System.out.println(h.get("china"));



	}

}
