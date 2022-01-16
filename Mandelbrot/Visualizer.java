import javax.swing.*;

public class Visualizer {
    /* instance variables */

    private JFrame visFrame;
    private JPanel visPanel;

    public Visualizer(HindmanVisualizer simulation) {

        /* Visualization Panel */
        visPanel = new VisualizationPanel(simulation.getDataset(),simulation.getColorPalette());
        visPanel.setPreferredSize(simulation.getDimensions());

        /* Build the GUI Frame */
        visFrame = new JFrame("Hindman Data Visualizer");
        visFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        visFrame.add(visPanel);
        visFrame.setResizable(false);
        visFrame.pack();
    }

    public void start() {
        visFrame.setVisible(true);
    }
}
