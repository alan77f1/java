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
import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.*;

public class JRadioButtonGroupDemo extends JFrame implements ActionListener {

    JRadioButton rb1, rb2, rb3;
    JButton b;

    JRadioButtonGroupDemo() {
    	setLayout(new FlowLayout());
        rb1 = new JRadioButton("Male");
        rb1.setBounds(100, 20, 100, 30);
        rb2 = new JRadioButton("FeMale");
        rb3 = new JRadioButton("Unknown");
        rb2.setBounds(100, 50, 100, 30);
        ButtonGroup bg = new ButtonGroup();///
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
        b = new JButton("Click");
        b.setBounds(100, 100, 80, 30);
        b.addActionListener(this);
        add(rb1);
        add(rb2);
        add(rb3);
        add(b);
        setSize(300, 200);
        setVisible(true);
        setTitle("JRadioButton Group Demo");
    }

    public void actionPerformed(ActionEvent e) {
        if (rb1.isSelected()) {
            JOptionPane.showMessageDialog(this, "You are male");
        }
        if (rb2.isSelected()) {
            JOptionPane.showMessageDialog(this, "You are female");
        }
    }

    public static void main(String args[]) {
        new JRadioButtonGroupDemo();
    }
}
