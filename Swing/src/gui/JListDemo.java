/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author VanDu
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JListDemo {

    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public JListDemo() {
        prepareGUI();
    }

    public static void main(String[] args) {
        JListDemo swingControlDemo = new JListDemo();
        swingControlDemo.showListDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("JList Demo");
        mainFrame.setSize(400, 200);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350, 100);
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void showListDemo() {
        headerLabel.setText("Control in action: JList");
        final DefaultListModel fruitsName = new DefaultListModel();
        fruitsName.addElement("Apple");
        fruitsName.addElement("Grapes");
        fruitsName.addElement("Mango");
        fruitsName.addElement("Peer");
        final JList fruitList = new JList(fruitsName);
        fruitList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        fruitList.setSelectedIndex(0);
        fruitList.setVisibleRowCount(3);
        JScrollPane fruitListScrollPane = new JScrollPane(fruitList);
        JButton showButton = new JButton("Show");
        showButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "";
                if (fruitList.getSelectedIndex() != -1) {
                    data = "Fruits Selected: " + fruitList.getSelectedValue();
                    statusLabel.setText(data);
                }
                statusLabel.setText(data);
            }
        });
        controlPanel.add(fruitListScrollPane);
        controlPanel.add(showButton);
        mainFrame.setVisible(true);
    }
}
