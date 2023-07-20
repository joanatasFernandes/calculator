package br.com.codeTech.vison;

import javax.swing.*;
import java.awt.*;


public class Display extends JPanel {

    private final JLabel label;
    public Display()  {
        setBackground( new Color(49,49,50));
        label = new JLabel("123,56");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("courier", Font.PLAIN, 30 ));

        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));
        add(label);

    }
}
