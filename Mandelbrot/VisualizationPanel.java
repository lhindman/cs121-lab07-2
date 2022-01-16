import java.awt.*;
import javax.swing.*;

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
                Color locationColor = this.palette[locationValue];
                Rectangle current = new Rectangle(col,row,1,1);
                pen.setColor(locationColor);
                pen.fill(current);
            }
        }
    }


    private Color[] buildGrayScalePalette() {
        Color[] palette = new Color[1024];

        for (int i = 0; i < palette.length; i++) {
            int shade = i / 4;
            palette[i] = new Color(shade,shade,shade);
        }

        return palette;
    }
}
