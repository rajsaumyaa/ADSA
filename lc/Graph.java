import java.util.*;
class Edge{
    int src;
    int dest;
    int weight;

    Edge(int s, int d, int w){
        this.src = s;
        this.dest= d;
        this.weight = w;
}
}
public class Graph{
    static void createGraph(ArrayList<Edge>[]Graph, int V){
        for(int i=0; i<V; i++){
            Graph[i] = new ArrayList<Edge>();
        }
        Graph[0].add(new Edge(0,1,5));
        Graph[1].add(new Edge(1,2,3));
        Graph[2].add(new Edge(2,3,4));
        Graph[2].add(new Edge(2,0,2));
    }
    public static void main(String[] args){
        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph, V);
        
        for (int i = 0; i < V; i++) {
            System.out.print("Vertex " + i + ":");
            for (Edge e : Graph[i]) {
                System.out.print(" -> (" + e.dest + ", weight: " + e.weight + ")");
            
        }}
    }
}

