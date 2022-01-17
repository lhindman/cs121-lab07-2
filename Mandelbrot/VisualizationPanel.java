import java.awt.*;
import javax.swing.*;

/**
 * This panel serves as a surface to visualize our data using the
 *   2d graphics package. Not an optimal solution, but it serves to
 *   demonstrate 2d arrays in CS121. :)
 * @author Luke Hindman
 */
@SuppressWarnings("serial")
public class VisualizationPanel extends JPanel {

    private int[][] dataset;
    private Color[] palette;

    public VisualizationPanel(int[][] dataset, Color[] palette) {
        this.dataset = dataset;
        this.palette = palette;

        if (this.palette == null) {
            this.palette = buildGrayScalePalette();
        }
    }
 
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D pen = (Graphics2D) g;

        for(int row = 0; row < this.dataset.length; row++) {
            for (int col = 0; col < this.dataset[row].length; col++) {
                int locationValue = this.dataset[row][col];
                
                Color locationColor;
                if (locationValue < this.palette.length) {
                    locationColor = this.palette[locationValue];
                } else {
                    locationColor = this.palette[palette.length-1];
                }
                
                Rectangle current = new Rectangle(col,row,1,1);
                pen.setColor(locationColor);
                pen.fill(current);
            }
        }
    }


    private Color[] buildGrayScalePalette() {
        Color[] palette = new Color[256];

        for (int i = 0; i < 256; i++) {
            palette[i] = new Color(255-i,255-i,255-i);
        }

        return palette;
    }

}
