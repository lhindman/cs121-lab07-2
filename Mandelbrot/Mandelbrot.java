import java.awt.Color;
import java.awt.Dimension;

public class Mandelbrot implements HindmanVisualizer {
    /* Instance Variables */


    /* Constructor */



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
