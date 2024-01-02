package com.kod.stack;

public class KStack {
	public static class NStack {
		int n, s, freespot;
		int arr[];
		int top[];
		int next[];

		public NStack(int N, int S) {
			n = N;
			s = S;
			arr = new int[n];
			top = new int[s];
			next = new int[n];

			freespot = 0;
			for (int i = 0; i < s; i++) {
				top[i] = -1;
			}

			for (int i = 0; i < n - 1; i++) {
				next[i] = next[i + 1];
			}
			next[n - 1] = -1;
		}

		public boolean push(int x, int m) {
			if (freespot == -1) {
				return false;
			}
			// 1st step initialize the index
			int index = freespot;

			// 2nd step update the freespot
			freespot = next[index];

			// 3rd step insert the data
			arr[index] = x;

			// 4th step update the next
			next[index] = top[m - 1];

			// 5th step update the top
			top[m - 1] = index;

			return true;

		}

		public int pop(int m) {
			if (top[m - 1] == -1) {
				System.out.println("Stack underflow");
				return -1;
			}
			// reverse of push operations
			int index = top[m - 1];

			top[m - 1] = next[index];

			next[index] = freespot;

			freespot = index;

			return arr[index];
		}
	}

	public static void main(String[] args) {
		int n = 10;
		int s = 3;

		NStack ks = new NStack(n, s);

		ks.push(15, 2);
		ks.push(45, 2);

		// Let us put some items in stack number 1
		ks.push(17, 1);
		ks.push(49, 1);
		ks.push(39, 1);

		// Let us put some items in stack number 0
		ks.push(11, 0);
		ks.push(9, 0);
		ks.push(7, 0);

		System.out.println("Popped element from stack 2 is " + ks.pop(2));
		System.out.println("Popped element from stack 1 is " + ks.pop(1));
		System.out.println("Popped element from stack 0 is " + ks.pop(0));
	}

}
