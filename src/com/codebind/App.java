package com.codebind;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Christian12 on 19/01/2018.
 */
public class App {
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JTree tree1;
    private JButton button1;
    private JTextArea textArea1;
    private JButton button2;

    public static void main(String[] args){
        JFrame frame = new JFrame("Parser Antlr");
        frame.setContentPane(new App().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(700,600);
        frame.setVisible(true);

    }
}
