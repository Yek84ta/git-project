package packages;

import javax.swing.*;
import java.awt.*;

public class thankYouPage {

    public void create(JFrame frame) {
        Font newfont = new Font("Monospaced", Font.BOLD, 35);
        // Create and configure the panel
        JPanel panel = new JPanel();
        panel.setBackground(new Color(0xEEE8AA));
        panel.setLayout(new BorderLayout());
        panel.setBounds(0, 0, 600, 600);

        // Create thank you label
       
        JLabel thankYouLabel = new JLabel("Thanks for your participation!");
        thankYouLabel.setFont(newfont);
        thankYouLabel.setHorizontalAlignment(SwingConstants.CENTER) ;


        // Add components to the panel
        panel.add(thankYouLabel , BorderLayout.CENTER);

        // Add panel to the frame
        frame.add(panel);


    }


}