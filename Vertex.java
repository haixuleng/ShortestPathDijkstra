package dijkstra;

import java.util.Comparator;

public class Vertex implements Comparator <Vertex>{
	/*
	 * define a class of vertex
	 * v.d = shortest paths length to s
	 * v.pi = previous vertex along the shortest path to s
	 * Use the comparator to implement priority queue
	 */
	int d;
	Vertex pi;
	int index;
	public void setD(int distance){
		this.d = distance;
	}
	
	public int getD(){
		return this.d;
	}
	
	public void setIndex(int i){
		this.index = i;
	}
	
	public int getIndex(){
		return this.index;
	}
	
	public void setPi(Vertex vertex){
		this.pi = vertex;
	}
	
	public Vertex getPi(){
		return this.pi;
	}
	


	@Override
	public int compare(Vertex arg0, Vertex arg1) {
		// TODO Auto-generated method stub
		if (arg0.getD() < arg1.getD()) 
            return -1; 
        if (arg0.getD() > arg1.getD()) 
            return 1; 
        return 0; 
	} 

}
