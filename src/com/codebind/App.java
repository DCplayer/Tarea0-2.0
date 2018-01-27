package com.codebind;

import org.antlr.v4.runtime.misc.Utils;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.Tree;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import static org.antlr.v4.runtime.tree.Trees.getNodeText;


public class App {
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JTree tree1;
    private JButton button1;
    private JTextArea textArea1;
    private JButton compilarButton;

    public App() {
        compilarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CharStream stream = new ANTLRInputStream(textArea1.getText());
                decafLexer lexer = new decafLexer(stream);
                TokenStream streamDeToken = new CommonTokenStream(lexer);
                decafParser parser = new decafParser(streamDeToken);
                ParseTree tree = parser.program();


                System.out.println(tree.toStringTree(parser));

            }
        });
    }

    private JTree traverseTree(Tree t, List<String> ruleNames) {
        String s = Utils.escapeWhitespace(getNodeText(t,  ruleNames), false);
        DefaultMutableTreeNode top = new DefaultMutableTreeNode(s);
        createNodes(top);
        JTree tree  = new JTree(top);

        if (t.getChildCount() == 0) {
            return tree;
        } else {
            JTree tempParent = tree;  //s solo es el nombre del nodo

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

        //original Tutorial
        book = new DefaultMutableTreeNode(new BookInfo
                ("The Java Tutorial: A Short Course on the Basics",
                        "tutorial.html"));
        category.add(book);



        category = new DefaultMutableTreeNode("Books for Java Implementers");
        top.add(category);



}
