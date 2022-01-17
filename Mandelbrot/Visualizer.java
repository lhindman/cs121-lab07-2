import javax.swing.*;

/**
 *  Wrapper class to setup JFrame and visualization Panel 
 *  This is used to demonstrate interfaces and 2d arrays
 *  in CS121. Spring 2022.
 * 
 * @author Luke Hindman
 */

public class Visualizer {

    /* instance variables */
    private JFrame visFrame;
    private JPanel visPanel;

    /* Constructor */
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

    /* Other methods */
    public void start() {
        visFrame.setVisible(true);
    }
}
