package Portfolio;
import javax.swing.*;

// This class handles the visual interface (GUI) of the program
// The class will take in information and store it within an SQL Database


public class GUI extends JFrame
{
    // variables

    private JFrame homeWindow;
    private int WIDTH = 800;
    private int HEIGHT = 600;

    private JPanel homePanel;



    // constructor
    public GUI()
    {
        initProgramWindow();

    }



    // Function to init
    private void initProgramWindow()
    {
        homeWindow = new JFrame("Payment Storage");
        homeWindow.setSize(WIDTH, HEIGHT);
        homeWindow.setResizable(false);
        homeWindow.setVisible(true);
        homeWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }


}
