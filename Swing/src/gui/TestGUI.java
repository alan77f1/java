package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestGUI {
 public static void main(String[] args) {
	JFrame f = new JFrame("Hello UTC2");
	
	JLabel l = new JLabel("K60");
	f.getContentPane().add(l);
	
//	f.pack();
	f.setSize(300, 400);
	f.setVisible(true);
}
}
