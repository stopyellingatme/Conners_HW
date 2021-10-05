import java.util.LinkedList;
import java.util.Stack;

public class Graph {

  int vert;
  LinkedList<Integer> list[];

  public Graph(int vert) {
    this.vert = vert;
    list = new LinkedList[vert];
    for (int i = 0; i < vert; i++) {
      list[i] = new LinkedList<>();
    }
  }

  public void addEdge(int start, int end) {
    list[start].addFirst(end);
  }

  public void DFS(int start) {
    System.out.print("Traversal Output: ");
    boolean[] touched = new boolean[vert];
    Stack<Integer> stack = new Stack<Integer>();

    for (int idx = 0; vert > idx; idx++) {
      if (touched[start] == false) {
        stack.push(start);
        touched[start] = true;

        while (stack.isEmpty() == false) {
          int nodeIdx = stack.pop();
          System.out.print(nodeIdx + " ");
          LinkedList<Integer> nodeList = list[nodeIdx];

          for (int i = 0; i < nodeList.size(); i++) {
            int dest = nodeList.get(i);

            if (touched[dest] == false) {
              stack.push(dest);
              touched[dest] = true;
            }
          }
        }
      }
    }
    System.out.println();
  }

  public void printGraph() {
    for (int i = 0; i < vert; i++) {
      LinkedList<Integer> graphList = list[i];
      if (!graphList.isEmpty()) {
        System.out.print("Vertex: " + i + " touches Nodes: ");

        for (int j = 0; j < graphList.size(); j++) {
          System.out.print(graphList.get(j));
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Graph graph = new Graph(10);
    graph.addEdge(0, 3);
    graph.addEdge(0, 4);
    graph.addEdge(0, 8);

    graph.addEdge(1, 3);
    graph.addEdge(1, 5);

    graph.addEdge(2, 4);
    graph.addEdge(2, 7);
    graph.addEdge(2, 9);

    graph.addEdge(3, 4);
    graph.addEdge(3, 9);

    graph.addEdge(4, 7);

    graph.addEdge(5, 7);
    graph.addEdge(5, 8);

    graph.addEdge(6, 7);

    graph.printGraph();
    graph.DFS(4);
  }
}
