package gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JComboBoxDemo {
	public static void main(String[] args) {
		JFrame f = new JFrame("JComboBox Demo!!!");

		String[] tinh = { "TP. HCM", "Binh Duong", "Dong Nai" };
		JComboBox<String> tinhComboBox = new JComboBox<>(tinh);
		JButton okButton = new JButton("Show");
		okButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String tinhThanh = (String)tinhComboBox.getSelectedItem();
				JOptionPane.showMessageDialog(f, "Ban da chon: "+tinhThanh);
			}
		});
		Container c = f.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(tinhComboBox);
		c.add(okButton);

		f.setSize(400, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
