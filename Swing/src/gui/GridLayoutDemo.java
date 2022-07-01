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
import java.awt.*;
import javax.swing.*;

public class GridLayoutDemo {

    JFrame f;

    GridLayoutDemo() {
        f = new JFrame("GridLayout Demo App");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.setLayout(new GridLayout(2, 3));
        //thiet lap 2 hang va 3 cot cho grid layout  
        f.setSize(300, 150);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutDemo();
    }
}
