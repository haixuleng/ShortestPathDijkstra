package dijkstra;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class testDijkstra {
	public static void main(String[] args) throws FileNotFoundException{
		dijkstra dk = new dijkstra();
		dk.run();
		ArrayList<Vertex> S = dk.get();
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(7);
		l.add(37);
		l.add(59);
		l.add(82);
		l.add(99);
		l.add(115);
		l.add(133);
		l.add(165);
		l.add(188);
		l.add(197);
		for(Vertex u: S){
			if(l.contains(u.getIndex())){
				System.out.println("Vertex: " + u.getIndex() + ", distance: " + u.getD());
			}
		}
	}
}
