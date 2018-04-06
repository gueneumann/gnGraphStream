package gnGraphStream;

/**
 * http://graphstream-project.org/doc/Tutorials/Chart-Measures/
 */

import java.util.Random;

import org.graphstream.algorithm.measure.ChartMeasure.PlotException;
import org.graphstream.algorithm.measure.ChartSeries1DMeasure;

public class ChartMeasure {
	public static void main(String args[]) throws PlotException {
		ChartSeries1DMeasure m = new ChartSeries1DMeasure("my first measure");
		Random r = new Random();

		for (int i = 0; i < 100; i++)
			m.addValue(r.nextDouble() * 25);

		m.plot();
	}

}
