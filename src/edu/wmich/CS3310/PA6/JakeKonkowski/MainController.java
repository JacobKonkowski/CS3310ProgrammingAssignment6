package edu.wmich.CS3310.PA6.JakeKonkowski;

public class MainController {

	public static void main(String[] args)
	{

		int V = 9; // Number of vertices in graph
		int E = 14; // Number of edges in graph
		Graph graph = new Graph(V, E);

		// add edge 7-6
		graph.edge[0].src = 7;
		graph.edge[0].dest = 6;
		graph.edge[0].weight = 1;

		// add edge 8-2
		graph.edge[1].src = 8;
		graph.edge[1].dest = 2;
		graph.edge[1].weight = 2;
		
		// add edge 6-5
		graph.edge[2].src = 6;
		graph.edge[2].dest = 5;
		graph.edge[2].weight = 2;
		
		// add edge 0-1
		graph.edge[3].src = 0;
		graph.edge[3].dest = 1;
		graph.edge[3].weight = 4;
		
		// add edge 2-5
		graph.edge[4].src = 2;
		graph.edge[4].dest = 5;
		graph.edge[4].weight = 4;
		
		// add edge 8-6
		graph.edge[5].src = 8;
		graph.edge[5].dest = 6;
		graph.edge[5].weight = 6;
		
		// add edge 2-3
		graph.edge[6].src = 2;
		graph.edge[6].dest = 3;
		graph.edge[6].weight = 7;
		
		// add edge 7-8
		graph.edge[7].src = 7;
		graph.edge[7].dest = 8;
		graph.edge[7].weight = 7;
		
		// add edge 0-7
		graph.edge[8].src = 0;
		graph.edge[8].dest = 7;
		graph.edge[8].weight = 8;
		
		// add edge 1-2
		graph.edge[9].src = 1;
		graph.edge[9].dest = 2;
		graph.edge[9].weight = 8;
		
		// add edge 3-4
		graph.edge[10].src = 3;
		graph.edge[10].dest = 4;
		graph.edge[10].weight = 9;
		
		// add edge 5-4
		graph.edge[11].src = 5;
		graph.edge[11].dest = 4;
		graph.edge[11].weight = 10;
		
		// add edge 1-7
		graph.edge[12].src = 1;
		graph.edge[12].dest = 7;
		graph.edge[12].weight = 11;
		
		// add edge 3-5
		graph.edge[13].src = 3;
		graph.edge[13].dest = 5;
		graph.edge[13].weight = 14;

		// Function call
		graph.KruskalMST();
	}
}
