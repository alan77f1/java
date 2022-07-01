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
import java.awt.BorderLayout; 
import java.awt.Color; 
import java.awt.Container; 
import java.awt.Dimension; 
import java.awt.Font; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JPanel; 
public class BorderLayoutDemo extends JFrame{ 
    public BorderLayoutDemo(String title){ 
        setTitle(title); 
    } 
    public void doShow(){ 
        setSize(400,300); 
        setLocationRelativeTo(null); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        addControl(); 
        setVisible(true); 
    } 
    public void addControl(){ 
        JPanel pnBorder=new JPanel(); 
        pnBorder.setLayout(new BorderLayout()); 
        Font ft=new Font("Arial", Font.BOLD|Font.ITALIC, 25); 
        JPanel pnNorth=new JPanel(); 
        pnNorth.setBackground(Color.RED); 
        pnNorth.setPreferredSize(new Dimension(0, 50)); 
        JLabel lblTitleNorth=new JLabel("North"); 
        pnNorth.add(lblTitleNorth); 
        lblTitleNorth.setForeground(Color.WHITE); 
        lblTitleNorth.setFont(ft); 
        pnBorder.add(pnNorth,BorderLayout.NORTH); 
        JPanel pnSouth=new JPanel(); 
        pnSouth.setBackground(Color.RED); 
        pnSouth.setPreferredSize(pnNorth.getPreferredSize()); 
        JLabel lblTitleSouth=new JLabel("South"); 
        pnSouth.add(lblTitleSouth); 
        lblTitleSouth.setForeground(Color.WHITE);
         lblTitleSouth.setFont(ft); 
        pnBorder.add(pnSouth,BorderLayout.SOUTH); 
        JPanel pnWest=new JPanel(); 
        pnWest.setBackground(Color.BLUE); 
        pnWest.setPreferredSize(new Dimension(70, 0)); 
        JLabel lblTitleWest=new JLabel("West",JLabel.CENTER); 
        lblTitleWest.setFont(ft); 
        lblTitleWest.setForeground(Color.WHITE); 
        pnWest.setLayout(new BorderLayout()); 
        pnWest.add(lblTitleWest,BorderLayout.CENTER); 
        pnBorder.add(pnWest,BorderLayout.WEST); 
        JPanel pnEast=new JPanel(); 
        pnEast.setBackground(Color.BLUE); 
        pnEast.setPreferredSize(new Dimension(70, 0)); 
        JLabel lblTitleEast=new JLabel("East",JLabel.CENTER); 
        lblTitleEast.setFont(ft); 
        lblTitleEast.setForeground(Color.WHITE); 
        pnEast.setLayout(new BorderLayout()); 
        pnEast.add(lblTitleEast,BorderLayout.CENTER); 
        pnBorder.add(pnEast,BorderLayout.EAST); 
       
        JPanel pnCenter=new JPanel(); 
        pnCenter.setBackground(Color.YELLOW); 
        pnCenter.setLayout(new BorderLayout()); 
       
        JLabel lblTitleCenter=new JLabel("Center",JLabel.CENTER); 
        lblTitleCenter.setFont(ft); 
        pnCenter.add(lblTitleCenter,BorderLayout.CENTER); 
        pnBorder.add(pnCenter,BorderLayout.CENTER); 
        Container con=getContentPane(); 
        con.add(pnBorder); 
    } 
    public static void main(String[] args) { 
        BorderLayoutDemo bor=new BorderLayoutDemo("Demo BorderLayout"); 
        bor.doShow(); 
    } 
}