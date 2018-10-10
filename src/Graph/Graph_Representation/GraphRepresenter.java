/*
* Graph representation by using adjacency list
* this is a java code for representing graph
*/

package Graph.Graph_Representation;
import java.util.LinkedList;

public class GraphRepresenter {

    static class Graph {
        int numOfVertices;                        // size or total number of vertices
        LinkedList<Integer> adjList[];

        Graph(int numOfVertices) {
            this.numOfVertices = numOfVertices;
            adjList = new LinkedList[numOfVertices]; // define the size of array by number of vertices

            // now create a new list for each vertex
            for (int i = 0; i < numOfVertices; i++)
                adjList[i] = new LinkedList<>();
        }
    }

    // add edge
    static void addEdge(Graph graph, int src, int dest) {
        graph.adjList[src].add(dest); // add edge from src to destination
        graph.adjList[dest].add(src); // because of undirected graph we net to make a connection from destination to src
    }

    // print the graph
    static void print(Graph graph) {
        for (int i = 0; i < graph.numOfVertices; i++) {
            System.out.println("Adjacency list of vartex "+ i);
            System.out.print("head");
            for (Integer node : graph.adjList[i])
                System.out.print(" -> "+node);
            System.out.println();
        }
    }

    // main method
    public static void main(String[] args) {
        int numOfNode = 5;

        // create an instance of Graph class
        Graph graph = new Graph(numOfNode);

        // connects edges
        addEdge(graph,0,1);
        addEdge(graph,0,4);
        addEdge(graph,1,2);
        addEdge(graph,1,3);
        addEdge(graph,2,3);
        addEdge(graph,3,4);
        addEdge(graph,4,1);

        // clling the print method to print the graph
        print(graph);
    }

}
