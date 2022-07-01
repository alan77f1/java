/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author VanDu
 */
public class ContactFormDemo extends JFrame {

    public ContactFormDemo(String title) {
        super(title);
        addComponents();
    }

    private void addComponents() {
        Container contentPane = getContentPane();
        JLabel hoTenJLabel = new JLabel("Họ tên: ");
        JTextField hoTenJTextField = new JTextField();
        JLabel diaChiJLabel = new JLabel("Địa chỉ: ");
        JTextField diaChiJTextField = new JTextField();
        JLabel noiDungJLabel = new JLabel("Nội dung: ");
        JTextArea noiDungJTextArea = new JTextArea();
        JButton submitJButton = new JButton("Gửi");
       
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(3,2));
        centerPanel.add(hoTenJLabel);
        centerPanel.add(hoTenJTextField);
        centerPanel.add(diaChiJLabel);
        centerPanel.add(diaChiJTextField);
        centerPanel.add(noiDungJLabel);
        centerPanel.add(noiDungJTextArea);
        
        contentPane.setLayout(new BorderLayout());
        contentPane.add(centerPanel, BorderLayout.CENTER);
        contentPane.add(submitJButton, BorderLayout.SOUTH);
    }

    public void doShow() {
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        ContactFormDemo box = new ContactFormDemo("Contact form Demo!");

        box.doShow();
    }
}
