/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.*;
import javax.swing.*;

public class BoxLayoutDemo extends JFrame {

    public BoxLayoutDemo(String title) {
        super(title);
    }

    public void doShow() {
        setSize(400, 100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addControl(); //gọi hàm AddControl 
        setVisible(true);
    }

    public void addControl() {
        JPanel pnBox = new JPanel();
        pnBox.setLayout(new BoxLayout(pnBox, BoxLayout.Y_AXIS));
        JButton btn1 = new JButton("BoxLayout");
        btn1.setForeground(Color.RED);
        Font font = new Font("Arial", Font.BOLD | Font.ITALIC, 15);
        btn1.setFont(font);
        pnBox.add(btn1);
        JButton btn2 = new JButton("Đối tượng A");
        btn2.setForeground(Color.BLUE);
        btn2.setFont(font);
        pnBox.add(btn2);
        JButton btn3 = new JButton("Đối tượng B");
        btn3.setForeground(Color.ORANGE);
        btn3.setFont(font);
        pnBox.add(btn3);
        Container con = getContentPane();
        con.add(pnBox);
    }

    public static void main(String[] args) {
        BoxLayoutDemo box = new BoxLayoutDemo("Demo BoxLayout");
        box.doShow();
    }
}
