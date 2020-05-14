package dijkstra;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class dijkstra {
	ArrayList<Vertex> S; //settled vertex
	ArrayList<Integer> SIndex;
	PriorityQueue<Vertex> Q;
	ArrayList<Vertex> G; // full graph
	ArrayList<ArrayList<Edges>> graph;
	
	// initialization
	public dijkstra() throws FileNotFoundException{
		loadText lt = new loadText("data/Data.txt");
		//loadText lt = new loadText("data/input_random_1_4.txt");
		graph = lt.get();
		G = new ArrayList<Vertex>();
		System.out.println("graph:" + graph.size() + "," + G.size());
		for(int i = 0; i < graph.size(); i ++){
			Vertex u = new Vertex();
			u.setD(Integer.MAX_VALUE);
			u.setIndex(i + 1);
			G.add(u);
		}
		S = new ArrayList<Vertex>();
		SIndex = new ArrayList<Integer>();
		Q = new PriorityQueue<Vertex>(graph.size(), new Vertex());
	}
	
	public void run(){
		Vertex s = new Vertex();
		s.setD(0);
		s.setIndex(1);
		//s.setPi(null);
		Q.add(s);
		while(S.size() != G.size()){
			Vertex u = Q.remove();
			S.add(u);
			System.out.println("Index:" + u.getIndex());
			SIndex.add(u.getIndex());
			relax(u);
		}
	}
	
	public void relax(Vertex u){
		int length = Integer.MAX_VALUE;
		ArrayList<Edges> edgeList = graph.get(u.getIndex() - 1);
		for(Edges edge : edgeList){
			if(!SIndex.contains(edge.getVertex())){ //vertex not settled
				Vertex v = new Vertex();
				v.setIndex(edge.getVertex());
				v.setD(Integer.MAX_VALUE);
				v.setPi(null);
				length = u.getD() + edge.getEdgeLength();
				//System.out.println("G:" + G.size());
				System.out.println("v index:" + v.getIndex());
				if(length < G.get(v.getIndex()-1).getD()){
					G.get(v.getIndex()-1).setD(length);
					v.setD(length);
					v.setPi(u); // not used actually
				}
				Q.add(v);
			}
		}
		
	}
	
	public ArrayList<Vertex> get(){
		return S;
	}
}
