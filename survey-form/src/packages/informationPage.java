package packages;

import javax.swing.*;
import java.awt.*;

public class informationPage {

    public void create(JFrame frame) {
        // Create the main panel
        JPanel panel = new JPanel();
        panel.setBackground(new Color(0xEEE8AA));
        panel.setBounds(0, 0, 600, 600);
        panel.setLayout(new BoxLayout(panel , BoxLayout.PAGE_AXIS));


        panel.add(Box.createRigidArea(new Dimension(350,0)));

        // Name Label and Text Field
        JLabel nameLabel = new JLabel("اسم");
        JTextField nameField = new JTextField(15);


        // Age Label and Text Field
        JLabel ageLabel = new JLabel("سن");
        JTextField ageField = new JTextField(15);


        // Email Label and Text Field
        JLabel emailLabel = new JLabel("ایمیل");
        JTextField emailField = new JTextField(15);


        // Software Familiarity Level
        JLabel levelLabel = new JLabel("سطح آشنایی با نرم افزارهای مشابه");levelLabel.setBounds(50,90,100,20);

        JRadioButton level1 = new JRadioButton("مبتدی");
        JRadioButton level2 = new JRadioButton("متوسط");
        JRadioButton level3 = new JRadioButton("پیشرفته");
        JRadioButton level4 = new JRadioButton("بدون آشنایی");


        // Group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(level1);
        group.add(level2);
        group.add(level3);
        group.add(level4);

        // Next Page Button
        JButton nextButton = new JButton("صفحه بعد");

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