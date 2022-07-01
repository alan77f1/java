/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.icon;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author VanDu
 */
public class DemoGUI extends JFrame {

    public DemoGUI() {
        setTitle("Form Login Demo");
        Container cont = getContentPane();
        cont.setLayout(new BorderLayout());
        JLabel labelForm = new JLabel("ABC", JLabel.CENTER);
        cont.add(labelForm, BorderLayout.NORTH);
        JPanel input = new JPanel();

        JLabel usernameLabel = new JLabel("Username");
        JTextField usernameTextfield = new JTextField(10);
        JLabel passLabel = new JLabel("Password");
        JPasswordField password = new JPasswordField(10);
        JButton loginBtn = new JButton("Login");
        JButton btnCancel = new JButton("Cancel");
//        cont.add(loginBtn,BorderLayout.CENTER);
//        cont.add(password,BorderLayout.SOUTH);
//        cont.add(usernameLabel,BorderLayout.WEST);
//        cont.add(passLabel,BorderLayout.EAST);
        input.setLayout(new GridLayout(2, 2));
        input.add(usernameLabel);
        input.add(usernameTextfield);
        input.add(passLabel);
        input.add(password);
        //Nhom Nut...
        JPanel btnPanelGroup = new JPanel();
        btnPanelGroup.add(loginBtn);
        btnPanelGroup.add(btnCancel);
        //
        cont.add(input, BorderLayout.CENTER);
        cont.add(btnPanelGroup, BorderLayout.SOUTH);

        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameTextfield.getText();
                String password1 = password.getText();
                if (username.equals(password1)) {
                    JOptionPane.showConfirmDialog(null, "abc");
                } else {
                    JOptionPane.showMessageDialog(null, "Fail");
                }
            }
        });

        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usernameTextfield.setText("");
                password.setText("");
                usernameTextfield.updateUI();
                password.updateUI();
            }
        });
        //setSize(500, 200);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        DemoGUI demoTest = new DemoGUI();

    }

}
