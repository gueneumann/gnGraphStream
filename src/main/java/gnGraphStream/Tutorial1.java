package gnGraphStream;

/**
 * From http://graphstream-project.org/doc/Tutorials/Getting-Started/
 * @author gune00
 *
 */

import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;

public class Tutorial1 {
	public static void main(String args[]) {
		Graph graph = new SingleGraph("Tutorial 1");


//		graph.addNode("A" );
//		graph.addNode("B" );
//		graph.addNode("C" );
		
		graph.setStrict(false);
		graph.setAutoCreate( true );
		
		graph.addEdge("AB", "A", "B");
		graph.addEdge("BC", "B", "C");
		graph.addEdge("CA", "C", "A");

		graph.display();


	}

}
