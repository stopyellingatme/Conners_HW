package Graph;

import java.util.*;

class ConsoleGraph {

  int beginGraph() {
    Graph g = new Graph();
    Scanner input = new Scanner(System.in);

    System.out.println("How many verticies does the graph have?");
    int verticies = input.nextInt();

    ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>(
      verticies * verticies
    );

    for (int i = 0; verticies > i; ++i) {
      graph.add(new ArrayList<Integer>());
    }

    for (int i = 0; verticies > i; i++) {
      System.out.println("What is the capacity of vertex " + i + "?");
      int capacity = input.nextInt();

      graph.add(new ArrayList<Integer>(capacity));
      for (int j = 0; capacity > j; ++j) {
        int vertex = handleVertexQuestion(i, j, input);

        g.addEdge(graph, i, vertex);
      }
    }

    System.out.println("You just created this graph:");
    g.printGraph(graph);

    // Close input to prevent memory leaks!
    input.close();

    return 0;
  }

  private static int handleVertexQuestion(int i, int j, Scanner input) {
    int vertex = 0;
    if (j == 0) {
      System.out.println("Enter adjacent vertex greater than " + j);
      int idxInput = input.nextInt();
      if (idxInput < j + 1) {
        System.out.println(idxInput + " is too small. Start over.");
        input.close();
      } else {
        vertex = idxInput;
      }
    } else {
      System.out.println("Enter adjacent vertex greater than " + j);
      int idxInput = input.nextInt();
      if (idxInput < j + 1) {
        System.out.println(idxInput + " is too small. Start over.");
        input.close();
      } else {
        vertex = idxInput;
      }
    }
    return vertex;
  }

  public static void main(String[] args) {
    ConsoleGraph myGraph = new ConsoleGraph();
    System.exit(myGraph.beginGraph());
  }
}
