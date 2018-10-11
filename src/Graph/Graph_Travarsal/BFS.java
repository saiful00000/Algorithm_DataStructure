package Graph.Graph_Travarsal;

import java.util.*;

public class BFS {
    public static List<Integer> visitedList = new ArrayList<>();

    private int numOfVertex;
    private LinkedList<Integer> adjList[];

    //constructor
    BFS(int numOfVertex) {
        this.numOfVertex = numOfVertex;
        adjList = new LinkedList[numOfVertex];
        for (int i = 0; i < numOfVertex; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    /*
    * add node and make connection or edge between two e nodes
    */
    void addEdge(int src, int des) {
        adjList[src].add(des);
        adjList[des].add(src);
    }

    /*
    * method to implement breath first search
    * travarse the given graph in BFS traversal manner
    * */
    void bFS(int src) {
        boolean[] isVisited = new boolean[numOfVertex];
        Queue<Integer> queue = new LinkedList<>();

        isVisited[src] = true;
        queue.add(src);

        while (queue.size() != 0) {
            src = queue.poll();
            System.out.print(src +" ");
            //visitedList.add(src);
            Iterator<Integer> itr = adjList[src].listIterator();
            while (itr.hasNext()) {
                int child = itr.next();
                if (!isVisited[child]) {
                    isVisited[child] = true;
                    queue.add(child);
                }
            }
        }
    }

    public static void main(String[] args) {
        BFS bfs = new BFS(5);
        bfs.addEdge(0, 1);
        bfs.addEdge(0, 4);
        bfs.addEdge(1, 2);
        bfs.addEdge(1, 3);
        bfs.addEdge(2, 3);
        bfs.addEdge(3, 4);
        bfs.bFS(0);
        //System.out.println(visitedList.size());
    }
}
