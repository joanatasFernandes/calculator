package br.com.codeTech.vison;

import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;

public class Button extends JButton {

    public Button(String text, Color color){
        setFont(new Font("courier", Font.PLAIN, 30 ));
        setOpaque(true);
        setBackground(color);
        setForeground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
}
