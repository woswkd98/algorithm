package Graph;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph<T> {
    ArrayList<GraphNode<T>> nodes = new ArrayList<>();

    public Graph(int nodeSize) {
        for(int i =0; i < nodeSize; ++i) {
            this.nodes.add(new GraphNode<T>());
        }
    }

    GraphNode<T> getNode(int i) {
        return this.nodes.get(i);
    }

    void addEdge(int i1, int i2) {
        this.nodes.get(i1).getAdjList().push(i2);
    } 
    void addSingleEdge(int i1, int i2) {
        this.nodes.get(i1).getAdjList().push(i2);
        this.nodes.get(i2).getAdjList().push(i1);
    } 
}
