package packages;

import javax.swing.*;
import java.awt.*;

public class informationPage {

    public void create(JFrame frame) {
        Font newfont = new Font("Monospaced", Font.BOLD, 12);
        // Create the main panel
        JPanel panel = new JPanel();
        panel.setBackground(new Color(0xEEE8AA));
        panel.setBounds(0, 0, 600, 600);
        panel.setLayout(new BoxLayout(panel , BoxLayout.PAGE_AXIS));


        panel.add(Box.createRigidArea(new Dimension(350,0)));

        // Name Label and Text Field
        JLabel nameLabel = new JLabel("Name");
        nameLabel.setFont(newfont);
       

        JTextField nameField = new JTextField(15);


        // Age Label and Text Field
       JLabel ageLabel = new JLabel("Age");
        ageLabel.setFont(newfont);
 

        JTextField ageField = new JTextField(15);


        // Email Label and Text Field

         JLabel emailLabel = new JLabel("Email");
        emailLabel.setFont(newfont);
     
        JTextField emailField = new JTextField(15);


        // Software Familiarity Level

        JLabel levelLabel = new JLabel("Software Familiarity Level");
        levelLabel.setFont(newfont);

        JRadioButton level1 = new JRadioButton("Basic");
        level1.setFont(newfont);
        JRadioButton level2 = new JRadioButton("Intermediate");
        level2.setFont(newfont);
       
        JRadioButton level3 = new JRadioButton("Advanced");
        level3.setFont(newfont);
        
        JRadioButton level4 = new JRadioButton("Unfamiliar");
        level4.setFont(newfont);
       


        // Group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(level1);
        group.add(level2);
        group.add(level3);
        group.add(level4);

        // Next Page Button
        JButton nextButton = new JButton("Next page");
        nextButton.setFont(newfont);
        nextButton.addActionListener(e -> {
            // Remove current panel and move to Page2
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            questionsPage questionsPage = new questionsPage();
            questionsPage.create(frame);

            frame.revalidate();
            frame.repaint();
        });

        // Add components to the panel
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(levelLabel);
        panel.add(level1);
        panel.add(level2);
        panel.add(level3);
        panel.add(level4);
        panel.add(nextButton);

        // Add panel to the frame
        frame.add(panel);
    }
}