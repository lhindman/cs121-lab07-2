import java.awt.Color;
import java.awt.Dimension;

/**
 * [Add your description here]
 * @author [Your Name Here]
 */
public class Mandelbrot implements HindmanVisualizer {
    /* Instance Variables (and constants) */


    /* Constructor */


    /* Private Helper Methods */


    /* Interface Methods */
	@Override
	public Color[] getColorPalette() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[][] getDataset() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension getDimensions() {
		// TODO Auto-generated method stub
		return null;
	}





    /* Driver */
    public static void main(String[] args) {
        Mandelbrot fractal = new Mandelbrot();
        Visualizer vis = new Visualizer(fractal);
        vis.start();
    }
}
