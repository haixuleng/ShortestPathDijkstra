package dijkstra;

public class Edges {
	/*
	 *  This class define an edge type, which has an attribute called vertex and an attribute called length.
	 */
	
	int vertex;
	int edgeLength;
	public Edges(){
		vertex = 0;
		edgeLength = 0;
	}
	
	public void setVertex(int v){
		this.vertex = v;
	}
	
	public void setEdgeLength(int l){
		this.edgeLength = l;
	}
	
	public int getVertex(){
		return this.vertex;
	}
	
	public int getEdgeLength(){
		return this.edgeLength;
	}
	
}
