import javax.swing.*;
import java.awt.*;
import java.awt.event.*; // Needed for Action Listener

public class Window extends JFrame{

    private JPanel panel;               // Panel
    private JLabel messageLabel;        // Label
    private JTextField userNameField;   // Text Field
    private JButton loginButton;        // Button
    // Window Size
    final int WINDOW_WIDTH = 1400;
    final int WINDOW_HEIGHT = 850;

    // Constructor
    public Window(){

        // Set Title
        setTitle("Inventory Management System");

        // Set Size
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // Set Background Color
        setBackground(Color.BLACK);

        // Set Exit
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Build Panel
        buildPanel();

        // Add Panel
        add(panel);

        // Display Window
        setVisible(true);

    }

    private void buildPanel(){
        
        // Instructions Label
        messageLabel = new JLabel("Enter Name");

        // Text Field
        userNameField = new JTextField(15);

        // Button
        loginButton = new JButton("Login");

        // Add Action Listener
        loginButton.addActionListener(new LoginButtonListener());

        // Create JPanel
        panel = new JPanel();

        // Build Panel
        panel.add(messageLabel);
        panel.add(userNameField);
        panel.add(loginButton);
    }

    private class LoginButtonListener implements ActionListener{

        /*
            Executes when Login button is clicked.
        
        */

        public void actionPerformed(ActionEvent e){

            // Data
            String input = userNameField.getText();
            panel.setBackground(Color.RED);
            // Display Result
            JOptionPane.showMessageDialog(null, input);
        }
    }
}