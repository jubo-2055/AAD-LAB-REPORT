package breadth.first.search;

public class BFS {
	public static void main(String[] args) { 
		  
		  Graph graph = new Graph(6); 
		        graph.addEdge(0, 1); 
		        graph.addEdge(0, 2); 
		        graph.addEdge(1, 3); 
		        graph.addEdge(1, 4); 
		        graph.addEdge(2, 5); 
		        
		 
		        System.out.println("Breadth-First Search (BFS) traversal starting from vertex 0:"); 
		        graph.BFS(0); 
		 }
}