/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.icon;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author VanDu
 */
public class IconDemo extends JFrame {

	public IconDemo() {
		initComponents();
	}

	public void initComponents() {
		Container con = getContentPane();// BorderLayout
		JPanel centerPanel = new JPanel();// FlowLayout
		Border blackline = BorderFactory.createTitledBorder("Image demo");
		centerPanel.setBorder(blackline);
		JLabel iconLabel = new JLabel(new ImageIcon("./images/info.png"));
//        JLabel iconLabel = new JLabel("A Label is added");

		centerPanel.add(iconLabel);
		con.add(centerPanel, BorderLayout.CENTER);
	}

	public void doShow() {
		setTitle("Titled Border Demo");
//        pack();
		setSize(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		IconDemo icon = new IconDemo();

		icon.doShow();
	}
}
