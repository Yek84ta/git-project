import javax.swing.*;
import packages.informationPage;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Font newfont = new Font("Monospaced", Font.BOLD, 35);
        // Create and configure the main frame

        JFrame frame = new JFrame("Survey form");
        frame.setFont(newfont);

        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout());


        // Create and configure the main panel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(new Color(0xEEE8AA));
        panel.setBounds(0, 0, 600, 600);


        // Create title label
        JLabel title = new JLabel("Survey form");
        title.setFont(newfont);
        title.setHorizontalAlignment(JLabel.CENTER);

        // Create start button
        JButton startButton = new JButton("Start!");
        startButton.setFont(newfont);
        


        // Add components to the panel
        panel.add(title,BorderLayout.CENTER);
        panel.add(startButton , BorderLayout.NORTH);

        // Add panel to the frame
        frame.add(panel);

        // Add action listener to the start button
        startButton.addActionListener(e -> {
            // Remove the current panel
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            // Load and display the first page
            informationPage informationPage = new informationPage();
            informationPage.create(frame);

            // Refresh the frame
            frame.revalidate();
            frame.repaint();

        });

        // Make the frame visible
        frame.setVisible(true);
    }
}