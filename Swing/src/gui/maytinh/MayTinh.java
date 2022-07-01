package gui.maytinh;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class MayTinh extends JFrame {

	JTextField txtInput;

	public MayTinh() {

		setTitle("May tinh");

		txtInput = new JTextField();
		this.add(txtInput, BorderLayout.NORTH);
		this.add(center(), BorderLayout.CENTER);
		setVisible(true);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public JPanel center() {
		JPanel lbCenter = new JPanel(new GridLayout(6, 5, 10, 10));

		String[][] nameButton = { { "MC", "MR", "MS", "M+", "M-" }, { "Back", "CE", "C", "+-", "canBac" },
				{ "7", "8", "9", "/", "%" }, { "4", "5", "6", "*", "1/x" }, { "1", "2", "3", "-", " " },
				{ "0", ",", ".", "+", "=" }

		};
		for (int i = 0; i < nameButton.length; i++) {
			for (int j = 0; j < nameButton[i].length; j++) {
				lbCenter.add(new JButton(nameButton[i][j]));

			}
		}

		return lbCenter;
	}

	public static void main(String[] args) {
		new MayTinh();
	}
}
