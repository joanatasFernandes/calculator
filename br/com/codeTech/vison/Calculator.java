package br.com.codeTech.vison;

import br.com.codeTech.vison.Display;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Calculator extends JFrame {

    public Calculator() {
        layoutOrganize();

        setSize(232, 322);
        setUndecorated(true); // Tira a barra de funcões da aplicação.
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //pack(); // Define o tamanho adequado com base no conteúdo
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void layoutOrganize() {
        setLayout(new BorderLayout());


        Display display = new Display();
        display.setPreferredSize(new Dimension(233, 60));
        add(display, BorderLayout.NORTH);

        KeyBoard keyBoard = new KeyBoard();
        add(keyBoard, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Calculator());
    }
}