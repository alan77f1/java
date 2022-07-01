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

public class JPanelDemo {

    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;
    private JLabel msglabel;

    public JPanelDemo() {
        prepareGUI();
    }

    public static void main(String[] args) {
        JPanelDemo swingContainerDemo
                = new JPanelDemo();
        swingContainerDemo.showJPanelDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("JPanel container Demo");
        mainFrame.setSize(300, 200);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(150, 100);
        msglabel = new JLabel("JLabel is in a JPanel", JLabel.CENTER);
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void showJPanelDemo() {
        headerLabel.setText("Container in action: JPanel");
        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setLayout(new FlowLayout());
        panel.add(msglabel);
        controlPanel.add(panel);
        mainFrame.setVisible(true);
    }
}
