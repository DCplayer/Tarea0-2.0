package com.codebind;

import javax.swing.JTree;

import ParMaterial.decafLexer;
import ParMaterial.decafParser;
import javafx.scene.layout.Pane;
import parser.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.misc.Utils;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Tree;
import org.antlr.v4.runtime.CharStreams;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

import static org.antlr.v4.runtime.tree.Trees.getNodeText;


public class App {
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JTree arbolSintactico;
    private JButton button1;
    private JTextArea textArea1;
    private JButton compilarButton;
    private JPanel PanelIngresoPrograma;
    private JPanel PanelArbol;
    private JPanel PanelCodigoIntermedio;
    private JPanel PanelCodigoEnsamblador;


    public App() {
        compilarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Lexer

                CharStream stream = CharStreams.fromString(textArea1.getText());
                decafLexer lexer = new decafLexer(stream);
                TokenStream streamDeToken = new CommonTokenStream(lexer);

                //Parser
                decafParser parser = new decafParser(streamDeToken);


                //Deteccion de Gramaticas ambiguas
                parser.getInterpreter().setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);
                ParseTree tree = parser.program();

                JTree arbolitoPro = createTree(tree, parser);
                System.out.println(arbolitoPro.toString());
                PanelArbol.add(arbolitoPro);
                System.out.println(tree.toStringTree(parser));


            }
        });
    }

    private JTree createTree(ParseTree tree, decafParser parser){
        DefaultMutableTreeNode root = traverseTree(tree, Arrays.asList(parser.getRuleNames()));
        return new JTree(root);
    }

    private DefaultMutableTreeNode traverseTree(Tree t, List<String> ruleNames) {
        String s = Utils.escapeWhitespace(getNodeText(t,  ruleNames), false);

        if (t.getChildCount() == 0) {
            return new DefaultMutableTreeNode(s);
        } else {
            DefaultMutableTreeNode tempParent = new DefaultMutableTreeNode(s);  //s solo es el nombre del nodo

            for(int i = 0; i < t.getChildCount(); ++i) {
                tempParent.add(traverseTree(t.getChild(i), ruleNames));
            }
            return tempParent;
        }
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("Parser Antlr");
        frame.setContentPane(new App().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(700,600);
        frame.setVisible(true);

    }

    private void createNodes(DefaultMutableTreeNode top) {
        DefaultMutableTreeNode category = null;
        DefaultMutableTreeNode book = null;

        category = new DefaultMutableTreeNode("Books for Java Programmers");
        top.add(category);

        category = new DefaultMutableTreeNode("Books for Java Implementers");
        top.add(category);

    }

    private void createUIComponents() {
        // all: place custom component creation code here

        tabbedPane1 = new JTabbedPane();
        PanelCodigoIntermedio = new JPanel();
        PanelArbol = new JPanel();
        PanelIngresoPrograma = new JPanel();
        PanelCodigoEnsamblador = new JPanel();

        tabbedPane1.add(PanelArbol);
        tabbedPane1.add(PanelCodigoEnsamblador);
        tabbedPane1.add(PanelCodigoIntermedio);
        tabbedPane1.add(PanelIngresoPrograma);
        arbolSintactico = new JTree();

    }
}
