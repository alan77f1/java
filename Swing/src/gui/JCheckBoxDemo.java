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

public class JCheckBoxDemo {

    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public JCheckBoxDemo() {
        prepareGUI();
    }

    public static void main(String[] args) {
        JCheckBoxDemo swingControlDemo = new JCheckBoxDemo();
        swingControlDemo.showCheckBoxDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("JCheckBox Demo");
        mainFrame.setSize(400, 200);
        mainFrame.setLayout(new GridLayout(3, 1));
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

    private void showCheckBoxDemo() {
        headerLabel.setText("Control in action: CheckBox");
        final JCheckBox chkApple = new JCheckBox("Apple");
        final JCheckBox chkMango = new JCheckBox("Mango");
        final JCheckBox chkPeer = new JCheckBox("Peer");
        chkApple.setMnemonic(KeyEvent.VK_C);
        chkMango.setMnemonic(KeyEvent.VK_M);
        chkPeer.setMnemonic(KeyEvent.VK_P);

        chkApple.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
            	System.out.println("Checked: "+chkApple.isSelected());
                statusLabel.setText("Apple Checkbox: " + (e.getStateChange() == 1
                        ? "checked" : "unchecked"));
            }
        });
        chkMango.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                statusLabel.setText("Mango Checkbox: " + (e.getStateChange() == 1
                        ? "checked" : "unchecked"));
            }
        });
        chkPeer.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                statusLabel.setText("Peer Checkbox: " + (e.getStateChange() == 1
                        ? "checked" : "unchecked"));
            }
        });
        controlPanel.add(chkApple);
        controlPanel.add(chkMango);
        controlPanel.add(chkPeer);
        mainFrame.setVisible(true);
    }
}
