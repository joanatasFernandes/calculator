package br.com.codeTech.vison;

import javax.swing.*;
import java.awt.*;

public class KeyBoard extends JPanel {
    private final Color COLOR_CINZA_ESCURO = new Color(68,68,68);
    private final Color COLOR_CINZA_CLARO = new Color(99,99,99);
    private final Color COLOR_LARANJA = new Color(242,163,60);
    public KeyBoard(){
        setLayout(new GridLayout(5,4));

        add(new Button("AC", COLOR_CINZA_ESCURO));
        add(new Button("+/-", COLOR_CINZA_ESCURO));
        add(new Button("%", COLOR_CINZA_ESCURO));
        add(new Button("/", COLOR_LARANJA));

        add(new Button("7", COLOR_CINZA_CLARO));
        add(new Button("8", COLOR_CINZA_CLARO));
        add(new Button("9", COLOR_CINZA_CLARO));
        add(new Button("*", COLOR_LARANJA));

        add(new Button("7", COLOR_CINZA_CLARO));
        add(new Button("8", COLOR_CINZA_CLARO));
        add(new Button("9", COLOR_CINZA_CLARO));
        add(new Button("*", COLOR_LARANJA));

        add(new Button("7", COLOR_CINZA_CLARO));
        add(new Button("8", COLOR_CINZA_CLARO));
        add(new Button("9", COLOR_CINZA_CLARO));
        add(new Button("*", COLOR_LARANJA));

        add(new Button("7", COLOR_CINZA_CLARO));
        add(new Button("8", COLOR_CINZA_CLARO));
        add(new Button("9", COLOR_CINZA_CLARO));
        add(new Button("*", COLOR_LARANJA));
    }
}
