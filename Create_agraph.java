import java.util.*;

//creating a graph by using the adjacency list
public class Create_agraph {
   static class Edge {
      int src;// source
      int dest;// destination
      int wt;// weight

      public Edge(int s, int d, int w) { // constructor of class Edge for initializing the datamembers
         this.src = s;
         this.dest = d;
         this.wt = w;
      }
   }

   public static void main(String args[]) {

      /*
       *         (5)
       *               0-------------1
       * / \
       * (1) / \(3)
       * / \
       * / \
       * 2 ------- 3
       * | (1)
       * |
       * (2) |
       * |
       * 4
       * 
       */

      int v = 5;
      // int arr[]=new arr[]

      ArrayList<Edge> graph[] = new ArrayList[v]; // null ->empty arraylist

      for (int i = 0; i < v; i++) {
         graph[i] = new ArrayList<>();
      }
      // 0 -vertex
      graph[0].add(new Edge(0, 1, 5));

      // 1 vertex
      graph[1].add(new Edge(1, 0, 5));
      graph[1].add(new Edge(1, 2, 1));
      graph[1].add(new Edge(1, 3, 3));

      // 2-vertex

      graph[2].add(new Edge(2, 1, 1));
      graph[2].add(new Edge(2, 3, 1));
      graph[2].add(new Edge(2, 4, 1));

      // 3-vertex
      graph[3].add(new Edge(3, 1, 3));
      graph[3].add(new Edge(3, 2, 1));

      // 4-vertex
      graph[4].add(new Edge(4, 2, 2));

      // 2's neighbors
      System.out.println("Neighbours of node 2");
      for (int i = 0; i < graph[2].size(); i++) {

         Edge e = graph[2].get(i); // src,dest,wt
         System.out.println(e.dest);

      }
      System.out.println("Neibours of node 3");
      for (int i = 0; i < graph[3].size(); i++) {
         Edge e = graph[3].get(i);
         System.out.println(e.dest);

      }

      System.out.println("Neibours of node 4");
      for (int i = 0; i < graph[4].size(); i++) {
         Edge e = graph[4].get(i);
         System.out.println(e.dest);
      }

      System.out.println("neighbours of node 1");
      for (int i = 0; i < graph[1].size(); i++) {
         Edge e = graph[1].get(i);
         System.out.println(e.dest);
      }

   }

}
