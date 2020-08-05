package graphs;
import java.util.*;
class GraphImp
{
	HashMap<Integer, HashSet<Integer>> graph = new HashMap<>(); //Structure created
	void addVertex(int data)
	{
		if(graph.containsKey(data))
		{
			System.out.println("Error: Vertex "+data+" already Exists");
			return;
		}
		graph.put(data,new HashSet<>());
	}
	void addEdge(int start, int end)
	{
		graph.get(start).add(end);
	}
	void print()
	{
		System.out.println("Vertices are: "+graph.keySet());
		for(Integer x:graph.keySet())
		{
			System.out.print("Neighbours of "+x+" are: ");
			System.out.println(graph.get(x));//Printing the set containing neighbours
		}
	}
}
public class GraphSM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphImp g = new GraphImp();
		g.addVertex(0);
		g.addVertex(1);
		g.addVertex(2);
		g.addVertex(3);
		g.addVertex(4);
		g.addEdge(0, 1);
		g.addEdge(0, 1); //Duplicate neighbour problem
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(3, 4);
		g.addVertex(0);
		g.print();
	}

}