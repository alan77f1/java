package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldGUI {

    public static void main(String[] args) {
        JFrame myFrame = new JFrame("Hello World!");
        myFrame.setSize(300, 150); //kích thước JFrame 
        myFrame.setVisible(true);
        JLabel lbName = new JLabel();
        lbName.setText("Hello World!");
        myFrame.add(lbName);// thêm jLabel vào JFrame 
    }
}
