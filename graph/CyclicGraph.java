package com.kod.graph;

import java.util.*;

import com.kod.graph.ConnectedGraph.Edge;

public class CyclicGraph {
	public static class Edge {
		int src;
		int des;
		int wt;

		public Edge(int s, int d, int w) {
			this.src = s;
			this.des = d;
			this.wt = w;
		}

	}

	public static void createList(ArrayList<Edge> graph[]) {
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<>();
		}
		graph[0].add(new Edge(0, 1, 1));
		graph[0].add(new Edge(0, 2, 1));

		graph[1].add(new Edge(1, 3, 1));

		graph[2].add(new Edge(2, 4, 1));

		graph[3].add(new Edge(3, 5, 1));

		graph[4].add(new Edge(4, 6, 1));

		graph[5].add(new Edge(5, 6, 1));

	}

	public static boolean cyclicDetect(ArrayList<Edge> graph[]) {
		boolean vis[] = new boolean[graph.length];
		for (int i = 0; i < graph.length; i++) {
			if (!vis[i] && cyclicDetectUtil(graph, i, -1, vis)) {
				return true;
			}
		}

		return false;
	}

	public static boolean cyclicDetectUtil(ArrayList<Edge> graph[], int curr, int par, boolean vis[]) {
		vis[curr] = true;
		for (int i = 0; i < graph[curr].size(); i++) {
			Edge e = graph[curr].get(i);
			// case1:
			if (!vis[e.des]) {
				if (cyclicDetectUtil(graph, e.des, curr, vis)) {
					return true;
				}
			}
			// case2:
			else if (e.des != par) {
				return true;
			}

		}
		return false;
	}

	public static void main(String[] args) {
		int v = 7;
		ArrayList<Edge> graph[] = new ArrayList[v];
		createList(graph);
	    for (int i = 0; i < graph.length; i++) {
	        System.out.print(i + ": ");
	        for (Edge edge : graph[i]) {
	            System.out.print("(" + edge.src + "->" + edge.des + ") ");
	        }
	        System.out.println();
	    }

	    System.out.print("if a graph contain cyclic node then = " + cyclicDetect(graph));

	}

}
