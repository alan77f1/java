/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.icon;

import java.awt.Container;
import javax.swing.*;
/**
 *
 * @author VanDu
 */
public class MainGUI extends JFrame {
    public MainGUI (String title) {
        super(title);
        
        JLabel label = new JLabel("HUTECH");
        
        Container con = getContentPane();
        
        con.add(label);
        setSize(300, 400);
        setResizable(false);
//        pack();
        setVisible(true);
    }
    
    public static void main(String[] args) {
        MainGUI gui = new MainGUI("Hello World!!!");
        
        
    }
}
