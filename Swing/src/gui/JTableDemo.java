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

public class JTableDemo {
	JFrame f;

	JTableDemo() {
		f = new JFrame("JTable Demo");
		String data[][] = { { "101", "Amit", "670000" }, { "102", "Jai", "780000" }, { "101", "Sachin", "700000" } };
		String column[] = { "ID", "NAME", "SALARY" };
		JTable jt = new JTable(data, column);
		jt.setBounds(30, 40, 200, 300);
		JScrollPane sp = new JScrollPane(jt);
		f.add(sp);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300, 150);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new JTableDemo();
	}
}
