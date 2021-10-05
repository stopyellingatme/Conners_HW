package Graph;

import java.util.*;

public class Graph {

  // A utility function to add an edge in an undirected graph
  public void addEdge(ArrayList<ArrayList<Integer>> graph, int p1, int p2) {
    graph.get(p1).add(p2);
    graph.get(p2).add(p1);
  }

  // A utility function to print the adjacency list representation of graph
  public void printGraph(ArrayList<ArrayList<Integer>> graph) {
    for (int i = 0; graph.size() > i; ++i) {
      System.out.print("Vertex " + i + " ---> " + " [");

      ArrayList<Integer> points = graph.get(i);
      for (int j = 0; points.size() > j; ++j) {
        if (j != points.size() - 1) {
          System.out.print(points.get(j) + ", ");
        } else {
          System.out.print(points.get(j));
        }
      }
      if (points.size() == 0) {
        System.out.print("0");
      }
      System.out.print("]" + "\n");
    }
  }

  public static void main(String[] args) {}
}
