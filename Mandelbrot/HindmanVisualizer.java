import java.awt.Color;
import java.awt.Dimension;

public interface HindmanVisualizer {
    
    /**
     * Array of Color objects that define the color palette
     *    to use for visualizing the data set. The elements
     *    in this array must map to all the possible values
     *    stored in the associated two dimensional dataset.
     *  
     *    Therefore the size of this array MUST be at least 
     *    one more than the highest possible value in the
     *    dataset. For instance, if the highest possible 
     *    value is 255, than the size of this array must be
     *    256.
     * 
     * @return array of Color objects
     */
    public Color[] getColorPalette();
    
    /**
     * Two dimensional array of integer values in the range 
     *     of 0 - 255 (inclusive), representing the data to
     *     be visualized.
     * @return 2d array of simulation data
     */
    public int[][] getDataset();

    /**
     * Provide a Dimension object that describes the simulation
     *     width (numCols) and height (numRows). This should 
     *     coorespond to the dimensions of the 2d array of 
     *     simulation data.
     * @return dimensions of simulation
     */
    public Dimension getDimensions();

}