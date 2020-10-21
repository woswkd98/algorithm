package Graph;
import java.util.LinkedList;

public class GraphNode<T> {

    private int weight = 0;
    private T t; 
    private LinkedList<Integer> adjList = new LinkedList<Integer>();

	public GraphNode() {

	}

	public int getWeight() {
		return weight;
    }

    public T getT() {
        return this.t;
    }
    
    public LinkedList<Integer> getAdjList() {
        return this.adjList;
    }

     
}
