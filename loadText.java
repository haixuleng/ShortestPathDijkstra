package dijkstra;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files
public class loadText {
	/*
	 * load the data into a graph with the following format
	 * 1	80,982	163,8164	170,2620	145,648	200,8021
	 * this vertex \s linked vertex, length \s ...
	 */
	String fileToLoad;
	int length = 0;
	public loadText(String fileName) throws FileNotFoundException {
		fileToLoad = fileName;
		System.out.println(fileName);
		size();
	}
	
	public void size() throws FileNotFoundException {
		int size = 0;
		File myObj = new File(fileToLoad);
		Scanner myReader = new Scanner(myObj);
		while(myReader.hasNextLine()) {
			myReader.nextLine();
			size ++;
			//System.out.println(size);
		}
		length = size;
		System.out.println("Length of Input: " + length);
	}
	
	public ArrayList<ArrayList<Edges>> get() throws FileNotFoundException {
		ArrayList<ArrayList<Edges>> initData = new ArrayList<ArrayList<Edges>>(length);
		System.out.println(length);
		File myObj = new File(fileToLoad);
		Scanner myReader = new Scanner(myObj);
		while(length > 0){ // initialize the graph
			initData.add(new ArrayList<Edges>());
			length--;
		}
		int index = 0;
		while(myReader.hasNextLine()) {
			String[] data = myReader.nextLine().split("\\s");
			Boolean firstElementFlag = true;
			for(String edgeString : data){
				if(firstElementFlag){
					firstElementFlag = false;
					continue;
				}
				String[] edgeSplit = edgeString.split("\\,");
				Edges edge = new Edges();
				edge.setVertex(Integer.parseInt(edgeSplit[0]));
				edge.setEdgeLength(Integer.parseInt(edgeSplit[1]));
				initData.get(index).add(edge);
			}
			index++;
		}
		return initData;
	}
}
