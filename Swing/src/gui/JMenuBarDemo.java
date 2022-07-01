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

public class JMenuBarDemo {

    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public JMenuBarDemo() {
        prepareGUI();
    }

    public static void main(String[] args) {
        JMenuBarDemo swingMenuDemo = new JMenuBarDemo();
        swingMenuDemo.showMenuDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("JMenuBar Demo");
        mainFrame.setSize(400, 200);
        mainFrame.setLayout(new GridLayout(3, 1));
        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350, 100);
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void showMenuDemo() {
        //Tao mot menu bar 
        final JMenuBar menuBar = new JMenuBar();
        //Tao cac menu 
        JMenu fileMenu = new JMenu("File");
        final JMenu aboutMenu = new JMenu("About");
        //tao cac item 
        JMenuItem openMenuItem = new JMenuItem("Open");
        openMenuItem.setActionCommand("Open");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        saveMenuItem.setActionCommand("Save");
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.setActionCommand("Exit");
        MenuItemListener menuItemListener = new MenuItemListener();
        openMenuItem.addActionListener(menuItemListener);
        saveMenuItem.addActionListener(menuItemListener);
        exitMenuItem.addActionListener(menuItemListener);
        final JCheckBoxMenuItem showWindowMenu
                = new JCheckBoxMenuItem("Show About", true);
        showWindowMenu.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (showWindowMenu.getState()) {
                    menuBar.add(aboutMenu);
                } else {
                    menuBar.remove(aboutMenu);
                }
            }
        });
        final JRadioButtonMenuItem showLinksMenu
                = new JRadioButtonMenuItem("Show Links", false);
        //Them item toi cac menu 
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(showWindowMenu);
        fileMenu.addSeparator();
        fileMenu.add(showLinksMenu);
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);
        //Them menu toi menubar 
        menuBar.add(fileMenu);
        menuBar.add(aboutMenu);
        //Them menubar toi frame 
        mainFrame.setJMenuBar(menuBar);
        mainFrame.setVisible(true);
    }

    class MenuItemListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            statusLabel.setText(e.getActionCommand() + " JMenuItem clicked.");
        }
    }
}
