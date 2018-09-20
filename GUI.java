package Portfolio;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// This class handles the visual interface (GUI) of the program
// The class will take in information and store it within an SQL Database


public class GUI extends JFrame implements ActionListener
{
    // variables

    private JFrame homeWindow;
    private int WIDTH = 800;
    private int HEIGHT = 600;

    private JPanel homePanel;

    private JButton addPayment;
    private JButton removePayment;
    private JButton closeApp;

    private String paymentName;
    private int paymentAmount;
    private int confirmationNumber;
    //private int paymentDate;



    // constructor
    public GUI()
    {
        initProgramWindow();

    }



    // Function to init / create GUI
    private void initProgramWindow()
    {
        // creation of JFrame
        homeWindow = new JFrame("Payment Storage");
        homeWindow.setSize(WIDTH, HEIGHT);
        homeWindow.setResizable(false);
        homeWindow.setVisible(true);
        homeWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homeWindow.setLocation(400,200);

        // add panel to JFrame
        homePanel = new JPanel();
        homeWindow.add(homePanel);

        // add a button
        addPayment = new JButton("Add Payment");
        addPayment.addActionListener(this);

        removePayment = new JButton("Remove Payment");
        removePayment.addActionListener(this);

        closeApp = new JButton("Close App");
        closeApp.addActionListener(this);

        homePanel.add(addPayment);
        homePanel.add(removePayment);
        homePanel.add(closeApp);



    }

    public void actionPerformed(ActionEvent e)
    {
        String action = e.getActionCommand();

        if ( action.equals("Add Payment"))
        {
            dataEntry();
        }

        else if (action.equals("Remove Payment"))
        {


        }

        else if (action.equals("Close App"))
        {

            System.exit(0);
        }

    }




    // Function that handles Data Entry
    private void dataEntry()
    {
        // TO DO Add additional payment information
        paymentName = JOptionPane.showInputDialog(null, "Enter Payment Name  ");



    }


}
