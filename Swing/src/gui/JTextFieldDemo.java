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

public class JTextFieldDemo {

    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public JTextFieldDemo() {
        prepareGUI();
    }

    public static void main(String[] args) {
        JTextFieldDemo swingControlDemo = new JTextFieldDemo();
        swingControlDemo.showTextFieldDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Login form Demo");
        mainFrame.setSize(400, 150);
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

    private void showTextFieldDemo() {
        headerLabel.setText("Control in action: JTextField");
        JLabel namelabel = new JLabel("User ID: ", JLabel.RIGHT);
        JLabel passwordLabel = new JLabel("Password: ", JLabel.CENTER);
        final JTextField userText = new JTextField(6);
        final JPasswordField passwordText = new JPasswordField(6);
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	String username = userText.getText();
            	String password = new String(passwordText.getPassword());
            	if(username.isEmpty() || password.isEmpty()) {
//            		JOptionPane.showMessageDialog(null, "Nhap sai", "Error", JOptionPane.ERROR_MESSAGE);
            		int result = JOptionPane.showConfirmDialog(null, "Ban co muon xoa hay khong?");
            	}
                String data = "Username " + username;
                data += ", Password: " + password;
                statusLabel.setText(data);
            }
        });
        controlPanel.add(namelabel);
        controlPanel.add(userText);
        controlPanel.add(passwordLabel);
        controlPanel.add(passwordText);
        controlPanel.add(loginButton);
        mainFrame.setVisible(true);
    }
}
