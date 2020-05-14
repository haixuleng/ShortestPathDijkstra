package dijkstra;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class testLoadText {
	public static void main(String[] args) throws FileNotFoundException{
		System.out.println("Test loadText class");
		
		loadText lt = new loadText("data/Data.txt");
		ArrayList<ArrayList<Edges>> graph = lt.get();
		ArrayList<Edges> edgeList = graph.get(30); // vertex 31
		for(Edges edge : edgeList){
			System.out.println("Vertex -> " + edge.getVertex() + ", length -> " + edge.getEdgeLength());
		}
		
	}

}
