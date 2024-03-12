package graph;

import java.util.LinkedList;

public class UndirectedGraph {

    private LinkedList<Integer>[] adj;
    private int V;
    private int E;

    private UndirectedGraph(int nodes) {
        this.V = nodes;
        this.E = 0;
        this.adj = new LinkedList[nodes];
        for (int v = 0; v < V; v++) {
            adj[v] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
        E++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(V + " vertices, " + E + " edges " + "\n");
        for (int v = 0; v < V; v++) {
            sb.append(v + ": ");
            for (int w : adj[v]) {
                sb.append(w + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        UndirectedGraph undirectedGraph = new UndirectedGraph(4);
        undirectedGraph.addEdge(0, 1);
        undirectedGraph.addEdge(1, 2);
        undirectedGraph.addEdge(2, 3);
        undirectedGraph.addEdge(3, 0);
        System.out.println(undirectedGraph);
    }
}
